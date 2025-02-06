import java.util.Scanner;

class SquareRootOfDouble {
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        System.out.println("Please input a double:");
        double value = inputStream.nextDouble();
        System.out.printf("%d", value);
        inputStream.close();
    }
}