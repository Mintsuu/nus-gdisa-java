package com.example.customer.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.customer.model.Customer;
import com.example.customer.validator.CustomerValidator;

import jakarta.validation.Valid;

@Controller 
public class CustomerController {
  @Autowired 
  private CustomerValidator customerValidator;

  @InitBinder 
  private void initCustomerBinder(WebDataBinder binder) {
    binder.addValidators(customerValidator);
  }

  @GetMapping("customer/create")
  public String createCustomer(Model model) {
    model.addAttribute("customer", new Customer());
    return "create-customer";
  }

  @PostMapping("customer/create")
  public String saveCustomerAction(@Valid @ModelAttribute Customer customer,BindingResult bindingResult, Model model) {
    System.out.println(bindingResult.getClass());
    if(bindingResult.hasErrors()) return "create-customer";
    model.addAttribute("customer", customer);
    return "create-customer-success";
  }
}
