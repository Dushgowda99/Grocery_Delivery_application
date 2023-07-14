import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../user';
import { UserServiceService } from '../user-service.service';

@Component({
  selector: 'app-sign-in-user',
  templateUrl: './sign-in-user.component.html',
  styleUrls: ['./sign-in-user.component.css']
})
export class SignInUserComponent implements OnInit{

  user=new User( 0,"" ,"","","","","","","","");
  userId:any;
  message=" "
  
  constructor(private route:Router,private userService:UserServiceService){

  }

  ngOnInit(): void {
    
  }
 
  public loginUser(){
    this.userService.userloginService(this.user).subscribe(
      data=>{console.log("Logged In Success"),this.user=data,this.userId=this.user.userId,
      this.route.navigate(['/userHome',this.userId])},
      error=>{console.log("Login Failed"),console.log(error),
      this.message="Login Failed.Enter valid Credentials"}
    )
  }


  public back(){
    this.route.navigate(['registerUser'])
  }
}
