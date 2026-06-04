import java.util.InputMismatchException;
import java.util.Scanner;

public class Day2_2ver2 {
    public static void main(String[] args) {
        boolean lanjut = true;
        final int MIN_AGE = 21;
        final double MIN_SALARY_APPROVE = 8_000_000;
        final double MIN_SALARY = 3_000_000;
        String decision;
        Scanner scan = new Scanner(System.in);
        String nama = "";
        int umur = 0;
        double gaji = 0;

        while (lanjut){
        try{
            System.out.print("Masukkan nama: ");
            nama = scan.nextLine();

            if(!nama.matches("[a-zA-Z ]+")){
                throw new InputMismatchException("Name must contain letters only");
            }

            System.out.print("Masukkan umur: ");
            umur = Integer.parseInt(scan.nextLine());
        
            System.out.print("Masukkan gaji: ");
            gaji = Double.parseDouble(scan.nextLine());
    }
        catch (Exception e){
            System.out.println("Input error: "+ (e.getMessage() != null ? e.getMessage(): ""));
        }
        
        if (umur >= MIN_AGE && gaji >= MIN_SALARY_APPROVE){
            decision = " is Eligible";
        } else if (umur >= MIN_AGE && gaji >= MIN_SALARY){
            decision = " Needs Manual Review";
        } else {
            decision = " is Rejected";
        }
        
            System.out.println(nama + decision);

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
    scan.close();
}
}
