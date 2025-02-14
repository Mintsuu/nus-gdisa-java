import java.util.Scanner;

class Perfect {
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        System.out.println("Input a number: ");

        int sum = 0;
        int value = inputStream.nextInt();

        for(int x = 1; x < value; x++) {
            if(value % x == 0) sum += x;
        }

        System.out.println(value == sum ? "Perfect" : "Not perfect");
        inputStream.close();
    }
}