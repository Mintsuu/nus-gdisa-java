import java.util.Scanner;

class TaxiMeter {
    public static void main(String[] args) {
        double cost = 2.4;
        Scanner inputStream = new Scanner(System.in);
        System.out.println("What is the distance travelled? (in km)");
        double distance = Math.ceil(inputStream.nextDouble() * 10);
        System.out.printf("Entered Distance: %f%n", distance);
        
        // Initial 0.5km
        distance = distance - 5;
        
        if(distance > 85) {
            distance = distance - 85;
            cost += (85 * 0.04) + (distance * 0.05);
        } else if(distance > 5) {
            cost += distance * 0.04;
        } 
        System.out.println(cost);
        inputStream.close();
    }
}