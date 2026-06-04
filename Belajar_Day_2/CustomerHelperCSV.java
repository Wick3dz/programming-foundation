import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomerHelperCSV {
    
    public static void bacaCSV(String namaFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(namaFile))) {

            String line;

            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");

                String nama = row[0];
                int umur = Integer.parseInt(row[1]);
                double gaji = Double.parseDouble(row[2]);

                cekCustomer(nama, umur, gaji);
            }

        } catch (IOException e) {
            System.out.println("Error baca file: " + e.getMessage());
        }
    }

        public static boolean tanyaLanjut (Scanner scan) {
        System.out.print("Apakah lanjut? (y/n): ");
        String input = scan.nextLine();

        if (input.equalsIgnoreCase("y")){
            return true;
        } else if (input.equalsIgnoreCase("n")){
            return false;
        } else {
            System.out.println("Input tidak sesuai");
            return false;
        }
        
    }
    public static void cekCustomer (String nama, int umur, Double gaji){
        final int MIN_AGE = 21;
        final double MIN_SALARY_APPROVE = 8_000_000;
        final double MIN_SALARY = 3_000_000;
        String decision;

        if (umur >= MIN_AGE && gaji >= MIN_SALARY_APPROVE){
            decision = " is Eligible";
        } else if (umur >= MIN_AGE && gaji >= MIN_SALARY){
            decision = " Needs Manual Review";
        } else {
            decision = " is Rejected";
        }

        System.out.println(nama + decision);
    }

    public static void inputCustomer (String nama, int umur, Double gaji){
        Scanner scan = new Scanner(System.in);

            //input logic
        System.out.print("Masukkan nama: ");
        nama = scan.nextLine();

        if(!nama.matches("[a-zA-Z ]+")){
            throw new InputMismatchException("Name must contain letters only");
        }

        System.out.print("Masukkan umur: ");
        umur = Integer.parseInt(scan.nextLine());
        
        System.out.print("Masukkan gaji: ");
        gaji = Double.parseDouble(scan.nextLine());

        cekCustomer(nama, umur, gaji);
    }
}
