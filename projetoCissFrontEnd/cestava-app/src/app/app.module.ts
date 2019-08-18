import { AppRoutingModule } from './app.routing.module';
import { HttpClientModule } from '@angular/common/http';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { CompaniesComponent } from './companies/companies.component';
import { CompanieService } from './companie.service';
import { ProductsComponent } from './products/products.component';
import { ProductService } from './product.service';

import {CardModule} from 'primeng/card';
import {ButtonModule} from 'primeng/button';
import {ToolbarModule} from 'primeng/toolbar';
import {ContextMenuModule} from 'primeng/contextmenu';

@NgModule({
  declarations: [
    AppComponent,
    CompaniesComponent,
    ProductsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    CardModule,
    ButtonModule,
    ToolbarModule,
    ContextMenuModule
  ],
  providers: [CompanieService,
              ProductService],
  bootstrap: [AppComponent]
})
export class AppModule { }
