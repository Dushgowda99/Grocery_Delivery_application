import { Component,OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../user';
import { AdminServiceService } from '../admin-service.service';


@Component({
  selector: 'app-sign-in-admin',
  templateUrl: './sign-in-admin.component.html',
  styleUrls: ['./sign-in-admin.component.css']
})
export class SignInAdminComponent implements OnInit{

  user=new User( 0,"" ,"","","","","","","","");
  message=" "

  constructor(private route:Router,private adminService:AdminServiceService){

  }

  ngOnInit(): void {
    
  }
 
  public loginAdmin(){
    this.adminService.adminloginService(this.user).subscribe(
      data=>{console.log("Logged In Success"), this.route.navigate(['/adminHome'])},
      error=>{console.log("Login Failed"),console.log(error),this.message="Login Failed.Enter valid Credentials"}
    )
  }


  public back(){
    this.route.navigate(['register'])
  }
}
