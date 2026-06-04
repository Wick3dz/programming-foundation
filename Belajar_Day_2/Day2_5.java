import java.util.Scanner;

public class Day2_5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nama = "";
        int umur = 0;
        Double gaji = 0.0;

        while (true){
            try {
                CustomerHelper.inputCustomer(nama, umur, gaji);

                if (!CustomerHelper.tanyaLanjut(scan)){
                    break;
                }
            } catch (Exception e){
                System.out.println("Input error: "+ (e.getMessage() != null ? e.getMessage(): ""));
            }
        }
    }
}

