import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NeftPaymentComponent } from './neft-payment.component';

describe('NeftPaymentComponent', () => {
  let component: NeftPaymentComponent;
  let fixture: ComponentFixture<NeftPaymentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NeftPaymentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NeftPaymentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
