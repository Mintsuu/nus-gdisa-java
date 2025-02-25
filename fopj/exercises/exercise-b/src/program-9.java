import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = inputStream.nextInt();
        System.out.println("Enter b:");
        int b = inputStream.nextInt();
        System.out.println("Enter c:");
        int c = inputStream.nextInt();
        double s = (a + b + c) /2;
        if(s < a || s < b || s < c || s == 0) {
            System.out.println("s is less than the sides of the triangle.");
        } else {
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println(area);
            inputStream.close();
    
        }
    }
}