package sg.nus.iss.workshop.StudentApplication.model.repository; 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sg.nus.iss.workshop.StudentApplication.model.Department;


public interface DepartmentRepository extends JpaRepository<Department, Integer> {

  @Query("SELECT d.name, COUNT(s),AVG(s.cap) FROM Department d JOIN d.students s GROUP BY d HAVING AVG(s.cap) > 2.5")
  public List findByDepartmentHavingAvg();
}
