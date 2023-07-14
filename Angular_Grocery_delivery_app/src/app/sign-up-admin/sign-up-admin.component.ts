import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AdminServiceService } from '../admin-service.service';
import { User } from '../user';




@Component({
  selector: 'app-sign-up-admin',
  templateUrl: './sign-up-admin.component.html',
  styleUrls: ['./sign-up-admin.component.css']
})
export class SignUpAdminComponent implements OnInit{

  user=new User( 0,"","","","","","","","","");
  message=" "


  ngOnInit(): void {
    
  }

  constructor(private adminService:AdminServiceService,private route:Router){

  }
  public adminRegister(){
  this.adminService.adminCreateService(this.user).subscribe(
    _data=>{console.log("Registration Success"), this.route.navigate(['/signInAdmin'])},
    error=>{console.log("Registration Failed"),console.log(error),this.message="Registration Failed.Enter valid Credentials"}
  )
  }
  public back(){
  this.route.navigate(['register'])
  }
}

