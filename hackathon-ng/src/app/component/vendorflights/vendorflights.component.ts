import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Flight } from 'src/app/model/flight.model';
import { VendorServiceService } from 'src/app/service/vendor-service.service';

@Component({
  selector: 'app-vendorflights',
  templateUrl: './vendorflights.component.html',
  styleUrls: ['./vendorflights.component.css']
})
export class VendorflightsComponent implements OnInit {

  message: string;
  vendorForm: FormGroup;
  formValid: boolean;

  constructor(private vendorService: VendorServiceService) { }

  ngOnInit(): void {
    this.formValid = false;
    this.message = '';
    this.vendorForm = new FormGroup ({
      source: new FormControl('', [Validators.required,Validators.pattern(/^[a-zA-Z ]+$/)]),
      destination: new FormControl('', [Validators.required,Validators.pattern(/^[a-zA-Z ]+$/)]),
      departureDate: new FormControl(''),
      departureTime: new FormControl(''),
      arrivalDate: new FormControl(''),
      arrivalTime: new FormControl(''),
      duration: new FormControl('', [Validators.required,Validators.pattern(/^([0-1]?[0-9]|2[0-3]):[0-5][0-9]$/)]),
      fareAdult: new FormControl(''),
      fareChild: new FormControl(''),
      totalSeats: new FormControl('')
    })
  }

  onFormSubmit() {
    let flights: Flight = {
      source: this.vendorForm.value.source,
      destination: this.vendorForm.value.destination,
      departureDate: this.vendorForm.value.departureDate,
      departureTime: this.vendorForm.value.departureTime,
      arrivalDate: this.vendorForm.value.arrivalDate,
      arrivalTime: this.vendorForm.value.arrivalTime,
      journeyDuration: this.vendorForm.value.duration,
      adultFare: this.vendorForm.value.fareAdult,
      childFare: this.vendorForm.value.fareChild,
      totalSeats: this.vendorForm.value.totalSeats
    }

    console.log(flights);
    this.vendorService.postFlight(flights).subscribe({
      next: (data) => {
        this.message = 'Flight Added Successfully';
      },
      error: (e) => {
        this.message = 'Failed to Add Flight';
        console.log(e);
      }
    })
  }
}
