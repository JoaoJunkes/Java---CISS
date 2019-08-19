import { Injectable } from '@angular/core';
import { HttpClient , HttpHeaders} from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class CartProductService {

  cartUrl = 'http://localhost:8080/productsCart/';

  cartAddUrl = 'http://localhost:8080/addProductCart/'

  cartClearUrl = 'http://localhost:8080/clearCarrinho/'

  constructor(private http: HttpClient) { }

  listar() {
    return this.http.get<any[]>(`${this.cartUrl}`);
  
  }

  addCarrinho(id) {
    
    return this.http.post(this.cartAddUrl, id);
  }

  clearCarrinho(){
    return this.http.post(this.cartClearUrl, null);
  }

}
