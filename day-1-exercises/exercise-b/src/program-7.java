import java.util.Scanner;

class TaxiMeter {
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        double minFee = 2.4;
        System.out.println("What is the distance in a double?");
        double distance = Double.valueOf(inputStream.nextLine());

        System.out.printf("%f", minFee + distance * 0.4);
        inputStream.close();
    }
}