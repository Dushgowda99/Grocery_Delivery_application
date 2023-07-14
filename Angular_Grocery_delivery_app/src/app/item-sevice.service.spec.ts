import { TestBed } from '@angular/core/testing';

import { ItemSeviceService } from './item-sevice.service';

describe('ItemSeviceService', () => {
  let service: ItemSeviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ItemSeviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
