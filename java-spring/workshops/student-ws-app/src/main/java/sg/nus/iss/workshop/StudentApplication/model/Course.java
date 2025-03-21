package sg.nus.iss.workshop.StudentApplication.model; 

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "course")
public class Course {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String code;
  private String description;

  @ManyToMany 
  @JoinTable(name = "student_course", 
  joinColumns = @JoinColumn(name="course_id"),
  inverseJoinColumns = @JoinColumn(name="student_id"))
  private List<Student> students;


  @Override
  public String toString() {
    return "Course [id=" + this.id +", code=" + this.code + ", description=" + this.description + "]";
  }
}
