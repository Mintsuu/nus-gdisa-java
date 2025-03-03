/**
 * This class should derive from class Account.
 * Current Account earns 0.25% interest for positive 
 * balance. Balance can be negative, but it is required 
 * to pay 6% interest for negative balance.
 */
public class OverdraftAccount extends Account {
  /**** Attributes *************************/
  private static double interestRate = 0.25;
  private static double overdraftInterest = 6;

  /**** Constructors *************************/
  public OverdraftAccount(String accountNumber, 
    String accountHolderId, double balance) {
    super(accountNumber, accountHolderId, balance);
  }

  /************** Methods ****************/

  @Override
  public boolean withdraw(double amount) {
    setBalance(getBalance() - amount);

    return true;
  }

  // This method overrides its parent's and
  // provides its own implementation
  @Override
  public double calculateInterest() {
    if (getBalance() > 0) {
      return getBalance() * interestRate / 100;
    } else {
      return getBalance() * overdraftInterest / 100;
    }
  }

  @Override
  public String toString() {
    return "[OverdraftAccount] " + super.toString();
  }
}
