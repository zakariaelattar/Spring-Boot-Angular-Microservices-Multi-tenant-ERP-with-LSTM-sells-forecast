import {Routes} from '@angular/router';

import {DashboardComponent} from '../../pages/dashboard/dashboard.component';
import {IconsComponent} from '../../pages/icons/icons.component';
import {MapComponent} from '../../pages/map/map.component';
import {NotificationsComponent} from '../../pages/notifications/notifications.component';
import {ProductDashboardComponent} from '../../pages/products/productDashboard/ProductDashboard.component';
import {TablesComponent} from '../../pages/tables/tables.component';
import {TypographyComponent} from '../../pages/typography/typography.component';
import {CreateProductComponent} from '../../pages/products/createProduct/createProduct.component';
import {CreateWarehouseComponent} from '../../pages/warehouses/create-warehouse/create-warehouse.component';
import {ReplenishmentComponent} from '../../pages/warehouses/replenishment/replenishment.component';
import {StockMovementsComponent} from '../../pages/warehouses/stock-movements/stock-movements.component';
import {CreateTiersComponent} from '../../pages/tiers/create-tiers/create-tiers.component';
import {CreateSuplierComponent} from '../../pages/tiers/create-suplier/create-suplier.component';
import {CreateClientComponent} from '../../pages/tiers/create-client/create-client.component';
import {WarehouseDashboardComponent} from '../../pages/warehouses/warehouse-dashboard/warehouse-dashboard.component';
import {TiersDashboardComponent} from '../../pages/tiers/tiers-dashboard/tiers-dashboard.component';
import {UsersComponent} from '../../pages/users/users.component';
import {CompanyComponent} from '../../pages/company/company.component';
// import { RtlComponent } from "../../pages/rtl/rtl.component";

export const AdminLayoutRoutes: Routes = [
  {path: 'dashboard', component: DashboardComponent},
  {path: 'icons', component: IconsComponent},
  {path: 'maps', component: MapComponent},
  {path: 'users', component: UsersComponent},
  {path: 'company', component: CompanyComponent},
  {path: 'notifications', component: NotificationsComponent},
  {path: 'products', component: ProductDashboardComponent},
  {path: 'tables', component: TablesComponent},
  {path: 'typography', component: TypographyComponent},
  {path: 'products', component: ProductDashboardComponent},
  {path: 'products/create', component: CreateProductComponent},
  {path: 'warehouses', component: WarehouseDashboardComponent},
  {path: 'warehouses/create', component: CreateWarehouseComponent},
  {path: 'warehouses/replenishment', component: ReplenishmentComponent},
  {path: 'warehouses/stock-movements', component: StockMovementsComponent},
  {path: 'tiers', component: TiersDashboardComponent},
  {path: 'tiers/create', component: CreateTiersComponent},
  {path: 'tiers/supliers/create', component: CreateSuplierComponent},
  {path: 'tiers/clients/create', component: CreateClientComponent}

  // { path: "rtl", component: RtlComponent }
];
