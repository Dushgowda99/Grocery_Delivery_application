export class Payment {
     paymentId:number;
	 paymentType:String;
     amount:number;
   
	
     constructor(
        paymentId:number,
        paymentType:String,
        amount:number,
        
     ){
        this.paymentId=paymentId;
        this.paymentType=paymentType;
        this.amount= amount;
     
     }
}
