import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StockHandlerComponent } from './stock-handler.component';

describe('StockHandlerComponent', () => {
  let component: StockHandlerComponent;
  let fixture: ComponentFixture<StockHandlerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StockHandlerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StockHandlerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
