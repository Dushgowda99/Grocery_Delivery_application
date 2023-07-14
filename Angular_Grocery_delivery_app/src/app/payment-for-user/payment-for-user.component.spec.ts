import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PaymentForUserComponent } from './payment-for-user.component';

describe('PaymentForUserComponent', () => {
  let component: PaymentForUserComponent;
  let fixture: ComponentFixture<PaymentForUserComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [PaymentForUserComponent]
    });
    fixture = TestBed.createComponent(PaymentForUserComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
