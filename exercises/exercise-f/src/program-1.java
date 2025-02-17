import java.util.Scanner;

class Vowels {
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        System.out.println("Enter a string:");
        
        String input = inputStream.nextLine();
        String[] vowelList = new String[]{"a", "e", "i", "o", "u"};
        int[] vowelCount = new int[]{0, 0, 0, 0 ,0}; 
        int vowels = 0;

        for (int x = 0; x < input.length(); x++) {
            String c = input.substring(x, x + 1);
            switch(c) {
                case "a":
                vowelCount[0]++;
                vowels++;
                break;
                case "e":
                vowelCount[1]++;
                vowels++;
                break;
                case "i":
                vowelCount[2]++;
                vowels++;
                break;
                case "o":
                vowelCount[3]++;
                vowels++;
                break;
                case "u":
                vowelCount[4]++;
                vowels++;
                break;
            }
        }
        
        System.out.println(vowels);
        for(int y = 0; y < vowelCount.length; y++) {
            if(vowelCount[y] > 0) System.out.printf("Vowel %s: %d %n", vowelList[y], vowelCount[y]);
        }
        inputStream.close();
    }
}