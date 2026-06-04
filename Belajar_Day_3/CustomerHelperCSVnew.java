import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CustomerHelperCSVnew {
    public static void processCSVFiles(String filename){
    try{
        BufferedReader reader = new BufferedReader(
            new FileReader(filename)
        );
        String line;

        reader.readLine();

        while ((line = reader.readLine()) != null){
            String [] data = line.split(",");
            String name = data [0];
            int age = Integer.parseInt(data[1]);
            double salary = Double.parseDouble(data[2]);

            String decision = CustomerHelperCSVnew.cekCustomer(age, salary);
            CustomerHelperCSVnew.displayResult(name,decision);
        }
    } catch (IOException e){
        System.out.println("error");
    }
    }
    public static boolean tanyaLanjut(Scanner scan) {
        System.out.print("Apakah lanjut? (y/n): ");
        String input = scan.nextLine();

        if (input.equalsIgnoreCase("y")) {
            return true;
        } else if (input.equalsIgnoreCase("n")) {
            return false;
        } else {
            System.out.println("Input tidak sesuai");
            return false;
        }
    }

    public static String cekCustomer(int umur, double gaji) {
        final int MIN_AGE = 21;
        final double MIN_SALARY_APPROVE = 8_000_000;
        final double MIN_SALARY = 3_000_000;

        if (umur >= MIN_AGE && gaji >= MIN_SALARY_APPROVE) {
            return "Eligible";
        } else if (umur >= MIN_AGE && gaji >= MIN_SALARY) {
            return "Needs Manual Review";
        } else {
            return "Rejected";
        }
    }

    public static void displayResult(String nama, String decision) {
        System.out.println(nama + " is " + decision);
    }
}
