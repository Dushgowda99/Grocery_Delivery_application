import { Component, OnInit } from '@angular/core';
import { Item } from '../item';
import { Router } from '@angular/router';
import { ItemSeviceService } from '../item-sevice.service';

@Component({
  selector: 'app-item-list',
  templateUrl: './item-list.component.html',
  styleUrls: ['./item-list.component.css']
})
export class ItemListComponent implements OnInit{

 items:any=[];
constructor(private route:Router,private itemService:ItemSeviceService){

}

  ngOnInit(): void {
    this.getItemList();
  }
addItem(item_id:number)
{
  this.route.navigate(['/addItem',item_id])
}
updateItem(item_id:number)
{
  this.route.navigate(['/updateItem',item_id]);
}
deleteItem(item_id:number)
{
this.itemService.deleteItemService(item_id).subscribe(
 data=> {console.log("Failed to Delete")},
 error=>{console.log("Deleted successfully"),this.getItemList();}
);
}

getItemList(){

  this.itemService.getItemListService().subscribe(data => {
    this.items = data;
  });
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
