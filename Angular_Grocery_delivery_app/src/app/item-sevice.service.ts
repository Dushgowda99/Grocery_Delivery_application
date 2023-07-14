import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Item } from './item';

@Injectable({
  providedIn: 'root'
})
export class ItemSeviceService {

  constructor(private http:HttpClient) { }
  private url ="http://localhost:8089/api/item";
  public addItemService(item:Item):Observable<Object>{
    console.log("in item service")
    return this.http.post<any>("http://localhost:8089/api/item",item)
  }
  public getItemListService():Observable<Item[]>{
    console.log("inside item service get Item list")
    return this.http.get<Item[]>("http://localhost:8089/api/item")
  }
  public deleteItemService(item_id:number):Observable<any>
{
  console.log("Deleted successfully");
  return this.http.delete(`${this.url}/${item_id}`);
  
}
public getItemByIdService(item_id:number):Observable<Item>
{
  
  return this.http.get<Item>(`${this.url}/${item_id}`);
}
public updateItemService(item_id:number,item:Item):Observable<any>
{
  return this.http.put(`${this.url}/${item_id}`,item);
}
}
