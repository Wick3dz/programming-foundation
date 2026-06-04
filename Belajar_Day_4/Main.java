package Belajar_Day_4;
import java.util.ArrayList;
import java.util.LinkedHashMap;

import Model_Day_4.Customer2;
import Model_Day_4.ReadCSV;
import Model_Day_4.RiskAssessor;

public class Main {
    public static void displayResult(String nama, String decision) {
        System.out.println(nama + " is " + decision);
    }

    public static void printSum(LinkedHashMap<String, Integer> summary) {
        System.out.println("Summary: ");
        System.out.println(summary);
    }
    public static LinkedHashMap<String, Integer> summary (ArrayList<Customer2> custList){
        LinkedHashMap<String, Integer> summary = new LinkedHashMap<>();
        summary.put("Eligible", 0);
        summary.put("Not Eligible", 0);
        summary.put("Manual Review", 0);

        return summary;
    }

    public static void updateSummary(LinkedHashMap<String, Integer> summary, String decision){
        summary.put(decision, summary.get(decision) + 1);
    }
    
    public static void main(String[] args) {
        
        if (args.length < 1){
            System.out.println("Usage : java ClassCustomer <filename>");
            return;
        }
        
        String filename = args[0];

        ReadCSV read = new ReadCSV();
        ArrayList<Customer2> custList = read.processCSVFiles(filename);

        RiskAssessor risk1 = new RiskAssessor();
        
        LinkedHashMap<String, Integer> summary = summary(custList);
        
        for (Customer2 customer : custList) {
        String decision = risk1.assess(customer);
        displayResult(customer.name,decision);
        updateSummary(summary, decision);
        }

        printSum(summary);
    }
}
//karena ga pake static, harus new
//biar bisa buat object, jangan pakai static
// Customer customer1 = new Customer("Rina",27, 10000000, 3000000);
// customer1.showSummary();
// double dbr1 = customer1.hitungBDR();
// System.out.println("DBR: " + dbr1 + "%");

// class ReadCSV {
//     public static ArrayList<Customer2> processCSVFiles(String filename){
//     ArrayList<Customer2> customers = new ArrayList<>();    
//     try{
//         BufferedReader reader = new BufferedReader(
//             new FileReader(filename)
//         );
//         String line;

//         reader.readLine();

//         while ((line = reader.readLine()) != null){
//             String [] data = line.split(",");
//             String name = data [0];
//             int age = Integer.parseInt(data[1]);
//             double salary = Double.parseDouble(data[2]);

//             Customer2 cust = new Customer2(name, age, salary, age);
//             customers.add(cust);

//         }
//         reader.close();
//     } catch (IOException e){
//         System.out.println("error");
//     }
//     return customers;
// }
// }


// class Customer2 {
//         String name;
//         int age;
//         double salary;
//         float existingLoan;

//         //constructors
//         public Customer2 (String name, int age, double salary, float existingLoan){
//             this.name = name;
//             this.age = age;
//             this.salary = salary;
//             this.existingLoan = existingLoan;
//         }

//         //behaviour/actions/method
//         double hitungBDR(){
//             double dbr = (this.existingLoan/this.salary) * 100;
//             return dbr;
//         }

//         public void showSummary(){
//             System.out.println("NAMA: " + this.name);
//             System.out.println("AGE: " + this.age);
//             System.out.println("SALARY: " + this.salary);
//             System.out.println("EXISTING LOAN: " + this.existingLoan);
//             //System.out.println("DBR: " + hitungBDR() + "%");
            
//     } 
// }

// class RiskAssessor{
//     public String assess(Customer2 customer){
//         String decision;
//         if(customer.age < 21){
//             decision = "Not eligible";
//         } else if (customer.salary >= 8000000){
//             decision = "Eligible";
//         } else if (customer.salary >= 3000000){
//             decision = "Manual review";
//         } else {
//             decision = "Not eligible";
//         }
//         return decision;
//     }
// }
