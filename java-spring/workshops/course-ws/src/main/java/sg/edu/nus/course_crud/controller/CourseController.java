package sg.edu.nus.course_crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sg.edu.nus.course_crud.model.Course;
import sg.edu.nus.course_crud.service.CourseService;

@Controller
@RequestMapping("course")
public class CourseController {
  @Autowired
  private CourseService courseService;

  @GetMapping("/list")
  public String listCourses(Model model) {
    model.addAttribute("courses", courseService.findAllCourses());

    return "course-list";
  } 

  @GetMapping("/create")
  public String courseCreationForm(@ModelAttribute Course course, Model model) {
    String code = (String) model.getAttribute("code");
    System.out.println(code);
    return "course-create";
  }

  @PostMapping("/create")
  public String createCourse(@ModelAttribute Course course) {
    courseService.createCourse(course);
    return "redirect:/course/list";
  }
}
