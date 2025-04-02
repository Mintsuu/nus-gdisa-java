package com.example.todolist;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller 
public class TodoController {
  public TodoController() {}

  @GetMapping("/list")
  public String list(Model model, HttpSession sessionObj) {
    List<String> todoList = (List<String>) sessionObj.getAttribute("todolist-session");

    model.addAttribute("todoList", todoList);
    return "todos";
  }

  @PostMapping("/add")
  public String add(@RequestParam("todo") String todo, HttpSession sessionObj) {
    List<String> todoList;

    if(sessionObj.getAttribute("todolist-session") == null) todoList = new ArrayList<String>();
    else todoList = (List<String>) sessionObj.getAttribute("todolist-session");

    todoList.add(todo);
    sessionObj.setAttribute("todolist-session", todoList);

    return "redirect:/list";
  }

  @PostMapping("/clear-session")
  public String destroySession(HttpSession sessionObj) {
    sessionObj.removeAttribute("todolist-session");
    return "redirect:/list";
  }
}
