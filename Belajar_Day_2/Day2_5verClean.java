import java.util.InputMismatchException;
import java.util.Scanner;

public class Day2_5verClean {
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

                String decision = CustomerHelperCSVnew.cekCustomer(umur, gaji);
                CustomerHelperCSVnew.displayResult(nama, decision);

                if (!CustomerHelperCSVnew.tanyaLanjut(scan)) {
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
