import java.util.Scanner;

class Lucky {
    public static void main(String[] args) {
        boolean flag = false;
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Input a number!");
        while(!flag) {
            int input = inputScanner.nextInt();
            if(input == 88) flag = true;
            System.out.println("Try again!");
        }
        System.out.println("Lucky you...");
        inputScanner.close();
    }
}