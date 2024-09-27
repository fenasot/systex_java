import { Component } from '@angular/core';

@Component({
  selector: 'app-interesting',
  standalone: true,
  imports: [],
  templateUrl: './interesting.component.html',
  styleUrl: './interesting.component.css'
})
export class InterestingComponent {
  title="奇聞軼事"
  month = ["jan","feb","mar","apr","may","jun","jul","org","sep","oct","nov","dec"];
  isavailable = true;
}
