import java.util.Scanner;

class GreetElders {
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = inputStream.nextLine();
        System.out.println("What is your gender?");
        Boolean isMale = inputStream.nextLine().toLowerCase().equals("male");
        System.out.println("What is your age?");
        int age = inputStream.nextInt();
        String title = "";

        if(isMale) title = age >= 40 ? "Uncle" : "Mr.";
        else title = age >= 40 ? "Aunty" : "Ms.";
        
        System.out.printf("Good morning %s %s", title, name);
        inputStream.close();
    }
}