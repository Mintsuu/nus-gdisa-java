package sg.nus.edu.logininterceptor.controller;
import jakarta.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CommonController {
  @GetMapping("/login")
  public String login() {
    return "login";
  }
  
  @PostMapping("/login") 
  public String handleLogin(@RequestParam("username") String username, Model model, HttpSession session) {
    // Todo: log users in successfully if username equals "dipsa"
    if(!username.equalsIgnoreCase("dipsa")) return "login";
    session.setAttribute("isLoggedIn", true);
    return "redirect:/product/list";
  }

  @GetMapping("/logout")
  public String logout() {
    // Todo: delete all information in the current session
    
    return "login";
  }
}
