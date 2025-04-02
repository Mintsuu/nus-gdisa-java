package sg.edu.nus.GoldLake.interfacemethods;

import java.util.List;

import sg.edu.nus.GoldLake.model.Product;

public interface ProductInterface {
  public boolean saveProduct(Product product);
  public List<Product> SearchProductByName(String name);
  public List<Product> SearchProductByCategory(String category);
}
