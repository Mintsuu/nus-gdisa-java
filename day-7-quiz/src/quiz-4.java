import java.util.Scanner;

class ISSBank {
    public static void main(String[] args) {
        int maxTries = 3;
        int attempts = 0;
        boolean flag = false;
        Scanner inputStream = new Scanner(System.in);
        String correctPin = "123456";
        
        System.out.println("Welcome to the Bank of ISS");
        System.out.println("Enter your PIN: ");
        
        while(attempts < maxTries && !flag) {
            String inputPin = inputStream.nextLine();
            if(!inputPin.equals(correctPin)) {
                System.out.println("Incorrect PIN. Please try again.");
                attempts++;
            } else {
                flag = true;
            }
        }   

        if(attempts < 3) System.out.println("PIN accepted. You can access your account now");
        else System.out.println("Too many wrong PIN entries. Your account is now locked.");

        inputStream.close();
    }
}