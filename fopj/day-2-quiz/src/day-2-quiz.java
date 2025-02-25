import java.text.DecimalFormat;
import java.util.Scanner;

class MetricConverter {
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        DecimalFormat threeSf = new DecimalFormat("0.000");
        System.out.println("Please enter the length in cm: ");
        int value = inputStream.nextInt();
        double inInches = (double) value / 2.54;
        System.out.printf("%s%n", threeSf.format(inInches));
        inputStream.close();
    }
}