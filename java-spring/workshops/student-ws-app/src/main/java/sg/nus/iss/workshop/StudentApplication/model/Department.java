package sg.nus.iss.workshop.StudentApplication.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String name; 

  @OneToMany(mappedBy = "department")
  private List<Student> students; 

  public Department() {}
  public Department(String name) {
    this.name = name;
  }

  @Override 
  public String toString() {
    return "Department [id=" + this.id + ", name=" + this.name + "]";
  }
}
