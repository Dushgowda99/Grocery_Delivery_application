import { Component, OnInit } from '@angular/core';
import { Item } from '../item';
import { ActivatedRoute, Router } from '@angular/router';
import { ItemSeviceService } from '../item-sevice.service';

@Component({
  selector: 'app-update-item',
  templateUrl: './update-item.component.html',
  styleUrls: ['./update-item.component.css']
})
export class UpdateItemComponent implements OnInit{

item_id:any;
item:Item=new Item(0,"",0,0);
message=""

constructor(private activatedroute:ActivatedRoute,private itemService:ItemSeviceService,private route:Router)
   { 

   }
  ngOnInit(): void {
    this.item_id=this.activatedroute.snapshot.params["item_id"];
this.itemService.getItemByIdService(this.item_id).subscribe(
  data=>this.item=data,
 
  error=>console.log(error),
   
)
  }
  updateItem()
  {
    this.itemService.updateItemService(this.item_id,this.item).subscribe(
      data=>{console.log(data),
        alert("updated successfully")
      this.route.navigate(['/itemList'])},
      error=>console.log("updation failed")
    )
  }


  logOut()
  {
    this.route.navigate(['welcome'])
  }
}
