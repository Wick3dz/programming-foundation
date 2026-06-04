import java.util.Scanner;

public class day1_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean lanjut = true;
        String halo = "Halo";
        while (lanjut){
            System.out.println(halo); 
            System.out.println("Apakah lanjut? (y/n)");
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("y")){
                continue;
            } else if (input.equalsIgnoreCase("n")){
                break;
            } else {
                System.out.println("Input tidak sesuai");
            }
        }
        scan.close();
    }
}
