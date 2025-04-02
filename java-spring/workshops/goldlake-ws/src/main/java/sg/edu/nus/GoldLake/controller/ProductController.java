package sg.edu.nus.GoldLake.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sg.edu.nus.GoldLake.interfacemethods.ProductInterface;
import sg.edu.nus.GoldLake.service.ProductImplementation;

@Controller
public class ProductController {
  @Autowired
  private ProductInterface pservice;
  @Autowired
  public void setProductService(ProductImplementation pserviceImpl) {
    this.pservice = pserviceImpl;
  }
  @GetMapping("/")
  public String getSearchPage(Model model) {
    return "searchProducts";
  }
  
  @GetMapping(value="/all/product/searching")
  public String search(@RequestParam("keyword") String k, @RequestParam("searchtype") String t, Model model) {
    String name=new String("name");
    String catagory=new String("category");

    if(t.equals(name)) {
      model.addAttribute("products",
        pservice.SearchProductByName(k));
    } else if(t.equals(catagory)) {
      model.addAttribute("products",
        pservice.SearchProductByCategory(k));
    } else {
      return "error";
    }

    return "searchResults";
  }
}
