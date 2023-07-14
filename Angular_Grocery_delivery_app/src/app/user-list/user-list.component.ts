import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserServiceService } from '../user-service.service';

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {
 
  users:any=[];
  constructor(private route:Router,private userService:UserServiceService){

  }
  ngOnInit(): void {
    this.getUserList();
  }
  getUserList(){
    this.userService.getUserListService().subscribe(
      data=>{this.users=data}
    );
  }

  logOut()
{
  this.route.navigate(['/welcome'])
}
 back()
 {
   this.route.navigate(['/adminHome'])
}

}
