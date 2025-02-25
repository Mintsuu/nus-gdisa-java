
public class CurrentAccount extends Account {
  /**
   * TODO: attributes
   * 
   * Add instance attributes or static attributes when necessary.
   */


  private static double interestRate = 0.0025;


  /**
   * TODO: create a constructor. 
   * 
   * This constructor accepts 3
   * parameters. It should make use
   * of its parent's constructor to initialize
   * its attributes.
   */

  public CurrentAccount(String number, String holderId, double balance) {
    super(number, holderId, balance);
  }


  /**
   * TODO: implement method calculateInterest().
   * 
   * The method calculates and returns the 
   * interest of this account.
   * Current Account earns 0.25% interest of its balance.
   * 
   * You may need to override this method from
   * its parent if necessary. You may even consider moving
   * the whole method to its parent if possible.
   */

  public double calculateInterest() {
    return super.getBalance() * CurrentAccount.interestRate;
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
    double amountToCredit = super.getBalance() + this.calculateInterest();
    super.setBalance(amountToCredit);
  }

  /**
   * TODO: override method withdraw().
   * 
   * This method decreases the account balance
   * by the given amount. 
   * 
   * For Current Accounts, balance cannot be negative.
   * 
   * You may need to override this method from
   * its parent if necessary. You may even consider moving
   * the whole method to its parents if possible.
   */

  


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
