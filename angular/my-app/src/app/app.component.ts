import { Component } from '@angular/core';
import { RouterLink, RouterLinkActive, RouterOutlet } from '@angular/router';
import { AdvertiseComponent } from "./advertise/advertise.component";
import { InterestingComponent } from "./interesting/interesting.component";
import { AddPersonComponent } from "./add-person/add-person.component";
import { NewsComponent } from "./news/news.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, RouterLink, RouterLinkActive, AdvertiseComponent, InterestingComponent, AddPersonComponent, NewsComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'my-app';
}
