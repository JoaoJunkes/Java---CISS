package main;

import model.Products;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    List<Products> productsList = new ArrayList<Products>(Arrays.asList(
            new Products("1", "1", "PenDrive 500GB", "https://a-static.mlcdn.com.br/618x463/pendrive-cruzer-blade-usb-16gb-sandisk/masterstock/310/1ad9ff793b0cf506e497c1dbc39d3854.jpg","20.00"),
            new Products("2", "1", "Par de Meias", "http://images.tcdn.com.br/img/img_prod/446328/par_de_meia_compressao_cano_medio_feminina_usa_218_1_20160829153646.jpg", "4.00"),
            new Products("3", "1", "Farinha 1KG", "https://mambo.vteximg.com.br/arquivos/ids/170617/7896419431015_farinha-de-trigo_anaconda-1-kg_01.jpg?v=635564191343700000", "2.99"),
            new Products("4", "2", "Lavagem completa", "https://cdn.wd40company.eu/wd-40/pt-PT/uploads/2018/07/12172407/como-lavar-bicicleta.jpg", "40.00"),
            new Products("5", "2", "Lavagem do guidão", "https://http2.mlstatic.com/guido-bicicleta-aco-preto-tipo-retr-beach-caicara-choppe-D_NQ_NP_856021-MLB20691174574_042016-F.jpg", "5.00")
    ));

    ArrayList<Products> carrinho = new ArrayList<>();

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

    public void addProductCart(String id) {


        Optional<Products> optionalProduct = productsList.stream().filter(prod -> prod.getId().equals(id)).findAny();

        if (optionalProduct.isPresent()) {
            carrinho.add(optionalProduct.get());
        }


    }

    public void deleteProductCart(String id) {

        carrinho.removeIf(t->t.getId().equals(id));
    }

    public void clearCart() {

        carrinho.clear();
    }

    public List<Products> getProductsCart(){

        return carrinho;
    }
}
