import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { PaymentServiceService } from '../payment-service.service';
import { Payment } from '../payment';

@Component({
  selector: 'app-payment-for-user',
  templateUrl: './payment-for-user.component.html',
  styleUrls: ['./payment-for-user.component.css']
})
export class PaymentForUserComponent implements OnInit {
  payment=new Payment(0,"",0);
  user_id:any;
  cart_id:any;
  message="";
 payment1:any=[];
  constructor(private route: Router,private paymentService:PaymentServiceService,private activatedRoute:ActivatedRoute){

  }
  ngOnInit(): void {
    this.cart_id= this.activatedRoute.snapshot.params['cart_id'];
    this.user_id= this.activatedRoute.snapshot.params['user_id'];
    
  }
  generatePayment(){
    console.log("inside generate payment"+this.cart_id,this.user_id)
    console.log(this.payment);
    console.log(typeof this.payment.amount,typeof this.payment.paymentType);
     this.paymentService.addPaymentService(this.cart_id,this.user_id,this.payment).subscribe(
      data=>{this.payment1=data,
        alert("Order Successfull!,Your order will be delivered soon"),this.route.navigate(['welcome'])},
      
     );
  }
  
  back(){
   this.route.navigate(['/cartListForUserComponent'])
  }
  
}
