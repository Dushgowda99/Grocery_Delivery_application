import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ItemSeviceService } from '../item-sevice.service';
import { CartServiceService } from '../cart-service.service';
import { Cart } from '../cart';

@Component({
  selector: 'app-item-list-for-user',
  templateUrl: './item-list-for-user.component.html',
  styleUrls: ['./item-list-for-user.component.css']
})
export class ItemListForUserComponent implements OnInit{
 user_id:any;
  items:any=[];
  cart=new Cart(0,"",0,0);

  constructor(private route:Router,private itemService:ItemSeviceService,private activatedRoute:ActivatedRoute,
    private cartService:CartServiceService){

  }
  ngOnInit(): void {
    this.user_id=this.activatedRoute.snapshot.params['user_id'];
    this.getItemListForUser();

  }
  getItemListForUser(){
    this.itemService.getItemListService().subscribe(
      data=>{this.items=data}
    );
  }
  addToCart(item_id:number){
    console.log("add to cart"+item_id,this.user_id);
      this.cartService.addCartItemService(item_id,this.user_id,this.cart).subscribe(
        data=>{console.log(data),
      
     this.route.navigate(['cartListForUserComponent',item_id,this.user_id])
         } );
  }
  logOut(){
    this.route.navigate(['welcome'])
  }
  back(){
    this.route.navigate(['/userHome'])
  }

}
