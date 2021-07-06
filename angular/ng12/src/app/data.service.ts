import { Injectable } from '@angular/core';
import { BehaviorSubject } from "rxjs"

@Injectable({
  providedIn: 'root'
})
export class DataService {
   goals = new BehaviorSubject<any>(["AAAA", "Second"]);
  constructor() { }
  changeGoal(goal:any) {
    this.goals.next(goal);
  }
}
