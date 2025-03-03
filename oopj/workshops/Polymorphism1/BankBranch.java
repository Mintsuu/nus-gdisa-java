import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class BankBranch { 
  private String name;
  /**
    * This attribute keeps a list of bank accounts.
    * Any type of accounts will be accepted.
    */
  private List<Account> accountList;

  public BankBranch(String name) {
    this.name = name;
    accountList = new ArrayList<Account>();
  }

  // Getter and setter
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
    * TODO: Implement method addAccount().
    * 
    * This method helps this bank branch keeps another
    * bank account, by adding a given Account object to the
    * _accounts list.
    * 
    */
  public void addAccount(Account account) {
    // Hint: this method only has 1 
    // line of code
    accountList.add(account);
  }

  /**
    * This method prints the information of all 
    * the accounts' that this branch keeps.
    */
  public void printAccounts() {
    for (Account account : accountList) {
      System.out.println(account);
    }
  }

  /**
    * TODO: Implement method totalDeposits().
    * 
    * This method returns the total non-negative
    * balance of all accounts that this branch
    * keeps.
    */
  public double totalDeposits() {
    double totalBalance = 0;
    for (Account account : accountList) {
      if(account.getBalance() > 0) totalBalance += account.getBalance();
    }

    return totalBalance;
  }



  /**
    * TODO: Implement method totalInterestPaid().
    * 
    * Every year, each account which has 
    * non-negative balance kept in this branch
    * will pay its respective interest, calculated
    * by the account's calculateInterest() method
    * 
    * This method returns the sum of  
    * interests that this branch pays to 
    * all non-negative balance accounts it keeps.
    */
  public double totalInterestPaid() {
    double totalInterest = 0;
    for(Account account : this.accountList) {
      if(account.getBalance() > 0) totalInterest += account.calculateInterest();
    }

    return totalInterest;
  }

  /**
    * TODO: Implement method totalDeposits().
    * 
    * This method returns the total non-negative
    * balance of all accounts that this branch
    * keeps.
    */
  public double totalNegativeDeposits() {
    double totalNegativeDeposits = 0;
    for(Account account : this.accountList) {
      if(account.getBalance() < 0) totalNegativeDeposits += account.getBalance();
    }

    return totalNegativeDeposits;
  }


  /**
    * TODO: Implement method totalInterestEarned().
    * 
    * Every year, each account which has
    * negative balance will pay its respective 
    * interest, computed by the account's 
    * calculateInterest() method.
    * 
    * This method returns the sum of negative 
    * interests that this branch earns from 
    * all negative-balance accounts it keeps.
    */
  public double totalInterestEarned() {
    double totalInterest = 0;
    for(Account account : this.accountList) {
      if(account.getBalance() < 0) totalInterest += (-account.calculateInterest());
    }

    return totalInterest;
  }



  /**
    * TODO: Implement method printCustomers()
    * 
    * As we know, each account has attribute
    * to keep the respective holder id.
    * 
    * This method prints all UNIQUE holder ids
    * of all accounts that this branch keeps.
    * Note that a customer can hold multiple
    * accounts.
    * 
    */
  public void printCustomers() {
    ArrayList<Account> uniqueList = new ArrayList<Account>();
    for(Account account : this.accountList) {
      boolean flag = true;
      for(Account uniAcc : uniqueList) {
        if(uniAcc.getHolderId().contains(account.getHolderId())) {
          flag = false;
        }
      }

      if(flag) uniqueList.add(account);
    }

    for(Account uniAccounts : uniqueList) {
      System.out.println(uniAccounts.getHolderId());
    }
  }
}               
