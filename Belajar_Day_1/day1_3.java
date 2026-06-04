import java.util.Scanner;

public class day1_3{
    public static void main (String[] args){
        final int MIN_AGE = 21;
        final int MIN_SALARY = 3000000;

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = scan.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = scan.nextInt();
        
        System.out.print("Masukkan gaji: ");
        float gaji = scan.nextFloat();

        if (umur >= MIN_AGE && gaji >= MIN_SALARY){
            System.out.println(nama + " is Eligible");
        } else {
            System.out.println(nama + " is Not Eligible");
        }
        scan.close();
    }
}
