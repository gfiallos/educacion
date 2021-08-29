import { TestBed } from '@angular/core/testing';

import { FlopsService } from './flops.service';

describe('FlopsService', () => {
  let service: FlopsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(FlopsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
