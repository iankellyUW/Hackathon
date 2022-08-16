import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomerflightsComponent } from './customerflights.component';

describe('CustomerflightsComponent', () => {
  let component: CustomerflightsComponent;
  let fixture: ComponentFixture<CustomerflightsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CustomerflightsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CustomerflightsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
