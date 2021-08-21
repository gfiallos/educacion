import { Component,OnDestroy, OnInit } from '@angular/core';
import { MoviesService } from './services/movies/movies.service';
import { RentalFeeCalculatorService } from './services/retable/rental-fee-calculator.service';
import { HttpClient } from '@angular/common/http';
import { Subject } from 'rxjs';
import { Movie } from './services/movies/movie';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnDestroy, OnInit{
  title = 'GF';
  dtOptions: DataTables.Settings = {};
  dtTrigger: Subject<any> = new Subject<any>();
  realData: Movie[] = [];
  constructor(public movies: MoviesService,
    public calculator: RentalFeeCalculatorService,
  private httpClient: HttpClient) { }
  
  onTest(e:Event,message:string) {
    console.log("test",e,e.target,message,this.calculator.calculate());
  }
  onVote(index: number) {
    this.movies.changeStatus(index);
  }
  ngOnInit(): void {
    this.dtOptions = {
      pagingType: 'full_numbers',
      pageLength: 2
    };
    this.httpClient.get<Movie[]>('assets/data/data.json')
      .subscribe(data => {
        this.realData = (data as any).data;
        // Calling the DT trigger to manually render the table
        this.dtTrigger.next();
      });
  }

  ngOnDestroy(): void {
    // Do not forget to unsubscribe the event
    this.dtTrigger.unsubscribe();
  }
}
