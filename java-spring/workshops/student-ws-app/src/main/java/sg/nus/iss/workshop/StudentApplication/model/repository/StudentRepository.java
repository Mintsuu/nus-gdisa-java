package sg.nus.iss.workshop.StudentApplication.model.repository; 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sg.nus.iss.workshop.StudentApplication.model.Student;


public interface StudentRepository extends JpaRepository<Student, Integer> {
  @Query("SELECT s FROM Student s ORDER BY s.cap DESC")
  public List<Student> findAllOrderByCapDesc();
  public List<Student> findByNameEndingWith(String letter);
  public List<Student> findByCapAfter(double cap);
  
  @Query("SELECT s,c FROM Student s JOIN s.courses c WHERE s.name LIKE '%man%'")
  public List findByNameContaining(@Param("studentName") String search);
}
