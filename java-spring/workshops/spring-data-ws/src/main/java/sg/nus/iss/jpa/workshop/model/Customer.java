package sg.nus.iss.jpa.workshop.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String name;
  private String email;
  // @OneToMany(mappedBy = "customer" )
  // private List<Address> addresses;

  public Customer() {}
  public Customer(String name, String email) {
    this.name = name;
    this.email = email;
  }

  @Override 
  public String toString() {
    return "Customer [id="+ this.id + ", name=" + this.name + ", email=" + this.email + "]";
  }

}
