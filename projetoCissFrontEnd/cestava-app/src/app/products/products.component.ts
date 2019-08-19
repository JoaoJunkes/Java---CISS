import { CartProductService } from './../cart-product.service';
import { ProductService } from './../product.service';
import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {

  products: Array<any>;

  constructor(private productService: ProductService, private cartProductService: CartProductService, private route: ActivatedRoute) { }

  ngOnInit() {
    this.route.params.subscribe(parametros => {
      if (parametros['id']){
        this.listar(parametros['id']);
      }
    })
  
  }

  listar(id){
    console.log("chamou")
    this.productService.listar(id).subscribe(data => this.products = data);

  }

  addCarrinho(id){
    this.cartProductService.addCarrinho(id);

    
  }

}
