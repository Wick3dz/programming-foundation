import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day3_1 {
    // public final CustomerHelperClean customerHelperClean;
    
    // public Day3_1(CustomerHelperClean customerHelperClean){
    //     this.customerHelperClean = customerHelperClean;
    // }

    public static void processCSVFiles(String filename){
        try{
            BufferedReader reader = new BufferedReader(
                new FileReader(filename)
            );
            String line;

            reader.readLine();

            while ((line = reader.readLine()) != null){
                String [] data = line.split(",");
                String name = data [0];
                int age = Integer.parseInt(data[1]);
                double salary = Double.parseDouble(data[2]);

                String decision = CustomerHelperCSVnew.cekCustomer(age, salary);
                CustomerHelperCSVnew.displayResult(name,decision);
            }
        } catch (IOException e){
            System.out.println("error");
        }
        }
    
    public static void main(String[] args) {
        if (args.length < 1){
            System.out.println("Usage : java Day3_1 <filename>");
            return;
        }

        String filename = args[0];
        processCSVFiles(filename);
}
}
