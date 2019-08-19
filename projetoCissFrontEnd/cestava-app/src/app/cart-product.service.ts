import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CartProductService {

  cartUrl = 'http://localhost:8080/productsCart/';

  constructor(private http: HttpClient) { }

  listar() {
    return this.http.get<any[]>(`${this.cartUrl}`);
  
  }

  addCarrinho(id){

  }

}
