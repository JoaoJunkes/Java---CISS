import { TestBed } from '@angular/core/testing';

import { CompanieService } from './companie.service';

describe('CompanieService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: CompanieService = TestBed.get(CompanieService);
    expect(service).toBeTruthy();
  });
});
