import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Country} from "../pages/products/model/Country";

@Injectable({
  providedIn: 'root'
})
export class HelpersService {
  private COUNTRIES_URL = "http://localhost:8080/can_helper_service/";
  countries: Country[] = [];

  constructor(private http: HttpClient) {
  }

  getAllCountriesName() {
    /*this.http.get<Country[]>(this.COUNTRIES_URL).subscribe(
          res => {
            console.log("success");
            this.countries =  res;
            return this.countries;
          },
          err => {

          })
      }*/
    console.log("names");
    return ["maroc", "alger", "tunis"];

  }
}
