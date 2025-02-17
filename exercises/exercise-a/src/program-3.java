import java.util.Scanner;

class Squared {
    public static void main(String[] arg) {
        Scanner inputStream = new Scanner(System.in);
        System.out.println("Please provide an integer");
        int value = inputStream.nextInt();
        System.out.print(value * value);
        inputStream.close();
    }
}