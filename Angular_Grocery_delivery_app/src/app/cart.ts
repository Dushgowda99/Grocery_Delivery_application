export class Cart {
	 cart_id:number;
	 cartItemName:String;
	 quantity:number;
	 total_cost:number;

     constructor(
	    cart_id:number,
	    cartItemName:String,
	    quantity:number,
	    total_cost:number
     ){
        this.cart_id=cart_id;
        this.cartItemName=cartItemName;
        this.quantity=quantity;
        this.total_cost=total_cost;

     }
    }
