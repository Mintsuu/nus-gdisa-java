import java.util.Scanner;

class SquareRoot {
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        System.out.println("Please enter a double.");
        String input = inputStream.next();
        System.out.printf("%.3f%n", Math.sqrt(Double.valueOf(input)));
        inputStream.close();
    }
}