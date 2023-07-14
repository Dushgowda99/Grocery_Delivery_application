import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ItemListForUserComponent } from './item-list-for-user.component';

describe('ItemListForUserComponent', () => {
  let component: ItemListForUserComponent;
  let fixture: ComponentFixture<ItemListForUserComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ItemListForUserComponent]
    });
    fixture = TestBed.createComponent(ItemListForUserComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
