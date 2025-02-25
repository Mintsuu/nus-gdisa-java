public class Account {
  private String accountNumber;
  private String holderId;
  private double balance;
  
  public Account(String accountNumber, String holderId, double balance ) {
    this.accountNumber = accountNumber;
    this.holderId = holderId;
    this.balance = balance;
  } 

  public String getHolderId() {
    return this.holderId;
  }

  public void setHolderId(String id) {
    this.holderId = id; 
  }

  public double getBalance() {
    return this.balance;
  }
  
  public void setBalance(double amount) {
    this.balance = amount; 
  }

  public String getNumber() {
    return this.accountNumber;
  }

  public void display() {
    System.out.printf("Account number %s, holder %s, balance %.1f %n", this.accountNumber, this.holderId, this.balance);
  }

  public void deposit(double amount) {
    this.balance += amount;
  }

  public boolean withdraw(double amount) {
    if(this.balance < amount) return false;
    this.balance -= amount; 
    return true;
  }

  public boolean transferTo(double amount, Account targetAccount) {
    if(!this.withdraw(amount)) return false; 
    targetAccount.deposit(amount);
    return true;
  } 
}
