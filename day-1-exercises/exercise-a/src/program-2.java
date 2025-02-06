import java.util.Scanner;

class Greeting {
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = inputStream.nextLine();
        System.out.printf("Good Morning %s%n", name);
        inputStream.close();
    }
}