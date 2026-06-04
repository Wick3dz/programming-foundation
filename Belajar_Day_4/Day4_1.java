package Belajar_Day_4;
import java.util.*;

public class Day4_1 {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Ini Array");

        String[] applicants = {
            "Rina",
            "Budi",
            "Andi",
            "Sari"
        };
        
        String[] existingLoan = {
            "Budi",
            "Budi",
            "Sari"
        };

        for (String person : applicants){
            if (Arrays.asList(existingLoan).contains(person)){
                System.out.println(person + " Manual Review");
            } else{
                System.out.println(person  + " Normal");
            }
        }
        System.out.println("");
        System.out.println("Ini List");

        List<String> applicant1 = Arrays.asList("Rina", "Budi", "Andi", "Sari");
        List<String> existing_loan1 = Arrays.asList( "Budi", "Budi", "Sari");

        
        for (String person : applicant1){
            if (existing_loan1.contains(person)){
                System.out.println(person + " Manual Review");
            } else{
                System.out.println(person  + " Normal");
            }
        }
        
        System.out.println("");
        System.out.println("Ini HashSet");


        HashSet<String> applicant2 = new HashSet<>(
            Arrays.asList(applicants) //bisa isi value atau lgsg ambil dari array
        );

        HashSet<String> existing_loan2 = new HashSet<>(
            Arrays.asList(existingLoan) //bisa isi value atau lgsg ambil dari array
        );

        for (String person : applicant2){
            if (existing_loan2.contains(person)){
                System.out.println(person + " Manual Review");
            } else{
                System.out.println(person  + " Normal");
            }
        }


        //pake Set
        System.out.println("");
        System.out.println("Ini Set");
        Set<String> loan = new LinkedHashSet<>();
        Collections.addAll(loan, existingLoan);

        Set<String> app = new LinkedHashSet<>();
        Collections.addAll(app, applicants);


        for(String nama : app){
            if (loan.contains(nama)) {
                System.out.println(nama +" (punya existing loan) => Manual Review");
            }else{
                System.out.println(nama +" (tidak punya existing loan) => Normal");
            }
    }
}
}
