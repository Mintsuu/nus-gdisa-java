import java.util.Scanner;

public class D5_quiz {
    public static void main(String[] args) {
        int[][] theArray = {
                { 5, 3 },
                { 2, 9 },
                { 2, 9 },
                { 5, 1 },
                { 7, 1 },
                { 8, 3 },
                { 0, 3 },
                { 2, 2 },
                { 9, 7 }
        };
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number (0-9): ");
        int input = in.nextInt();
        in.close();

        for (int x = 0; x < theArray.length; x++) {
            for (int y = 0; y < theArray[x].length; y++) {
                if (input == theArray[x][y])
                    count++;
            }
        }

        if (count <= 0)
            System.out.printf("There is no %d in the array %n", input);
        else
            System.out.printf("The number of %d is %d", input, count);
    }
}