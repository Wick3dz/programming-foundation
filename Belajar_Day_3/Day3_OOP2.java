public class Day3_OOP2{
    public static void main(String[] args) {
        Customer customer1 = new Customer("Rina",27, 8000000);
        customer1.showSummary();
    }
}

class Customer {
        String name;
        int age;
        double salary;

        public Customer (String name, int age, double salary){
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        void showSummary(){
            System.out.println("NAMA: " + this.name);
            System.out.println("AGE: " + this.age);
            System.out.println("SALARY: " + this.salary);
    } 
}
