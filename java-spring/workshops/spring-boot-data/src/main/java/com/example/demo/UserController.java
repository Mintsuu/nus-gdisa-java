package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
  @Autowired
  private UserRepository userRepository;
  @GetMapping("/findByUsername/{username}")
  public String findUserByUsername(@PathVariable String username){
    // using List is more flexible
    List<User> users = userRepository.findByUsername(username);
    if (!users.isEmpty()) {
      users.forEach(user -> {
        System.out.println(user.getUsername());
        System.out.println(user.getLastName()); });
      return "User(s) found and printed in the console.";
    } else {
      return "No users found with username: " + username;
    }
  }

  @GetMapping("/create")
  public String createUser() {
    userRepository.createNewUserByName("janettan", "janet@example.com", "tan");
    return "User added to database";
  }
}
