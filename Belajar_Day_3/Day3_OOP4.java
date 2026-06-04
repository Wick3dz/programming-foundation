
public class Day3_OOP4{
    public static void main(String[] args) {
        Customer customer1 = new Customer("Rina",27, 10000000, 3000000);
        customer1.showSummary();
        double dbr1 = customer1.hitungBDR();
        System.out.println("DBR: " + dbr1 + "%");
        
        //karena ga pake static, harus new
        //biar bisa buat object, jangan pakai static
        RiskAssessor risk1 = new RiskAssessor();
        String decision = risk1.assess(customer1);
        System.out.println(decision);
    }
}

class Customer {
        String name;
        int age;
        double salary;
        float existingLoan;

        //constructors
        public Customer (String name, int age, double salary, float existingLoan){
            this.name = name;
            this.age = age;
            this.salary = salary;
            this.existingLoan = existingLoan;
        }

        //behaviour/actions/method
        double hitungBDR(){
            double dbr = (this.existingLoan/this.salary) * 100;
            return dbr;
        }

        public void showSummary(){
            System.out.println("NAMA: " + this.name);
            System.out.println("AGE: " + this.age);
            System.out.println("SALARY: " + this.salary);
            System.out.println("EXISTING LOAN: " + this.existingLoan);
            //System.out.println("DBR: " + hitungBDR() + "%");
            
    } 
}

class RiskAssessor{
    public String assess(Customer customer){
        String decision;
        if(customer.age < 21){
            decision = "Not eligible";
        } else if (customer.salary >= 8000000){
            decision = "Eligible";
        } else if (customer.salary >= 3000000){
            decision = "Manual review";
        } else {
            decision = "Not eligible";
        }
        return decision;
    }
}
