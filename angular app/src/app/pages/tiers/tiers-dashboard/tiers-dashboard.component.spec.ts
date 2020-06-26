import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TiersDashboardComponent } from './tiers-dashboard.component';

describe('TiersDashboardComponent', () => {
  let component: TiersDashboardComponent;
  let fixture: ComponentFixture<TiersDashboardComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TiersDashboardComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TiersDashboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
