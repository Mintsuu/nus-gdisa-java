public class CurrentAccount extends Account {
  /**** Attributes *************************/
  private static double interestRate = 0.25;

  /**** Constructors *************************/
  public CurrentAccount(String accountNumber, 
      String accountHolderId, double balance) {
    super(accountNumber, accountHolderId, balance);
  }

  /************** Methods ****************/
  @Override
  public double calculateInterest() {
    return getBalance() * interestRate / 100;
  }

  // This method overrides its parent's and
  // provides its own implementation
  @Override
  public boolean withdraw(double amount) {
    if (amount < getBalance()) {
      // Ok to withdraw. Logic is like the parent's.
      // So let's reuse the parent's
      return super.withdraw(amount);
    }
    else {
      return false;
    }
  }

  @Override
  public String toString() {
    return "[CurrentAccount] " + super.toString(); 
  }

}
