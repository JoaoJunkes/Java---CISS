import { CompanieService } from '../companie.service';
import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-companies',
  templateUrl: './companies.component.html',
  styleUrls: ['./companies.component.css']
})
export class CompaniesComponent implements OnInit {

  companies: Array<any>;

  constructor(private companieService: CompanieService) { }

  ngOnInit() {
    this.listar();
  }

  listar(){
    this.companieService.listar().subscribe(data => this.companies = data);

  }

}
