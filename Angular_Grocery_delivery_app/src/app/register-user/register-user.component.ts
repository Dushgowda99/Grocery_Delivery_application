import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register-user',
  templateUrl: './register-user.component.html',
  styleUrls: ['./register-user.component.css']
})
export class RegisterUserComponent implements OnInit {

  constructor(private route:Router){
  }
   ngOnInit(): void {
     
   }
 public signUpUser(){
 this.route.navigate(['/signUpUser'])
 }
 public signInUser(){
 this.route.navigate(['/signInUser'])
 }
 public back(){
   this.route.navigate(['welcome'])
 }

}
