import { Component,OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent implements OnInit  {


  constructor(private route:Router){
    
  }
  ngOnInit(): void {
    
  }
  public registerAdmin(){
    this.route.navigate(['register'])
  }
  public registerUser(){
    this.route.navigate(['registerUser'])
  }

}
