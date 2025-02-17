import java.util.Scanner;

class Gender {
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = inputStream.nextLine();
        System.out.println("Are you male or female?");
        Boolean isMale = inputStream.nextLine().toLowerCase().equals("male");

        // This always returns false
        // Boolean isMale = inputStream.nextLine().toLowerCase() == "male";

        if(isMale) System.out.printf("Good Morning Mr. %s", name);
        else System.out.printf("Good Morning Ms. %s", name);

        inputStream.close();
    }
}