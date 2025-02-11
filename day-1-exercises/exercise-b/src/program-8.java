import java.util.Scanner;

class TaxiMeterRounded {
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        double minFee = 2.4;
        System.out.println("What is the distance in a double?");
        double distance = Double.valueOf(inputStream.nextLine());
        double result = minFee + distance * 0.4;
        System.out.printf("%.1f", result / 10 * 10);
        inputStream.close();
    }
}