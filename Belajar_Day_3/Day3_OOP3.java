public class Day3_OOP3{
    public static void main(String[] args) {
        Customerr customer1 = new Customerr("Rina",27, 10000000, 3000000);
        customer1.showSummary();
        double dbr1 = customer1.hitungBDR();
        System.out.println("DBR: " + dbr1 + "%");
    }
}

class Customerr {
        String name;
        int age;
        double salary;
        float existingLoan;

        //constructors
        public Customerr (String name, int age, double salary, float existingLoan){
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

        void showSummary(){
            System.out.println("NAMA: " + this.name);
            System.out.println("AGE: " + this.age);
            System.out.println("SALARY: " + this.salary);
            System.out.println("EXISTING LOAN: " + this.existingLoan);
            //System.out.println("DBR: " + hitungBDR() + "%");
            
    } 
}
