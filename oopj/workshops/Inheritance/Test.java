public class Test {
  public static void main(String[] args) {
    Account myAccount1 = new Account("111-1111-11", "S1111111A", 2000.0);
    System.out.println("Account number: " + myAccount1.getNumber());
    System.out.println("Account holder ID: " + myAccount1.getHolderId());
    System.out.println("Account balance: " + myAccount1.getBalance());

    System.out.println(); // New line

    myAccount1.setHolderId("N1111111A");
    myAccount1.setBalance(2500.0);
    System.out.println("Account holder ID after update: " + myAccount1.getHolderId());
    System.out.println("Account balance after update: " + myAccount1.getBalance());

    System.out.println(); // New line

    myAccount1.display();

    System.out.println(); // New line

    myAccount1.deposit(200.0);
    System.out.println("200.0 is deposited");
    myAccount1.display(); 

    System.out.println(); // New line

    boolean isSuccessful = false;

    isSuccessful = myAccount1.withdraw(500.0);
    if (isSuccessful) {
      System.out.println("500.0 is withdrawn");
    } else {
      System.out.println("500.0 cannot be withdrawn because balance is not enough");
    }
    myAccount1.display();

    System.out.println(); // New line

    isSuccessful = myAccount1.withdraw(3000.0);
    if (isSuccessful) {
      System.out.println("3000.0 is withdrawn");
    } else {
      System.out.println("3000.0 cannot be withdrawn because balance is not enough");
    }
    myAccount1.display();

    System.out.println(); // New line

    Account myAccount2 = new Account("222-2222-22", "N2222222B", 1000.0);
    myAccount2.display();

    isSuccessful = myAccount1.transferTo(500.0, myAccount2);
    if (isSuccessful) {
      System.out.println("500.0 is transferred");
    } else {
      System.out.println("500.0 cannot be transferred because balance is not enough");
    }

    myAccount1.display();
    myAccount2.display();

    System.out.println(); // New line

    isSuccessful = myAccount1.transferTo(2500.0, myAccount2);
    if (isSuccessful) {
      System.out.println("2500.0 is transferred.");
    } else {
      System.out.println("2500.0 cannot be transferred because balance is not enough");
    }

    myAccount1.display();
    myAccount2.display();

    System.out.println(); // New line

    System.out.println(myAccount1);
    System.out.println(myAccount2);

  }

}
