public class Account {
  // Attributes
  private String number;
  private String holderId;
  private double balance;

  /**** Constructors *************************/
  public Account(String number, String holderId, double balance) {
    this.number = number;
    this.holderId = holderId;
    this.balance = balance;
  }

  /**** Getters and Setters *************************/
  public String getNumber() {
    return number;
  }

  public String getHolderId() {
    return holderId;
  }

  public void setHolderId(String holderId) {
    this.holderId = holderId;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  /************** Methods ****************/
  public void display() {
    System.out.println("Account number " + number + 
      ", holder " + holderId + ", balance " + balance);
  }

  public void deposit(double amount) {
    balance += amount;
  }

  public boolean withdraw(double amount) {
    if (balance < amount) {
      return false;
    }

    balance -= amount;
    return true;
  }

  public boolean transferTo(double amount, Account toAccount) {
    boolean isWithdrawOk = withdraw(amount);

    if (!isWithdrawOk) {
      return false;
    }

    toAccount.deposit(amount);
    return true;
  }

  // In all type of Accounts (SavingsAccount, CurrentAccount,
  // OverdraftAccount), this method has the SAME implementation
  // So just put it in this parent class and derived classes
  // don't need to override
  public void creditInterest() {
    double interest = calculateInterest();

    deposit(interest);
  }

  public double calculateInterest() {
    // This method will be overridden, just return something
    return 0;
  }

  @Override
  public String toString() {
    return "Account number " + number + 
    ", holder " + holderId + ", balance " + balance;
  }
}
