import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        System.out.println("Please provide a 3-digit integer:");
        String value = inputStream.nextLine();
        
        if(value.length() < 3 || value.length() > 3) {
            System.out.println("Invalid number, please provide a 3-digit integer.");
        }
    
        int match = Integer.parseInt(value);
        int digit1 =  Integer.parseInt(value.substring(0, 1));
        int digit2 =  Integer.parseInt(value.substring(1, 2));
        int digit3 =  Integer.parseInt(value.substring(2, 3));

        System.out.println(match == (calcCube(digit1) + calcCube(digit2) + calcCube(digit3)));

        inputStream.close();
    }

    private static int calcCube(int value) {
        return (int) Math.pow(value, 3);
    }
}