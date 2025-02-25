import java.util.Scanner;

class SquaredPrecisionRoundoff {
    public static void main(String[] arg) {
        Scanner inputStream = new Scanner(System.in);
        System.out.println("Please provide an double");
        double value = inputStream.nextDouble();
        // DecimalFormat twoSf = new DecimalFormat("0.00");
        System.out.printf("%5.2f", value);
        inputStream.close();
    }
}