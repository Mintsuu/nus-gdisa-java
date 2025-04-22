package sg.edu.nus.course_crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Course {
  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
  private int id;
  private String code;
  private String name;
  private String description;

  public Course() {}

  public Course(String code, String name, String description) {
    this.code = code;
    this.name = name;
    this.description = description;
  }

  @Override
  public String toString() {
    return "Course [id=" + id + ", code=" + code + ", name=" + name + ", description=" + description + "]";
  }

}
