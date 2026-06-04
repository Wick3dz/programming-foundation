package Model_Day_4;

public class Customer2 {
        public String name;
        public int age;
        public double salary;
        public float existingLoan;

        //constructors
        public Customer2 (String name, int age, double salary, float existingLoan){
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

