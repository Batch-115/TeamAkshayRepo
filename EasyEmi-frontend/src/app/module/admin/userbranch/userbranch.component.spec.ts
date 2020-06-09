import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UserbranchComponent } from './userbranch.component';

describe('UserbranchComponent', () => {
  let component: UserbranchComponent;
  let fixture: ComponentFixture<UserbranchComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UserbranchComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UserbranchComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
