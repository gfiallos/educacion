import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']})
export class HomeComponent implements OnInit {
  itemCount: number = 4;
  btnText: string = "Value";
  inputPlaceholder: string = "Goal";
  goalText: string = "Goal text";
  goals: any;
  constructor(private _data: DataService) {

   }
  
  ngOnInit(): void {
    this._data.goals.subscribe(res => this.goals = res);
    this.itemCount = this.goals.length;
    this._data.changeGoal(this.goals);
  }
  addItem() {
    this.goals.push(this.goalText);
    this.goalText = "";
    this.itemCount = this.goals.length;
    this._data.changeGoal(this.goals);
  }
  removeItem(i: number) {
    this.goals.splice(i, 1);
    this.itemCount = this.goals.length;
    this._data.changeGoal(this.goals);
  }
}
