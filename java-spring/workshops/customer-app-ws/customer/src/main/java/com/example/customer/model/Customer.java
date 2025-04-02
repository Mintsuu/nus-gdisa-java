package com.example.customer.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

public class Customer {
  @Getter @Setter 
  @NotBlank(message = "Name is required") 
  @Size(min = 2, max = 30, message = "Must be between 2 and 30 characters long")
  private String name;
  @Getter @Setter 
  @NotBlank(message = "Email is required") 
  @Email(message = "Must be a valid email address")
  private String email;
  @Getter @Setter
  private String gender;
  @Getter @Setter
  private String creditCardNumber;
  @Getter @Setter
  private String creditCardExpiration;
  @Getter @Setter
  private String creditCardCVV;

  public Customer() {}
}
