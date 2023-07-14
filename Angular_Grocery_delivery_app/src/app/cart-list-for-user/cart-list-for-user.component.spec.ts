import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CartListForUserComponent } from './cart-list-for-user.component';

describe('CartListForUserComponent', () => {
  let component: CartListForUserComponent;
  let fixture: ComponentFixture<CartListForUserComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CartListForUserComponent]
    });
    fixture = TestBed.createComponent(CartListForUserComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
