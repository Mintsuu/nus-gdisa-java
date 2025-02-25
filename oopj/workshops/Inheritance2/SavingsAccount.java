/**
 * This class should derive from class Account.
 * Savings Account earns 1% interest, but balance can not be negative
 */
public class SavingsAccount extends Account{
  /**
   * TODO: attributes
   * You may consider create static variable interest = 1
   */

  private static double interestRate = 0.01;

  /**
   * TODO: create a constructor that accepts 3
   * parameters. The constructor should make use
   * of its parent's constructor to initialize
   * its attributes
   */

  public SavingsAccount(String number, String holderId, double balance) {
    super(number, holderId, balance);
  }

  /**
   * TODO: implement method calculateInterest()
   * The method returns the interest of this account.
   * Savings Account earns 1% interest of its balance.
   * 
   * You may need to override this method from
   * its parent if necessary. You may even consider moving
   * the whole method to its parent if possible.
   */

  public double calculateInterest() {
    return super.getBalance() * SavingsAccount.interestRate;
  } 

  /**
   * TODO: implement method creditInterest().
   * 
   * The method deposits the interest amount, calculated from
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
   * For a Savings Account, balance cannot be negative
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
   * This method should make use of its parent's method
   */




}
