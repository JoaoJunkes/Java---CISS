import { CompanieService } from './../companie.service';
import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-companies-list',
  templateUrl: './companies-list.component.html',
  styleUrls: ['./companies-list.component.css']
})
export class CompaniesListComponent implements OnInit {

  companies: Array<any>;

  constructor(private companieService: CompanieService) { }

  ngOnInit() {
    this.listar();
  }

  listar(){
    this.companieService.listar().subscribe(data => this.companies = data);

  }

}
