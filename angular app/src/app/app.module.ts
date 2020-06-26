import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {NgModule} from '@angular/core';
import {FormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import {RouterModule} from '@angular/router';
import {ToastrModule} from 'ngx-toastr';

import {AppComponent} from './app.component';
import {AdminLayoutComponent} from './layouts/admin-layout/admin-layout.component';
import {AuthLayoutComponent} from './layouts/auth-layout/auth-layout.component';

import {NgbModule} from '@ng-bootstrap/ng-bootstrap';

import {AppRoutingModule} from './app-routing.module';
import {ComponentsModule} from './components/components.module';
import {ProductDashboardComponent} from './pages/products/productDashboard/ProductDashboard.component';


import {ProfileComponent} from './pages/profile/profile.component';
import {BoardModeratorComponent} from './pages/board-moderator/board-moderator.component';
import {BoardUserComponent} from './pages/board-user/board-user.component';
import {BoardAdminComponent} from './pages/board-admin/board-admin.component';
import {HomeComponent} from './pages/home/home.component';
import {RegisterComponent} from './pages/register/register.component';
import {LoginComponent} from './pages/login/login.component';
import { StockHandlerComponent } from './pages/products/stock-handler/stock-handler.component';
import { WarehousesComponent } from './pages/warehouses/warehouses.component';
import { CreateWarehouseComponent } from './pages/warehouses/create-warehouse/create-warehouse.component';
import { StockMovementsComponent } from './pages/warehouses/stock-movements/stock-movements.component';
import { ReplenishmentComponent } from './pages/warehouses/replenishment/replenishment.component';
import { TiersComponent } from './pages/tiers/tiers.component';
import { CreateTiersComponent } from './pages/tiers/create-tiers/create-tiers.component';
import { CreateSuplierComponent } from './pages/tiers/create-suplier/create-suplier.component';
import { CreateClientComponent } from './pages/tiers/create-client/create-client.component';
import { TiersDashboardComponent } from './pages/tiers/tiers-dashboard/tiers-dashboard.component';
import { WarehouseDashboardComponent } from './pages/warehouses/warehouse-dashboard/warehouse-dashboard.component';
import { UsersComponent } from './pages/users/users.component';
import { CompanyComponent } from './pages/company/company.component';

@NgModule({
  imports: [
    BrowserAnimationsModule,
    FormsModule,
    HttpClientModule,
    ComponentsModule,
    NgbModule,
    RouterModule,
    AppRoutingModule,
    ToastrModule.forRoot()
  ],
  declarations: [
    AppComponent,
    AdminLayoutComponent,
    AuthLayoutComponent,
    ProductDashboardComponent,
    AppComponent,
    LoginComponent,
    RegisterComponent,
    HomeComponent,
    BoardAdminComponent,
    BoardUserComponent,
    BoardModeratorComponent,
    ProfileComponent,
    StockHandlerComponent,
    WarehousesComponent,
    CreateWarehouseComponent,
    StockMovementsComponent,
    ReplenishmentComponent,
    TiersComponent,
    CreateTiersComponent,
    CreateSuplierComponent,
    CreateClientComponent,
    TiersDashboardComponent,
    WarehouseDashboardComponent,
    UsersComponent,
    CompanyComponent
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
