
package sg.edu.nus.GoldLake.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import sg.edu.nus.GoldLake.interfacemethods.ProductInterface;
import sg.edu.nus.GoldLake.model.Product;
import sg.edu.nus.GoldLake.repository.ProductRepository;

@Service
@Transactional
public class ProductImplementation implements ProductInterface {
  @Autowired
  ProductRepository prepo;
  @Override
  @Transactional
  public boolean saveProduct(Product product) {
    if (prepo.save(product) != null)
    return true;
    else
    return false;
  }
  @Override
  @Transactional
  public List<Product> SearchProductByName(String
    name) {
    return prepo.SearchProductByName(name);
  }
  @Override
  @Transactional
  public List<Product>
  SearchProductByCategory(String category) {
    return
    prepo.SearchProductByCategory(category);
  }
}
