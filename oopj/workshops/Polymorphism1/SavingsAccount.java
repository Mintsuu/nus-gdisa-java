public class SavingsAccount extends Account {
  // Attributes
  private static double interestRate = 1;

  /**** Constructors *************************/
  public SavingsAccount(String accountNumber, String accountHolderId, double balance) {
    super(accountNumber, accountHolderId, balance);
  }

  /************** Methods ****************/

  // This method overrides its parent's and
  // provides its own implementation
  @Override
  public double calculateInterest() {
    return getBalance() * interestRate / 100;
  }

  // This method overrides its parent's and
  // provides its own implementation
  public boolean withdraw(double amount) {
    if (amount < getBalance()) {
      // Ok to withdraw, logic is like the parent's
      // So let's reuse the parent's
      return super.withdraw(amount);
    } else {
      return false;
    }
  }

  @Override
  public String toString() {
    return "[Savings Account] " + super.toString();
  }
}
