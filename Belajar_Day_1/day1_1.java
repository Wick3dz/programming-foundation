public class day1_1 {
    //statically typed
    public static void main (String[] args){
/*      String name = "Budi";
        int age = 20;
        final int MIN_AGE = 21;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Min eligible age: " + MIN_AGE);
        */
        // int a = 10;
        // int b = 3;
        // System.out.println(a + b);
        // System.out.println(a - b);
        // System.out.println(a * b);
        // System.out.println((double)a / b); // harus di casting biar jadi double
        String nama = "Dhimas";
        int age = 22;
        // int salary = 4000000;

        final int MIN_AGE = 21;
        // final int MIN_SALARY = 3000000;

        // System.out.println(age >= MIN_AGE);
        // System.out.println(salary >= MIN_SALARY);
        // //PERHATIKAN DI JAVA "AND" ==> &&
        // System.out.println(age >= MIN_AGE && salary >= MIN_SALARY);

        if (age >= MIN_AGE){
            System.out.println(nama + " is eligible by age");
        } else {
            System.out.println("Not eligible by age");
        }
        // IF ONE LINER
        System.out.println(age >= MIN_AGE ? nama + " is eligible by age": nama + " is not eligible by age");
    }
}