package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
  @GetMapping("/hello")
  public String hello(Model model) {
    Person p = new Person();
    p.setFirstName("Harrison");
    p.setLastName("Ford");

    model.addAttribute("person", p);
    return "display-person";
  } 
}
