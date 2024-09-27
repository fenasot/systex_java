import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Person } from '../../person';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-list-persons',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './list-persons.component.html',
  styleUrl: './list-persons.component.css'
})
export class ListPersonsComponent implements OnInit{

  persons: Person[] = [];

  constructor(private http:HttpClient) {}

  ngOnInit(): void {
    let baseUrl = "http://localhost:8080/eBiz/api/persons";
    this.http.get<PersonResponse>(baseUrl)
    .subscribe({
      next:(data)=>{this.persons = data._embedded.persons},
      error:(error)=>{console.error("loding persons data error due to ", error)},
      complete:()=>{
        this.persons.forEach((person) => {
          let href = person._links.self.href;
          let index = href.lastIndexOf("/");
          person.id = href.substring(index+1);
        })
      }
    });
  }

}

interface PersonResponse {
  _embedded: {
    persons: Person[],
    _links: {
      self:{href:string},
      profile:{href:string}
    }
  }
}
