import {Component, OnInit} from '@angular/core';
import {ProductService} from '../../../Services/product.service';
import {Product} from '../model/Product';
import {Country} from '../model/Country';
import {HelpersService} from '../../../Services/helpers.service';
import {Observable} from 'rxjs';


@Component({
  selector: 'app-products',
  templateUrl: 'createProduct.component.html'
})
export class CreateProductComponent implements OnInit {
  products: Product[] = [];
  product: Product;
  countries: Country[];


  constructor(private productService: ProductService, private helpersService: HelpersService) {
  }

  ngOnInit() {
    this.getAll();
    let countries;
    countries = this.helpersService.getAllCountriesName();
  }

  /**
   *  Create a product
   *
   */
  public create(product: Product) {

    this.productService.postProduct(product).subscribe(
      res => {

        console.log('product created with success');
        this.getAll();
        this.products.push(res);
      },
      err => {
        console.log('error during creating product' + err);
      }
    )
  }

  /**
   *  GET all products
   *
   */
  public getAll() {

    this.productService.getAll().subscribe(
      res => {
        this.products = res;
        console.log('operation done.');
        console.log(this.products);
      },
      err => {
        console.log(err);
      })
  }

}
