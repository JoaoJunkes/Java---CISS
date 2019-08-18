import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  productsUrl = 'http://localhost:8080/productsComp/';

  constructor(private http: HttpClient) { }

  listar(id) {
    return this.http.get<any[]>(`${this.productsUrl}`+id);
  
  }
}
