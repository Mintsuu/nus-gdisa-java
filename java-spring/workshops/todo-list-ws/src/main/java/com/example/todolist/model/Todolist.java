package com.example.todolist.model;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.ToString;

@ToString
public class Todolist {
  @Getter
  private List<String> todos;
  public Todolist() {
    this.todos = new ArrayList<String>(); 
  }

  public void addTodo(String task) {
    this.todos.add(task);
  }
}
