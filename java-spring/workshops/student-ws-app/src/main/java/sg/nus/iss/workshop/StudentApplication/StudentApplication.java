package sg.nus.iss.workshop.StudentApplication;

import java.util.Iterator;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import sg.nus.iss.workshop.StudentApplication.model.Student;
import sg.nus.iss.workshop.StudentApplication.model.repository.DepartmentRepository;
import sg.nus.iss.workshop.StudentApplication.model.repository.StudentRepository;

@SpringBootApplication
public class StudentApplication<T> {

  public static void main(String[] args) {
    SpringApplication.run(StudentApplication.class, args);
  }

  @Bean 
  public CommandLineRunner runMe(StudentRepository studentRepo, DepartmentRepository departmentRepo) {
    return args -> {
      System.out.println("---- Find all students with order CPA ----");
      List<Student> allStudents = studentRepo.findAllOrderByCapDesc();
      allStudents.forEach((student) -> System.out.println(student.toString()));
      System.out.println("---- Find students by name ----");
      List<Student> studentsNameEnd = studentRepo.findByNameEndingWith("n");
      studentsNameEnd.forEach(student -> System.out.println(student.toString()));
      System.out.println("---- Find students by min cap ----");
      List<Student> studentCap = studentRepo.findByCapAfter(2.0);
      studentCap.forEach(student -> System.out.println(student.toString()));
      System.out.println("---- Find marvel students by cap ----");
      List<Student> studentCap3 = studentRepo.findByCapAfter(3.0);
      studentCap3.forEach(student -> System.out.println(student.toString()));
      System.out.println("---- Find students and courses ----");
      List studentCourses = studentRepo.findByNameContaining("man");
      for(Iterator i = studentCourses.iterator(); i.hasNext();) {
        Object[] values = (Object[]) i.next();
        for(int j = 0; j < values.length; j++) System.out.print(values[j] + " ");
        System.out.println();

      }
      System.out.println("---- Find departments with average cap ----");
      List departmentCap = departmentRepo.findByDepartmentHavingAvg();
      for(Iterator i = departmentCap.iterator(); i.hasNext();) {
        Object[] values = (Object[]) i.next();
        for(int j = 0; j < values.length; j++) System.out.print(values[j] + " ");
        System.out.println();

      }
    };
  }
}
