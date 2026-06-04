import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomerHelperClean1 {
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
public static String cekCustomer(int umur, double gaji){
    final int MIN_AGE = 21;
    final double MIN_SALARY_APPROVE = 8_000_000;
    final double MIN_SALARY = 3_000_000;

    if (umur >= MIN_AGE && gaji >= MIN_SALARY_APPROVE){
        return "Eligible";
    } else if (umur >= MIN_AGE && gaji >= MIN_SALARY){
        return "Needs Manual Review";
    } else {
        return "Rejected";
    }
}

public static void displayResult(String nama, String decision){
    System.out.println(nama + " is " + decision);
}

public static Object[] inputCustomer(Scanner scan){
    System.out.print("Masukkan nama: ");
    String nama = scan.nextLine();

    if(!nama.matches("[a-zA-Z ]+")){
        throw new InputMismatchException("Name must contain letters only");
    }

    System.out.print("Masukkan umur: ");
    int umur = Integer.parseInt(scan.nextLine());

    System.out.print("Masukkan gaji: ");
    double gaji = Double.parseDouble(scan.nextLine());

    return new Object[]{nama, umur, gaji};
}

}
