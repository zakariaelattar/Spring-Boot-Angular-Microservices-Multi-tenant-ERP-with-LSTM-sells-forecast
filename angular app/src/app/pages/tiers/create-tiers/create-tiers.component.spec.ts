import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateTiersComponent } from './create-tiers.component';

describe('CreateTiersComponent', () => {
  let component: CreateTiersComponent;
  let fixture: ComponentFixture<CreateTiersComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CreateTiersComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateTiersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
