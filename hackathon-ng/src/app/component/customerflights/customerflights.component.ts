import { Component, OnInit } from '@angular/core';
import { flush } from '@angular/core/testing';
import { FormControl, FormGroup } from '@angular/forms';
import { Flight } from 'src/app/model/flight.model';
import { VendorServiceService } from 'src/app/service/vendor-service.service';

@Component({
  selector: 'app-customerflights',
  templateUrl: './customerflights.component.html',
  styleUrls: ['./customerflights.component.css']
})
export class CustomerflightsComponent implements OnInit {

  message: string;
  customerForm: FormGroup;
  flights: Flight[];
  flightResults: Flight[];
  bookingConfirmation: Flight;
  hideSearch: boolean;
  showResults: boolean;
  showConfirmation: boolean;

  searchDep: string;
  searchArr: string;
  searchDate: string;

  constructor(private vendorService: VendorServiceService) { }

  ngOnInit(): void {
    this.message = '';
    this.hideSearch = false;
    this.showResults = false;
    this.showConfirmation = false;
    this.customerForm = new FormGroup ({
      source: new FormControl(''),
      destination: new FormControl(''),
      departureDate: new FormControl('')
    })
  }

  onFormSubmit() {
    this.vendorService.fetchFlights().subscribe({
      next: (data)=> {
        this.flights = data;
        this.vendorService.flight$.next(this.flights);
      },
      error: (e)=> {
        this.message = 'Failed to fetch flights';
        console.log(e);
      }
      
    })
    this.vendorService.flight$.subscribe(data => {
      this.flights = data;
    })
    this.searchDep = this.customerForm.value.source;
    this.searchArr = this.customerForm.value.destination;
    this.searchDate = this.customerForm.value.departureDate;
    this.hideSearch = true;
    this.showResults = true;
    let results = this.flights.filter(obj => {
      return obj.departureDate === this.searchDate;
    })
    results = results.filter(obj => {
      return obj.source === this.searchDep;
    })
    results = results.filter(obj => {
      return obj.destination === this.searchArr;
    })
    this.flightResults = results;
  }

  book(flight: number) {
    this.bookingConfirmation = this.flightResults[flight];
    this.showConfirmation = true;
  }
}
