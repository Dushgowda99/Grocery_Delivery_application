import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { PaymentServiceService } from '../payment-service.service';

@Component({
  selector: 'app-payment-list',
  templateUrl: './payment-list.component.html',
  styleUrls: ['./payment-list.component.css']
})
export class PaymentListComponent implements OnInit{
  
  payments:any=[];
  constructor(private route:Router,private paymentService:PaymentServiceService){

  }
  ngOnInit(): void {
    this.getPaymentList();
  }
  getPaymentList(){
    this.paymentService.getPaymentListService().subscribe(
      data=>{this.payments=data}
    );
  }
  logOut(){
    this.route.navigate(['welcome'])
  }
  back(){
    this.route.navigate(['/adminHome'])
  }
}
