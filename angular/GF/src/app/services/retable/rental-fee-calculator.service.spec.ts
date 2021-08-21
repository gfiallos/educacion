import { TestBed } from '@angular/core/testing';

import { RentalFeeCalculatorService } from './rental-fee-calculator.service';

describe('RentalFeeCalculatorService', () => {
  let service: RentalFeeCalculatorService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(RentalFeeCalculatorService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
