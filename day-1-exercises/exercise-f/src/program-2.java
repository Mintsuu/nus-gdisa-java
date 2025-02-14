import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        System.out.println("Enter a string:");
        
        boolean isPalindrome = true;
        String input = inputStream.nextLine();
        
        for(int x = 0; x < input.length(); x++) {
            char reverseChar = input.charAt((input.length()-1) - x);
            char originalChar = input.charAt(x);

            if(originalChar != reverseChar) isPalindrome = false;
        }
        
        System.out.println(isPalindrome);
        inputStream.close();
    }
}