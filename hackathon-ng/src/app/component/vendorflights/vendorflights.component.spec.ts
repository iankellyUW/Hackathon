import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VendorflightsComponent } from './vendorflights.component';

describe('VendorflightsComponent', () => {
  let component: VendorflightsComponent;
  let fixture: ComponentFixture<VendorflightsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ VendorflightsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(VendorflightsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
