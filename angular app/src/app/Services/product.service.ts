import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Product} from "../pages/products/model/Product";

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  private BASE_URL = "http://localhost:8088/can_product_service/";
  private All_PRODUCTS = this.BASE_URL + "getAll";
  private DEL_PRODUCT = this.BASE_URL;
  private UP_PRODUCT = this.BASE_URL + "update/";

  constructor(private http: HttpClient) {
  }

  /**
   * Fetching Products
   */

  getAll(): Observable<Product[]> {

    return this.http.get<Product[]>(this.All_PRODUCTS);


  }

  /**
   * Create a product
   */
  postProduct(product: Product): Observable<Product> {
    return this.http.post<Product>(this.BASE_URL, product);
  }
}
