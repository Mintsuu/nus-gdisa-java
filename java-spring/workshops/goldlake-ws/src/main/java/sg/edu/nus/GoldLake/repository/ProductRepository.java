package sg.edu.nus.GoldLake.repository;

import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sg.edu.nus.GoldLake.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
  @Query("Select p from Product as p where p.name like CONCAT('%',:k,'%') ")
  public ArrayList<Product> SearchProductByName(@Param("k") String keyword);
  @Query("Select p from Product as p where p.category like CONCAT('%',:k,'%') ")
  public ArrayList<Product> SearchProductByCategory(@Param("k") String keyword);
}
