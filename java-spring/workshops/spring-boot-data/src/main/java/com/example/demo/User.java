package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity 
@Table(name = "my_custom_user_table")
public class User {
  @Id 
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Getter @Setter
  private String username;
  @Getter @Setter
  private String email;
  @Getter @Setter
  @Column(length = 50)
  private String lastName;

  public User() {

  }
}
