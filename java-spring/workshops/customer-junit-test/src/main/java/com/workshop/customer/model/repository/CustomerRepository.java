package com.workshop.customer.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.workshop.customer.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
  @Query("SELECT c FROM Customer c WHERE c.name = :name")
  public List<Customer> findCustomersByName(@Param("name") String name);

  @Query("DELETE FROM Customer c WHERE c.name = :name")
  public void deleteCustomerByName(@Param("name") String name);
}
