import java.util.Scanner;

class PalindromeCase {
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        System.out.println("Enter a string:");
        
        boolean isPalindrome = true;
        String input = inputStream.nextLine().replaceAll("[.,\\s]+", "");
        
        for(int x = 0; x < input.length(); x++) {
            char reverseChar = input.toLowerCase().charAt((input.length()-1) - x);
            char originalChar = input.toLowerCase().charAt(x);

            System.out.printf("Original: %s, Reversed: %s %n", originalChar, reverseChar);

            if(originalChar != reverseChar) isPalindrome = false;
        }
        
        System.out.println(isPalindrome);
        inputStream.close();
    }
}