public class Day3_2 {
    public static void main(String[] args) {
            if (args.length < 1){
            System.out.println("Usage : java Day3_1 <filename>");
            return;
        }

        String filename = args[0];
        CustomerHelperCSVnew.processCSVFiles(filename);
    }
}
