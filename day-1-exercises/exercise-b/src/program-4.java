import java.util.Scanner;

class TempConversion {
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        System.out.println("Enter a Centigrade number to be converted");
        int input = Integer.parseInt(inputStream.nextLine());
        System.out.printf("%3.0f%n", input * 1.8 + 32);
        inputStream.close();
    }
}