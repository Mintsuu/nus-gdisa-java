import java.util.Scanner;

class TitleCase {
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        System.out.println("Enter a string:");    
        String input = inputStream.nextLine();
    
        String[] inputWordList = input.split(" ");

        for(int x = 0; x < inputWordList.length; x++) {
            char firstLetter = inputWordList[x].charAt(0);
            char upperCaseLetter = Character.toUpperCase(firstLetter);
            StringBuilder replacedWord = new StringBuilder(inputWordList[x]);
            replacedWord.setCharAt(0, upperCaseLetter);
            System.out.printf("%s ", replacedWord);
        }

        inputStream.close();
    }
}