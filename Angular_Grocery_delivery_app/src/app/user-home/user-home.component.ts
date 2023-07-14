import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-user-home',
  templateUrl: './user-home.component.html',
  styleUrls: ['./user-home.component.css']
})
export class UserHomeComponent implements OnInit{
 user_id:any;
 user_id1:any;
  constructor(private route:Router,private activatedRouter:ActivatedRoute){

  }
  ngOnInit(): void {
   this.user_id= this.activatedRouter.snapshot.params['user_id'];
   console.log(this.user_id1);
  }

  itemListForUser(){
    this.route.navigate(['/itemListForUser',this.user_id]);
  }
  logOut(){
    this.route.navigate(['welcome'])
  }

}
