import java.util.Scanner;

class Euclid {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Input A:");
        int A = inputScanner.nextInt();
        System.out.println("Input B:");
        int B = inputScanner.nextInt();
        int tempA = A;
        int tempB = B;

        while(tempA != tempB) {
            if(tempA > tempB) tempA -= tempB;
            else if(tempA < tempB) tempB -= tempA;
        }
        System.out.printf("HCM: %d LCM %d", tempA, A*B/tempA);
        inputScanner.close();
    }       

}