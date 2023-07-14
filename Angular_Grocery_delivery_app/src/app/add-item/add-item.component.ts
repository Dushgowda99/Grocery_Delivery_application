import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Item } from '../item';
import { ItemSeviceService } from '../item-sevice.service';

@Component({
  selector: 'app-add-item',
  templateUrl: './add-item.component.html',
  styleUrls: ['./add-item.component.css']
})
export class AddItemComponent implements OnInit {

  item =new Item(0,"",0,0);
  message=" "

  constructor(private route:Router,private itemService:ItemSeviceService){

  }
  ngOnInit(): void {
    
  }
  goToItemList(){
    this.route.navigate(['/itemList']);
  }

  saveItem(){
    this.itemService.addItemService(this.item).subscribe(
      data=>{console.log(data), this.goToItemList();},
      error=>{console.log(error)}
    )
    console.log("save item")
  }
  
  onSubmit(){
    console.log(this.item);
    this.saveItem();
    console.log("add item  onsubmit")
  }
  logOut(){
    this.route.navigate(['welcome'])
  }
  
  
}
