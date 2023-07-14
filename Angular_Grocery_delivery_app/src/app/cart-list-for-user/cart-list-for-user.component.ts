import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { CartServiceService } from '../cart-service.service';
import { Cart } from '../cart';
import { PaymentServiceService } from '../payment-service.service';
import { Payment } from '../payment';

@Component({
  selector: 'app-cart-list-for-user',
  templateUrl: './cart-list-for-user.component.html',
  styleUrls: ['./cart-list-for-user.component.css']
})
export class CartListForUserComponent implements OnInit {
carts:any=[];
cart_id:any;
user_id:any;
payment=new Payment(0,"",0);
amount:any;
paymentId:any;
  constructor(private route:Router,private cartService:CartServiceService,private activatedRoute:ActivatedRoute,
    private paymentService:PaymentServiceService){

  }
  ngOnInit(): void {
   
   this.user_id= this.activatedRoute.snapshot.params['user_id'];
   console.log("inside ng Oninit"+this.user_id);
    this.getCart();
  }
  getCart(){
    console.log("inside getCart"+this.user_id);
    this.cartService.getCartItemByUserIdService(this.user_id).subscribe(
      data=>{this.carts=data}
    );
  }
  orderNow(cart_id:number){
    console.log("inside order now"+cart_id,this.user_id);
    this.route.navigate(['/paymentForUserComponent',cart_id,this.user_id])
   
  }

  back(){
    this.route.navigate(['/itemListForUser'])
  }
  logOut(){
    this.route.navigate(['welcome'])
  }
  

}
