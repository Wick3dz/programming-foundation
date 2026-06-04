import java.util.InputMismatchException;
import java.util.Scanner;

public class Day2_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter age: ");
            int age = scan.nextInt();
            System.out.println("Next year: " + (age + 1));
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid number");// TODO: handle exception
        }
        scan.close();
    }
}
