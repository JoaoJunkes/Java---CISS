package main;

import model.Companies;
import model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CestavaController {

    @Autowired
    private CompanieService companieService;

    @Autowired
    private ProductService productService;

    @RequestMapping("/companie")
    public List<Companies> getAllCompanies(){
        return companieService.getAllCompanies();
    }

    @RequestMapping("/companie/{id}")
    public Companies getCompanie(@PathVariable String id){
        return companieService.getCompanie(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/companies")
    public void addCompanie(@RequestBody Companies companies){

        companieService.addCompanie(companies);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/companies/{id}")
    public void updateCompanie(@RequestBody Companies companies, @PathVariable String id){

        companieService.updateCompanie(companies, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/companies/{id}")
    public void deleteCompanie(@PathVariable String id){

        companieService.deleteCompanie(id);
    }

    @RequestMapping("/product")
    public List<Products> getAllProducts(){ return productService.getAllProducts();}

    @RequestMapping("/productsComp/{id}")
    public List<Products> getProductsCompanie(@PathVariable String id){ return productService.getProductsCompanie(id);
    }

    @RequestMapping("/product/{id}")
    public Products getProduct(@PathVariable String id){ return productService.getProduct(id);
    }

}
