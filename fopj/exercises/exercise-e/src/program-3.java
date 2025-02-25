import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        System.out.println("Input a number: ");

        int value = inputStream.nextInt();
        boolean isPrime = true;

        for(int x = 2; x < value; x++) {
            if(value % x == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime ? "Prime" : "Not Prime");
        inputStream.close();
    }
}