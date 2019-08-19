import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CompanieService {

  companiesUrl = 'http://localhost:8080/companies/';

  detailsCompanieUrl = 'http://localhost:8080/companie/';

  constructor(private http: HttpClient) { }

  listar() {
    return this.http.get<any[]>(`${this.companiesUrl}`);

  }

  detailsCompanie(id) {
    return this.http.get<any[]>(`${this.detailsCompanieUrl}`+id);
  }

}
