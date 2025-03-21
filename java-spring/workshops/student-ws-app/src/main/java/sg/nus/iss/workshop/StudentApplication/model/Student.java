package sg.nus.iss.workshop.StudentApplication.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity 
@Table(name = "student")
public class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) 
  private int id;
  private String matricNo;
  private String name;
  private double cap;
  @ManyToOne @JoinColumn(name="department_id")
  private Department department; 
  @ManyToMany(mappedBy = "students")
  private List<Course> courses;
  
  public Student() {}
  public Student(String matricNo, String name, double cap) {
    this.matricNo = matricNo;
    this.name = name;
    this.cap = cap;
  }

  @Override 
  public String toString() {
    return "Student [id=" + this.id + ", name=" + this.name + ", matricNo=" + this.matricNo + ", CAP=" + this.cap + "]";
  }
}
