package Model_Day_4;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadCSV {
    public static ArrayList<Customer2> processCSVFiles(String filename){
    ArrayList<Customer2> customers = new ArrayList<>();    
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

            Customer2 cust = new Customer2(name, age, salary, age);
            customers.add(cust);

        }
        reader.close();
    } catch (IOException e){
        System.out.println("error");
    }
    return customers;
}
}
