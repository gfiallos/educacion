import { Component, OnInit ,Input, Output, EventEmitter} from '@angular/core';

@Component({
  selector: 'app-flopselector',
  templateUrl: './flopselector.component.html',
  styleUrls: ['./flopselector.component.css']
})
export class FlopselectorComponent implements OnInit {

  constructor() { }
  @Input() flop:any;
  @Output() selectFlop=new EventEmitter();  
  ngOnInit(): void {
  }
  selectFlopData() {
    this.selectFlop.emit(this.flop);
 }
}
