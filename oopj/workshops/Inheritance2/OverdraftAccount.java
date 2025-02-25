/**
 * This class should derive from class Account.
 * Current Account earns 0.25% interest for positive 
 * balance. Balance can be negative, but it is required 
 * to pay 6% interest for negative balance.
 */
public class OverdraftAccount extends Account {
  /**
   * TODO: attributes
   * 
   * Add instance or static attributes when necessary
   */

  private static double interestRate = 0.0025;

  /**
   * TODO: create constructor.
   * 
   * This constructor accepts 3 parameters. 
   * It should make use of its parent's 
   * constructor to initialize its attributes.
   */

  public OverdraftAccount(String number, String holderId, double balance) {
    super(number, holderId, balance);
  }


  /**
   * TODO: implement method calculateInterest().
   * 
   * The method calculates and returns the interest of this account.
   * 
   * Overdraft Account earns 0.25% interest for positive 
   * balance and pays 6% interest for negative balance.
   * In the latter case, this method will return a 
   * negative number.
   * 
   * You may need to override this method from
   * its parent if necessary. You may even consider moving
   * the whole method to its parents if possible.
   */

  public double calculateInterest() {
    return super.getBalance() * OverdraftAccount.interestRate; 
  }  


  /**
   * TODO: implement method creditInterest().
   * 
   * The method deposit the interest amount, calculated from
   * calculateInterest() method of this
   * account, to its balance.
   * 
   * You may need to override this method from
   * its parent if necessary. You may even consider moving
   * the whole method to its parents if possible.
   */

  public void creditInterest() {
    double amountToCredit;

    if(super.getBalance() < 0) {
      amountToCredit = super.getBalance() + (super.getBalance() * 0.06);   
    } else {
      amountToCredit = super.getBalance() + this.calculateInterest();
    }

    super.setBalance(amountToCredit);
  }

  /**
   * TODO: override method withdraw().
   * 
   * This method decreases the account balance
   * by the given amount. 
   * 
   * For a Overdraft Account, balance can be negative
   * 
   * You may need to override this method from
   * its parent if necessary. You may even consider moving
   * the whole method to its parents if possible.
   */


  @Override
  public boolean withdraw(double amount) {
    double currentAmount = super.getBalance();
    super.setBalance(currentAmount -= amount);

    return true;
  }



  /**
   * TODO: override method toString().
   * 
   * This method returns the representation of the current
   * object in the form of the combination of values of 
   * its attributes in a more readable format.
   * 
   * This method should make use of its parent's method.
   */




}
