import { CartProductService } from '../cart-product.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cart-component',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {

  products: Array<any>;

  constructor(private cartProductService: CartProductService) { }

  ngOnInit() {
      this.listar();
  
  }

  listar(){

    this.cartProductService.listar().subscribe(data => this.products = data);

  }

  addCarrinho(id){
    
    this.cartProductService.addCarrinho(id);
  }

  clearCarrinho(){
    this.cartProductService.clearCarrinho();
  }

}
