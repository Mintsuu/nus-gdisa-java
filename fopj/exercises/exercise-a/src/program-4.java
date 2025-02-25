import java.util.Scanner;

class SquaredPrecision {
    public static void main(String[] arg) {
        Scanner inputStream = new Scanner(System.in);
        System.out.println("Please provide an double");
        double value = inputStream.nextDouble();
        System.out.print(value * value);
        inputStream.close();
    }
}