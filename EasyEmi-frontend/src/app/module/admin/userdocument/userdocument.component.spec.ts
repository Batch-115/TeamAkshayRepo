import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UserdocumentComponent } from './userdocument.component';

describe('UserdocumentComponent', () => {
  let component: UserdocumentComponent;
  let fixture: ComponentFixture<UserdocumentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UserdocumentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UserdocumentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
