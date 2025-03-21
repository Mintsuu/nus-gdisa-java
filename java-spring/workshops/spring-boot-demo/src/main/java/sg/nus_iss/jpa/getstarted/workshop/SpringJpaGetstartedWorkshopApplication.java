package sg.nus_iss.jpa.getstarted.workshop;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import sg.nus_iss.jpa.getstarted.workshop.model.domain.Course;
import sg.nus_iss.jpa.getstarted.workshop.model.repository.CourseRepository;

@SpringBootApplication
public class SpringJpaGetstartedWorkshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaGetstartedWorkshopApplication.class, args);
	}

  @Bean
  CommandLineRunner runMe(CourseRepository courseRepo) {
    return args -> {
      System.out.println("Retrieving course list from database");
      List<Course> courses = courseRepo.findAll();
      courses.forEach(course -> System.out.println(course));
    }; }

}
