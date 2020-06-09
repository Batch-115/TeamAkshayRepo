import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PhonepayPaymentComponent } from './phonepay-payment.component';

describe('PhonepayPaymentComponent', () => {
  let component: PhonepayPaymentComponent;
  let fixture: ComponentFixture<PhonepayPaymentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PhonepayPaymentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PhonepayPaymentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
