import java.util.Scanner;

class DistanceCalc {
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        System.out.println("Input X1:");
        int x1 = inputStream.nextInt();
        System.out.println("Input Y1:");
        int y1 = inputStream.nextInt();
        System.out.println("Input X2:");
        int x2 = inputStream.nextInt();
        System.out.println("Input Y2:");
        int y2 = inputStream.nextInt();

        System.out.println(Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2))));
        inputStream.close();
    }
}