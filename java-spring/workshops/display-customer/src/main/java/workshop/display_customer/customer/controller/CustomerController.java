package workshop.display_customer.customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import workshop.display_customer.customer.model.Customer;

@Controller 
public class CustomerController {
  @GetMapping("/")
  public String displayCustomer(Model model) {
    Customer customer = new Customer(1, "Jane", "94727124", "99 Jalan Jalan Lah" );
    model.addAttribute("customer", customer);
    return "display-customer";
  }

  @GetMapping("/customer")
  public String enterDetails(Model model) {
    model.addAttribute("customer", new Customer(1, "Jane", "test", "test"));
    return "save-customer";
  }

  @PostMapping("/customer")
  public String saveCustomer(@ModelAttribute Customer customer) {
    System.out.println(customer.getName());
    return "save-customer";
  }
}
