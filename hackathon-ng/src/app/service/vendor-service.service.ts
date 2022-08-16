import { HttpClient } from '@angular/common/http';
import { ThrowStmt } from '@angular/compiler';
import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';
import { Flight } from '../model/flight.model';

@Injectable({
  providedIn: 'root'
})
export class VendorServiceService {

  flight$ = new BehaviorSubject<Flight[]>([]);

  postApi: string;
  getApi: string;

  constructor(private http : HttpClient) {
    this.postApi = 'http://localhost:3289/flights';
    this.getApi = 'http://localhost:3289/flights';
   }

  postFlight(flight: Flight): Observable<any> {
    return this.http.post(this.postApi, flight);
  }

  fetchFlights(): Observable<Flight[]> {
    return this.http.get<Flight[]>(this.getApi);
  }
}
