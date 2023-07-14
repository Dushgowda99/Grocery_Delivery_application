import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { Router } from '@angular/router';
import { UserServiceService } from '../user-service.service';

@Component({
  selector: 'app-sign-up-user',
  templateUrl: './sign-up-user.component.html',
  styleUrls: ['./sign-up-user.component.css']
})
export class SignUpUserComponent implements OnInit{

  user=new User( 0,"" ,"","","","","","","","");
  message=" "


  ngOnInit(): void {
    
  }

  constructor(private userService:UserServiceService,private route:Router){

  }
  public userRegister(){
  this.userService.userCreateService(this.user).subscribe(_data=>{console.log("registered succesfully" ),
  this.route.navigate(['/signInUser'])}
  );
  }
  public back(){
  this.route.navigate(['registerUser'])
  }

}
