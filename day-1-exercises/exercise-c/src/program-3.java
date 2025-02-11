import java.util.Scanner;
enum Grade {
    A,
    B,
    C,
    F
}
class CalcGrade {
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        System.out.println("What is your score? (It should be a number between 0 and 100)");
        int score = inputStream.nextInt();
        Grade grade = Grade.F;
        if(score < 0 || score > 100) System.out.println("Invalid score");
        else {
            if(score >= 0 && score < 40) grade = Grade.F;
            else if(score >= 40 && score < 60) grade = Grade.C;
            else if (score >= 60 && score < 80) grade = Grade.B;
            else if (score >= 80 && score <= 100) grade = Grade.A;
        }
        System.out.printf("You scored %d marks which is %s grade.%n", score, grade);
        inputStream.close();
    }
}