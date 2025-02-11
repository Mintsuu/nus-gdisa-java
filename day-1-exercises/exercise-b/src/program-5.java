import java.util.Scanner;

class AlgebraEquation {
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        System.out.println("Input?");
        int input = inputStream.nextInt();
        System.out.println(5 * Math.pow(input, 2) - 4 * input + 3);
        inputStream.close();
    }
}