import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FlopselectorComponent } from './flopselector.component';

describe('FlopselectorComponent', () => {
  let component: FlopselectorComponent;
  let fixture: ComponentFixture<FlopselectorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FlopselectorComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FlopselectorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
