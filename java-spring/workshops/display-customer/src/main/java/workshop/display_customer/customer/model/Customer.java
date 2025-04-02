package workshop.display_customer.customer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Customer {
  @Getter @Setter
  private int id; 
  @Getter @Setter
  private String name;
  @Getter @Setter
  private String handPhoneNumber;
  @Getter @Setter
  private String address;

  public Customer() {

  }
}
