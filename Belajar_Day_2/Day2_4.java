import java.util.InputMismatchException;
import java.util.Scanner;

public class Day2_4 {

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

    public static void inputCustomer (Scanner scan){
            //input logic
        System.out.print("Masukkan nama: ");
        String nama = scan.nextLine();

        if(!nama.matches("[a-zA-Z ]+")){
            throw new InputMismatchException("Name must contain letters only");
        }

        System.out.print("Masukkan umur: ");
        int umur = Integer.parseInt(scan.nextLine());
        
        System.out.print("Masukkan gaji: ");
        Double gaji = Double.parseDouble(scan.nextLine());

        cekCustomer(nama, umur, gaji);

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // String nama = "";
        // int umur = 0;
        // Double gaji = 0.0;

        while (true){
            try {
                inputCustomer(scan);
                if (!tanyaLanjut(scan)){
                    break;
                }
            } catch (Exception e){
                System.out.println("Input error: "+ (e.getMessage() != null ? e.getMessage(): ""));
            }
        }
        
        



            // System.out.print("Apakah lanjut? (y/n): ");
            // String input = scan.nextLine();

            // if (input.equalsIgnoreCase("y")){
            //     continue;
            // } else if (input.equalsIgnoreCase("n")){
            //     break;
            // } else {
            //     System.out.println("Input tidak sesuai");
            //     break;
            // 

    }
}

