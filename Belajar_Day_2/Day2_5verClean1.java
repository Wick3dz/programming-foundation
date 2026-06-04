import java.util.Scanner;

public class Day2_5verClean1 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    while (true){
        try {
            Object[] data = CustomerHelperClean1.inputCustomer(scan);

            String nama = (String) data[0];
            int umur = (int) data[1];
            double gaji = (double) data[2];

            String decision = CustomerHelperClean1.cekCustomer(umur, gaji);
            CustomerHelperClean1.displayResult(nama, decision);

            if (!CustomerHelperClean1.tanyaLanjut(scan)){
                break;
            }

        } catch (Exception e){
            System.out.println("Input error: " + 
                (e.getMessage() != null ? e.getMessage() : ""));
        }
    }

    scan.close();
}
}
