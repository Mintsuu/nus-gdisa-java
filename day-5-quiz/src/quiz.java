import java.text.DecimalFormat;
import java.util.Scanner;

class DiscountCalc {
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);

        System.out.println("Welcome to the ISS Gadget Shop");
        System.out.println("Number of items to purchase:");

        int numItems = inputStream.nextInt();
        double cost = calcCost(numItems);

        DecimalFormat readableDollar = new DecimalFormat("#,###.00");

        System.out.printf("Please pay $%s %n", readableDollar.format(cost));
        inputStream.close();
    }

    private static double calcCost(int items) {
        int gadgetCost = 500;
        double actualValue = items * gadgetCost;
        double discountedCost = actualValue;

        if(actualValue > 2000 && actualValue <= 3000) {
            discountedCost = actualValue * 0.97;
        } else if(actualValue > 3000 && actualValue <= 6000) {
            discountedCost = actualValue * 0.95;
        } else if(actualValue > 6000) {
            discountedCost = actualValue * 0.92;
        }

        return discountedCost;
    }
}