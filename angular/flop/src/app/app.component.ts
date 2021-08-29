import { Component } from '@angular/core';
import { FlopsService } from './service/flops.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'flop';
  constructor(public flops: FlopsService) {
    flops.calulateIndex();
  }
  played() {
    if (this.flops.message === "") {
      return "display:none";
    }
    return "";
  }
  selectFlop(flop:any) {
    console.log("Selected", flop);
    this.flops.checkIsCorrect(flop);
  }
}
