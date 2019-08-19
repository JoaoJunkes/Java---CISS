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
import { CartComponent } from './cart/cart.component';
import { DetailsCompanieComponent } from './details-companie/details-companie.component';
import {DataViewModule} from 'primeng/dataview';

@NgModule({
  declarations: [
    AppComponent,
    CompaniesComponent,
    ProductsComponent,
    CartComponent,
    DetailsCompanieComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    CardModule,
    ButtonModule,
    ToolbarModule,
    ContextMenuModule,
    DataViewModule
  ],
  providers: [CompanieService,
              ProductService],
  bootstrap: [AppComponent]
})
export class AppModule { }
