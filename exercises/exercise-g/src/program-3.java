import java.util.Arrays;

class MultiArray {
    public static void main(String[] args) {
        int[][] students = new int[][] {
                { (int) Math.round(Math.random() * 100 + 1), (int) Math.round(Math.random() * 100 + 1),
                        (int) Math.round(Math.random() * 100 + 1), (int) Math.round(Math.random() * 100 + 1) },
                { (int) Math.round(Math.random() * 100 + 1), (int) Math.round(Math.random() * 100 + 1),
                        (int) Math.round(Math.random() * 100 + 1), (int) Math.round(Math.random() * 100 + 1) },
                { (int) Math.round(Math.random() * 100 + 1), (int) Math.round(Math.random() * 100 + 1),
                        (int) Math.round(Math.random() * 100 + 1), (int) Math.round(Math.random() * 100 + 1) },
                { (int) Math.round(Math.random() * 100 + 1), (int) Math.round(Math.random() * 100 + 1),
                        (int) Math.round(Math.random() * 100 + 1), (int) Math.round(Math.random() * 100 + 1) },
                { (int) Math.round(Math.random() * 100 + 1), (int) Math.round(Math.random() * 100 + 1),
                        (int) Math.round(Math.random() * 100 + 1), (int) Math.round(Math.random() * 100 + 1) },
                { (int) Math.round(Math.random() * 100 + 1), (int) Math.round(Math.random() * 100 + 1),
                        (int) Math.round(Math.random() * 100 + 1), (int) Math.round(Math.random() * 100 + 1) },
                { (int) Math.round(Math.random() * 100 + 1), (int) Math.round(Math.random() * 100 + 1),
                        (int) Math.round(Math.random() * 100 + 1), (int) Math.round(Math.random() * 100 + 1) },
                { (int) Math.round(Math.random() * 100 + 1), (int) Math.round(Math.random() * 100 + 1),
                        (int) Math.round(Math.random() * 100 + 1), (int) Math.round(Math.random() * 100 + 1) },
                { (int) Math.round(Math.random() * 100 + 1), (int) Math.round(Math.random() * 100 + 1),
                        (int) Math.round(Math.random() * 100 + 1), (int) Math.round(Math.random() * 100 + 1) },
                { (int) Math.round(Math.random() * 100 + 1), (int) Math.round(Math.random() * 100 + 1),
                        (int) Math.round(Math.random() * 100 + 1), (int) Math.round(Math.random() * 100 + 1) },
                { (int) Math.round(Math.random() * 100 + 1), (int) Math.round(Math.random() * 100 + 1),
                        (int) Math.round(Math.random() * 100 + 1), (int) Math.round(Math.random() * 100 + 1) },
                { (int) Math.round(Math.random() * 100 + 1), (int) Math.round(Math.random() * 100 + 1),
                        (int) Math.round(Math.random() * 100 + 1), (int) Math.round(Math.random() * 100 + 1) },
        };

        int[] classSubjectAvg = new int[4];
        for (int x = 0; x < students.length; x++) {
            // System.out.printf("Student %d: %s %n", x , Arrays.toString(students[x]));
            int studentTotalMarks = 0;
            for (int y = 0; y < students[x].length; y++) {
                studentTotalMarks += students[x][y];
                classSubjectAvg[y] += students[x][y];
            }

            System.out.printf("Student total marks: %d %n", studentTotalMarks);
            System.out.printf("Student average marks: %.2f %n", (double) studentTotalMarks / students[x].length);
        }

        for (int y = 0; y < classSubjectAvg.length; y++) {
            System.out.printf("Subject %d average marks: %.2f %n", y, (double) classSubjectAvg[y] / students.length);
        }
    }
}