package sg.edu.nus.course_crud.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sg.edu.nus.course_crud.model.Course;
import sg.edu.nus.course_crud.repository.CourseRepository;


@Service
@Transactional(readOnly = true)
public class CourseServiceImpl implements CourseService {
  @Autowired
  private CourseRepository courseRepository;

  @Override
  public List<Course> findAllCourses() {
    return courseRepository.findAll();
  }

  @Override
  public void createCourse(Course course) {
    courseRepository.save(course);
  }
}
