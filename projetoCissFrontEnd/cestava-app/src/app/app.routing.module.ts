import { CartComponent } from './cart/cart.component';
import { CompaniesComponent } from './companies/companies.component';
import { NgModule } from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import { ProductsComponent } from './products/products.component';
import { DetailsCompanieComponent } from './details-companie/details-companie.component';

const routes: Routes = [
    {path: '', component: CompaniesComponent},
    {path: 'products/:id', component: ProductsComponent},
    {path: 'productsCart', component: CartComponent},
    {path: 'detailsCompanie/:id', component: DetailsCompanieComponent}
    
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})

export class AppRoutingModule {}