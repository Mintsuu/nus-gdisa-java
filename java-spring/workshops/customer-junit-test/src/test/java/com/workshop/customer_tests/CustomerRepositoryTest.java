package com.workshop.customer_tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.workshop.customer.CustomerTestsApplication;
import com.workshop.customer.model.Customer;
import com.workshop.customer.model.repository.CustomerRepository;

@SpringBootTest(classes = CustomerTestsApplication.class)
public class CustomerRepositoryTest {
  @Autowired
  private CustomerRepository customerRepository;

  @Test
  @DisplayName("Should create a new customer")
  public void testSaveEntity() {
    List<Customer> customerListBefore = customerRepository.findAll();
    Customer cust = new Customer();
    cust.setName("Jessica");
    cust.setHandPhoneNumber("9481274");
    cust.setAddress("84 Jalan Jalan Lah");
    customerRepository.save(cust);
    List<Customer> customerListAfter = customerRepository.findAll();
    assertTrue(customerListAfter.size() > customerListBefore.size(), "The new customer should've been added.");
  }

  @Test
  @DisplayName("Should list all customers")
  public void getAllCustomers() {
    List<Customer> customerList = customerRepository.findAll();
    System.out.println(customerList);
    assertFalse(customerList.isEmpty(), "All customers should be listed.");
  }

  @Test 
  @DisplayName("Should select a customer by their name")
  public void selectOneCustomerByName() {
    List<Customer> findCustomer = customerRepository.findCustomersByName("Jessica");
    assertFalse(findCustomer.size() <= 0, "There should be at least 1 customer found.");
  }

  @Test 
  @DisplayName("Should delete a customer by their name")
  public void deleteOneCustomerByName() {
    List<Customer> custBefore = customerRepository.findCustomersByName("Jessica");
    customerRepository.deleteCustomerByName("Jessica");
    List<Customer> custAfter = customerRepository.findCustomersByName("Jessica");

    assertTrue(custAfter.size() < custBefore.size(), "The provided customer should've been deleted.");
  }
}
