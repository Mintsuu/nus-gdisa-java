import java.util.Arrays;

class Sorting {
    public static void main(String[] args) {
        String[] names = new String[]{"John", "Venkat", "Mary", "Victor", "Betty"};
        int[] marks = new int[]{63, 29, 75, 82, 55};

        // Bubble sort
        for(int x = 0; x < marks.length - 1; x++) {
            for(int y = x + 1; y < marks.length; y++) {
                if(marks[y] < marks[x]) {
                    int tempX = marks[x];
                    int tempY = marks[y];
                    marks[x] = tempY;
                    marks[y] = tempX;
                }
            }
        }

        for(int x = 0; x < names.length - 1; x++) {
            for(int y = x + 1; y < names.length; y++) {
                char name1Char = names[x].charAt(0);
                char name2Char = names[y].charAt(0);

                if(marks[y] < marks[x]) {
                    int tempX = marks[x];
                    int tempY = marks[y];
                    marks[x] = tempY;
                    marks[y] = tempX;
                }
            }
        }

        System.out.println(Arrays.toString(marks));

    }
}