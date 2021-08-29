import { Injectable } from '@angular/core';
import { FLOP_DATA } from '../data/flopData';

@Injectable({
  providedIn: 'root'
})
export class FlopsService {
  data = FLOP_DATA;
  constructor() { }
  leftIndex = 1;
  rightIndex = 1;
  message = "";
  result = true;
  calulateIndex() {
    this.leftIndex = Math.floor(Math.random() * this.data.length);
    this.rightIndex = Math.floor(Math.random() * this.data.length);
    if (this.rightIndex == this.leftIndex) {
     this.rightIndex = Math.floor(Math.random() * this.data.length); 
    }
    this.message = "";
    this.result = true;
  }
  reset() {
    this.calulateIndex();
  }
  getLeft() {
    return this.data[this.leftIndex];
  }
  getRight() {
    return this.data[this.rightIndex];
  }
  checkIsCorrect(selected:any) {
    if (this.message!=="") {
      return;
    }
    var stars = selected.stars;
    
    this.result = stars<=this.data[this.leftIndex].stars&&stars<=this.data[this.rightIndex].stars;
    this.message = (this.result) ? "That's Correct " : "That's no Correct";
  }
  resultType() {
    if (this.message === "") {
      return "";
    }
    return this.result ? "alert alert-success" : "alert alert-danger";
  }
}
