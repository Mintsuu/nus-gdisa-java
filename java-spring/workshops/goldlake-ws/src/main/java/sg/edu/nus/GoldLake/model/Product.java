package sg.edu.nus.GoldLake.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  @Column(length = 20)
  private String name;
  private double retailPrice;
  @Column(length = 50)
  private String description;
  @Column(length = 10)
  private String category;
  @Column(length = 10)
  private String supplierId;
  public Product() {
    super();
  }
  public Product(String name, double retailPrice,
    String description, String category, String
    supplierId) {
    super();
    this.name = name;
    this.retailPrice = retailPrice;
    this.description = description;
    this.category = category;
    this.supplierId = supplierId;
  }
}
