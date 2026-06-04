public class day1_5 {
    public static void main(String[] args) {
        int number = 0;
        while (number <= 5){
            number++;
            if (number == 3) continue;
            System.out.println(number);
            // if (number == 3) break; stop and exit loop
            // if (number == 3) continue; skip loop
            //number++;
        }

        // do {
        //     System.out.println(number);
        //     number++;
        // } while (number<=5);
    }
}
