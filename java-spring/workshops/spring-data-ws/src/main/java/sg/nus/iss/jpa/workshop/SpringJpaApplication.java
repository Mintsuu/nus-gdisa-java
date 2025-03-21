package sg.nus.iss.jpa.workshop;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import sg.nus.iss.jpa.workshop.model.Address;
import sg.nus.iss.jpa.workshop.model.Customer;
import sg.nus.iss.jpa.workshop.model.repository.AddressRepository;
import sg.nus.iss.jpa.workshop.model.repository.CustomerRepository;

@SpringBootApplication
public class SpringJpaApplication {
  public static void main(String[] args) {
    SpringApplication.run(SpringJpaApplication.class, args);
  }

  @Bean
  public CommandLineRunner commandLineRun (AddressRepository addressRepo, CustomerRepository customerRepo) {
    return args -> {
      System.out.println("----- Create some addresses");
      addressRepo.save(new Address("21 Lower Kent Ridge Rd", "Singapore", "SG" ));
      addressRepo.save(new Address("50 Nanyang Ave", "Singapore", "SG" ));
      addressRepo.save(new Address("450 Serra Mall, Stanford", "California", "USA" ));
      addressRepo.save(new Address("OX1 2JD", "Oxford", "UK" ));

      System.out.println("----- Find all addresses");
      List<Address> myAddresses = addressRepo.findAll();
      myAddresses.forEach((address) -> System.out.println(address.toString()));

      System.out.println("----- Find addresses by country SG");
      List<Address> sgAddresses = addressRepo.findByCountryEquals("SG");
      sgAddresses.forEach((address) -> System.out.println(address.toString()));

      System.out.println("----- Create some customers");
      customerRepo.save(new Customer("Emma", "emma@example.com"));
      customerRepo.save(new Customer("Robert", "robert@example.com"));
      customerRepo.save(new Customer("Jewel", "jewel@example.com"));

      System.out.println("----- Find all customers");
      List<Customer> allCustomers = customerRepo.findAll();
      allCustomers.forEach((customer) -> System.out.println(customer.toString()));

      System.out.println("----- Find all customers in country SG");
      List<Customer> sgCustomers = customerRepo.findByCountry("SG");
      sgCustomers.forEach((customer) -> System.out.println(customer.toString()));
    };
  }
}
