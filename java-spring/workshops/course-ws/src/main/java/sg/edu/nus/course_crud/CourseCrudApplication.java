package sg.edu.nus.course_crud;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import sg.edu.nus.course_crud.model.Course;
import sg.edu.nus.course_crud.repository.CourseRepository;

@SpringBootApplication
public class CourseCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseCrudApplication.class, args);
	}

  @Bean
  CommandLineRunner loadData(CourseRepository courseRepository) {
    return args -> {
      Course course1 = new Course("FOPCS", "Fundamentals of Programming in C#", "Introduction to programming concepts using the C# Language as the vehicle");
      courseRepository.save(course1);
      Course course2= new Course("OOPCS", "Object Oriented Programming", "Introduction to OOP concepts such as inheritance, polymorphism and interfaces");
      courseRepository.save(course2);
      Course course3 = new Course("ASP.NET", "Web Programming using ASP.NET", "Developing web applications using ASP.NET MVC");
      courseRepository.save(course3);
    };
  }
}
