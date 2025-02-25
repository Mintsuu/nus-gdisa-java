import java.util.Scanner;

class CalcIncome {
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        System.out.println("What is your salary?");
        Double salary = Double.valueOf(inputStream.nextLine());
        Double housingAllowance = Double.valueOf(salary) * 0.1;
        Double transportAllowance = Double.valueOf(salary) * 0.03;
        System.out.printf("$%.2f%n", salary + housingAllowance + transportAllowance);
        inputStream.close();
    }
}