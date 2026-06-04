import java.util.InputMismatchException;
import java.util.Scanner;

public class Day2_4verClean {

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
        String decision;

        if (umur >= MIN_AGE && gaji >= MIN_SALARY_APPROVE) {
            decision = "Eligible";
        } else if (umur >= MIN_AGE && gaji >= MIN_SALARY) {
            decision = "Needs Manual Review";
        } else {
            decision = "Rejected";
        }
        return decision;
    }

    public static void displayResult(String nama, String decision) {
        System.out.println(nama + " is " + decision);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Masukkan nama: ");
                String nama = scan.nextLine();

                if (!nama.matches("[a-zA-Z ]+")) {
                    throw new InputMismatchException("Name must contain letters only");
                }

                System.out.print("Masukkan umur: ");
                int umur = Integer.parseInt(scan.nextLine());

                System.out.print("Masukkan gaji: ");
                double gaji = Double.parseDouble(scan.nextLine());

                String decision = cekCustomer(umur, gaji);
                displayResult(nama, decision);

                if (!tanyaLanjut(scan)) {
                    break;
                }

            } catch (Exception e) {
                System.out.println("Input error: " +
                        (e.getMessage() != null ? e.getMessage() : ""));
            }
        }

        scan.close();
    }
}