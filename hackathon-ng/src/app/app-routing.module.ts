import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CustomerflightsComponent } from './component/customerflights/customerflights.component';
import { VendorflightsComponent } from './component/vendorflights/vendorflights.component';

const routes: Routes = [
  {path:'vendor', component: VendorflightsComponent},
  {path:'customer', component: CustomerflightsComponent}
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes),
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
