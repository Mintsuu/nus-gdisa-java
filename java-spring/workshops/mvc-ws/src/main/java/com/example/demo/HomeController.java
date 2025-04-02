package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
  @GetMapping("/")
  public String getHomePage() {
    return "home-page";
  }

  @PostMapping("/submit")
  public String postSubmitPage(@RequestParam String name) {
    return "forward:/result";
  } 

  @GetMapping("/submit")
  public String getSubmitPage(Model model, @RequestParam String name) {
    model.addAttribute("username", name);
    return "redirect:/result/" + name;
  }

  @PostMapping("/result")
  public String postResultPage(Model model, @RequestParam String name) {
    model.addAttribute("username", name);
    System.out.println(name);
    return "result-page";
  }

  @GetMapping("/result/{name}")
  public String getResultPage(Model model, @PathVariable("name") String name) {
    model.addAttribute("username", name);
    System.out.println(name);
    return "result-page";
  } 
}
