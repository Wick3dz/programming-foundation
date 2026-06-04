// import java.util.HashMap;
import java.util.LinkedHashMap;

public class Day3_OOP5 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> summary = new LinkedHashMap<>();

        //kalo pake HashMap bakal keacak urutannya
        //HashMap<String, Integer> summary = new HashMap<>();

        summary.put("Eligible", 0);
        summary.put("Not Elgible", 0);
        summary.put("Manual Review", 0);

        summary.put("Eligible", summary.get("Eligible") + 1);

        System.out.println(summary);
    }
}
