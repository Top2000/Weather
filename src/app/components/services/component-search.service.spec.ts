import { TestBed } from '@angular/core/testing';

import { ComponentSearchService } from "./componentSearchService";

describe('ComponentSearchService', () => {
  let service: ComponentSearchService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ComponentSearchService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});