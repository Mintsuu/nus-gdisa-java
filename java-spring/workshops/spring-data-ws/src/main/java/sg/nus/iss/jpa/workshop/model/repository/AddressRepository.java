package sg.nus.iss.jpa.workshop.model.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.nus.iss.jpa.workshop.model.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {
  public List<Address> findByCountryEquals(String country);
}
