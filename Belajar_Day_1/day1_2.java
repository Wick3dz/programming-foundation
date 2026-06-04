import java.util.Scanner;
import java.util.Arrays;
public class day1_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.print("Enter your name: ");
        // String nama = scan.nextLine();

        // System.out.print("Enter your age: ");
        // int umur = scan.nextInt();

        // System.out.println("Nama anda: " + nama );
        // System.out.println("Umur anda: " + umur );
        // scan.close();

        //new
        String[] huruf_vokal = {"a", "i", "u", "e", "o"};
        //String huruf_vokal = "aiueo";
        System.out.println("Masukkan huruf: ");
        String huruf = scan.nextLine();
        huruf = huruf.toLowerCase();
        // if (huruf_vokal.contains(huruf)){}

        if (Arrays.asList(huruf_vokal).contains(huruf)){
            System.out.println(huruf + " adalah vokal");
        } else {
            System.out.println(huruf + " adalah konsonan");
        }

        scan.close();
}
}
