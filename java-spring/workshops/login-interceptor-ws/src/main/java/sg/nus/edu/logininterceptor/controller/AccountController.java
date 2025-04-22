package sg.nus.edu.logininterceptor.controller;

import jakarta.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {
  @GetMapping("/edit") 
  public String edit(HttpSession session) {
    // Todo: only allow logged-in users to access this page
    return "account-edit";
  }

  @GetMapping("/delete") 
  public String delete(HttpSession session) {
    // Todo: only allow logged-in users to access this page

    return "account-delete";
  }
}
