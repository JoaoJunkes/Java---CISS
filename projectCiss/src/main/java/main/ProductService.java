package main;

import model.Products;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Products> productsList = new ArrayList<Products>(Arrays.asList(
            new Products("1", "1", "PenDrive 500GB", "wwww.google.com"),
            new Products("2", "1", "Par de Meias", "wwww.google.com"),
            new Products("3", "1", "Farinha 1KG", "wwww.google.com"),
            new Products("4", "2", "Lavagem completa", "wwww.google.com"),
            new Products("5", "2", "Lavagem do guidão", "wwww.google.com")
    ));

    ArrayList<Products> auxList = new ArrayList<>();

    public List<Products> getAllProducts(){
        return productsList;
    }

    public Products getProduct(String id){
        return productsList.stream().filter(t -> t.getId().equals((id))).findFirst().get();
    }

    public List<Products> getProductsCompanie(String id){

        auxList.clear();
        for(int i = 0; i< productsList.size(); i++){

            Products product = productsList.get(i);

            if (product.getIdActivity().equals(id)){
                auxList.add(product);
            }
        }

        return auxList;
    }

    public void addProduct(Products product) {

        productsList.add(product);
    }

    public void updateProduct(Products cest, String id) {

        for(int i = 0; i< productsList.size(); i++){

            Products products = productsList.get(i);

            if (products.getId().equals(id)){
                productsList.set(i, cest);
            }
        }
    }

    public void deleteProduct(String id) {

        productsList.removeIf(t->t.getId().equals(id));
    }
}
