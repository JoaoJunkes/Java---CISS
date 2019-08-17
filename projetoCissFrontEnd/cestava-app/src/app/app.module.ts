import { HttpClientModule } from '@angular/common/http';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { CompaniesListComponent } from './companies-list/companies-list.component';
import { CompanieService } from './companie.service';

@NgModule({
  declarations: [
    AppComponent,
    CompaniesListComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [CompanieService],
  bootstrap: [AppComponent]
})
export class AppModule { }
