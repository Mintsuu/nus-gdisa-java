import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

class SquaredPrecisionRoundoff {
    public static void main(String[] arg) {
        Scanner inputStream = new Scanner(System.in);
        System.out.println("Please provide an double");
        double value = inputStream.nextDouble();
        DecimalFormat twoSf = new DecimalFormat("0.00");
        twoSf.setRoundingMode(RoundingMode.UP);
        System.out.printf("%s", twoSf.format(value));
        inputStream.close();
    }
}