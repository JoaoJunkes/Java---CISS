import { ActivatedRoute } from '@angular/router';
import { CompanieService } from '../companie.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-details-companie',
  templateUrl: './details-companie.component.html',
  styleUrls: ['./details-companie.component.css']
})
export class DetailsCompanieComponent implements OnInit {

  companie: Array<any>;

  constructor(private companieService: CompanieService, private route: ActivatedRoute) { }

  ngOnInit() {
    this.route.params.subscribe(parametros => {
      if (parametros['id']){

        this.detailsCompanie(parametros['id']);

      }
    })
  
  }

  detailsCompanie(id){
    this.companieService.detailsCompanie(id).subscribe(data => this.companie = data);

  }

}
