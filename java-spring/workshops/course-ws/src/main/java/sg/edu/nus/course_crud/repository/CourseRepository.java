package sg.edu.nus.course_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.nus.course_crud.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
