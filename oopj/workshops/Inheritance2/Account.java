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

  @Override
  public String toString() {
    return "Account number " + number + 
    ", holder " + holderId + ", balance " + balance;
  }
}
