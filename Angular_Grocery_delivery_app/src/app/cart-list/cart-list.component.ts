import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CartServiceService } from '../cart-service.service';

@Component({
  selector: 'app-cart-list',
  templateUrl: './cart-list.component.html',
  styleUrls: ['./cart-list.component.css']
})
export class CartListComponent implements OnInit{
  carts:any=[];
  constructor(private route:Router,private cartService:CartServiceService){

  }
  ngOnInit(): void {
    this.getCartList();
  }
  getCartList(){
    this.cartService.getCartListService().subscribe(
      data=>{this.carts=data}
    );
  }
  back(){
    this.route.navigate(['/adminHome'])
  }
  logOut(){
    this.route.navigate(['welcome'])
  }

}
