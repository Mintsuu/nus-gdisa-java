public class Test {
  public static void main(String[] args) {
    BankBranch branch = new BankBranch("Clementi Central");
    branch.addAccount(new SavingsAccount("0000111", "S1111111A", 2000.0));
    branch.addAccount(new OverdraftAccount("0000333", "S3333333C", 3000.0));
    branch.addAccount(new CurrentAccount("0000222", "S2222222B", 1000.0));
    branch.addAccount(new OverdraftAccount("0000444", "S1111111A", -2000));

    System.out.println(branch);

    System.out.println("\n---- Print all accounts ----");
    branch.printAccounts();

    System.out.println("\n---- Deposits and interest ----");
    System.out.println("Total deposits: " + branch.totalDeposits());
    System.out.println("Total interest paid to accounts: " + branch.totalInterestPaid());
    System.out.println("Total negative deposits: " + branch.totalNegativeDeposits());
    System.out.println("Total interest earned from accounts: " + branch.totalInterestEarned());

    System.out.println("\n---- Print all unique customer IDs ----");
    branch.printCustomers(); 

  }
}
