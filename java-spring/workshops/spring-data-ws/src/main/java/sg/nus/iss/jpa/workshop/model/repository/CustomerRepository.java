package sg.nus.iss.jpa.workshop.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sg.nus.iss.jpa.workshop.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
  @Query("SELECT c FROM Address a, Customer c WHERE a.id = c.id")
  public List<Customer> findByCountry(@Param("country") String country);
}
