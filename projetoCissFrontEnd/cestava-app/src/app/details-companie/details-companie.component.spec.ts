import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DetailsCompanieComponent } from './details-companie.component';

describe('DetailsCompanieComponent', () => {
  let component: DetailsCompanieComponent;
  let fixture: ComponentFixture<DetailsCompanieComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DetailsCompanieComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DetailsCompanieComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
