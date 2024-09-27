import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { Person } from '../../person';

@Component({
  selector: 'app-add-person',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './add-person.component.html',
  styleUrl: './add-person.component.css'
})
export class AddPersonComponent implements OnInit{

  constructor(private http:HttpClient, private route:Router) {}


  ngOnInit(): void {
  }

  onAddPerson(data:any) {
    // console.log(data.firstname);
    // console.log(data.lastname);
    // console.log(data.street);
    // console.log(data.city);
    let person = new Person(undefined, data.firstname, data.lastname, data.street, data.city, {self:{href:""}});
    let baseUrl = "http://localhost:8080/eBiz/api/persons";
    this.http.post(baseUrl,person).subscribe({
      next:(data)=>{console.log("Person created successfully, ", data)},
      error:(error)=>{console.log("Person created vailed, ", error)},
      complete:()=>{
        console.log("Process complite...");
        this.route.navigate(["list-persons"]);
      }
     })
  }

}
