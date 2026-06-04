import java.util.InputMismatchException;
import java.util.Scanner;

public class Day2_2 {
    public static void main(String[] args) {
        boolean lanjut = true;
        final int MIN_AGE = 21;
        final double MIN_SALARY_APPROVE = 8_000_000;
        final double MIN_SALARY = 3_000_000;
        String decision;
        Scanner scan = new Scanner(System.in);


        while (lanjut){
        try{
            //input logic
            System.out.print("Masukkan nama: ");
            String nama = scan.nextLine();

            if(!nama.matches("[a-zA-Z ]+")){
                throw new InputMismatchException("Name must contain letters only");
            }

            System.out.print("Masukkan umur: ");
            int umur = scan.nextInt();
        
            System.out.print("Masukkan gaji: ");
            Double gaji = scan.nextDouble();

        //decision logic (process)
        if (umur >= MIN_AGE && gaji >= MIN_SALARY_APPROVE){
            decision = " is Eligible";
        } else if (umur >= MIN_AGE && gaji >= MIN_SALARY){
            decision = " Needs Manual Review";
        } else {
            decision = " is Rejected";
        }

            //output logic
            System.out.println(nama + decision);

            scan.nextLine(); //harus di break karena input setelah angka, 
                            // itu ada input string, jadi dia berfungsi buat 
                            // nangkep \n setelah input (9999\n)
                            //bisa pake Doube.parseDouble(scan.NextLine());
                            //untuk alternatif

            System.out.print("Apakah lanjut? (y/n): ");
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("y")){
                continue;
            } else if (input.equalsIgnoreCase("n")){
                break;
            } else {
                System.out.println("Input tidak sesuai");
                break;
            }
    } 
        catch (Exception e){
            System.out.println("Input error: "+ (e.getMessage() != null ? e.getMessage(): ""));
        }

        scan.nextLine();

    }
    scan.close();
}
}
