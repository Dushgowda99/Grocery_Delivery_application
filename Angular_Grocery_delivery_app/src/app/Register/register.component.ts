import { Component,OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit{

  constructor(private route:Router){
 }
  ngOnInit(): void {
    
  }
public signUpAdmin(){
this.route.navigate(['/signUpAdmin'])
}
public signInAdmin(){
this.route.navigate(['/signInAdmin'])
}
public back(){
  this.route.navigate([''])
}
}
