import java.util.Scanner;

class Guess {
    public static void main(String[] args) {
        int tries = 1;
        Scanner inputScanner = new Scanner(System.in);
        int answer = (int) (Math.random() * 10);
        System.out.println("Guess a number!");
        int input = inputScanner.nextInt();
        while(input != answer) {
            tries++;
            System.out.println("Try again!");
            input = inputScanner.nextInt();
        }

        if(tries < 3) System.out.printf("You're a wizard! %n", tries);
        else if(tries < 6) System.out.printf("You have a good guess. %n", tries);
        else System.out.printf("You're lousy. %n", tries);
        inputScanner.close();
    }
}