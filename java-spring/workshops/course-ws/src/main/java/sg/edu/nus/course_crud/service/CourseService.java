package sg.edu.nus.course_crud.service;
import java.util.List;
import sg.edu.nus.course_crud.model.Course;

public interface CourseService {
  List<Course> findAllCourses();
  void createCourse(Course course);
}
