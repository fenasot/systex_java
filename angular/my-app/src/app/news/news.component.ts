import { Component, OnInit } from '@angular/core';
import { SqrtPipe } from '../app.sqrt';
import { CommonModule, DatePipe } from '@angular/common';
import { MyDateService } from '../my-date.service';

@Component({
  selector: 'app-news',
  standalone: true,
  imports: [SqrtPipe, CommonModule],
  templateUrl: './news.component.html',
  styleUrl: './news.component.css'
})

export class NewsComponent implements OnInit{
  constructor(private myDateService:MyDateService){}

  ngOnInit(): void {
    this.todaydate = this.myDateService.showTodayDate();
  }
  title = "最新消息";
  months = ["jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"];
  isavailable = true;
  monthSelected = "";
  todaydate: any;

  myClickFunction(event:any) {
    // alert("Button is clicked");
    console.log(event);
    this.isavailable = !this.isavailable;
  }

  changemonths(event:any) {
    console.log(event.target.value);
    this.monthSelected = event.target.value;
  }
}
