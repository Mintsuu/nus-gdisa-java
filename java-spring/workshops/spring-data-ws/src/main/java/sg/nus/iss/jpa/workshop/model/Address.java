package sg.nus.iss.jpa.workshop.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Address {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY.AUTO)
  private int id;
  private String street;
  private String city;
  private String country;
  // @ManyToOne
  // private Customer customer;

  public Address() {}
  public Address(String street, String city, String country) {
    this.street = street;
    this.city = city;
    this.country = country;
    // this.customer = customer;
  } 

  @Override 
  public String toString() {
    return "Address [id=" + this.id + ", street=" + this.street + ", city=" + this.city  + ", country=" + this.country +  "]";
  }
}
