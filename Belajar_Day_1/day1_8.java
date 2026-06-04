import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class day1_8 {
    public static void main(String[] args) {
        try {
        // //buka file
        // File file = new File("test2.txt");
        // //baca file
        // Scanner reader = new Scanner(file);
        // //tampilkan
        // while (reader.hasNextLine()){
        //     String line = reader.nextLine();
        //     System.out.println(line);
        // } 

        FileWriter writer = new FileWriter("test2.txt",true);
        //tulis
        writer.write("Haloo....\n");
        writer.write("Haloo jugaa\n");
        //tutup file
        //reader.close();
        writer.close();
    // } catch (FileNotFoundException e){
    //     System.out.println("File tidak ditemukan!");
    //     }
        } catch (IOException e){
        System.out.println("File tidak ditemukan!");
        }
    }
}
