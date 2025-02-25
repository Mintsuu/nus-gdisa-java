import java.util.Scanner;

class Sales {
    public static void main(String[] args) {
        String[] months = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] sales = new int[12];
        int totalSales = 0;
        Scanner inputStream = new Scanner(System.in);
            
        for(int x = 0; x < sales.length; x++) {
            System.out.printf("Please input your company's sales for %s: %n", months[x]);
            sales[x] = inputStream.nextInt();
            totalSales += sales[x];
        }

        System.out.printf("Month with lowest sales: %s %n", months[indexOfMinValue(sales)]);
        System.out.printf("Month with highest sales: %s %n", months[indexOfMaxValue(sales)]);
        System.out.printf("Average monthly sales: %d %n", totalSales / sales.length);

        inputStream.close();
    }

    private static int indexOfMinValue(int[] sales) {
        int minIndex = 0;
        for(int x = 1; x < sales.length - 1; x++) {
            if(sales[x] < sales[minIndex]) minIndex = x;
        }
        
        return minIndex;
    }

    private static int indexOfMaxValue(int[] sales) {
        int maxIndex = 0;
        for(int x = 1; x < sales.length - 1; x++) {
            if(sales[x] > sales[maxIndex]) maxIndex = x;
        }
        
        return maxIndex;
    }
}