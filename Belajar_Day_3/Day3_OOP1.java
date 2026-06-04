public class Day3_OOP1{
    public static void main(String[] args) {
        Customerr customer1 = new Customerr("Rina",27, 8000000);
        System.out.println(customer1.name);
        System.out.println(customer1.age);
        System.out.println(customer1.salary);
    }
}
class Customerr {
        String name;
        int age;
        double salary;

        public Customerr (String name, int age, double salary){
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

    }