import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Cart } from './cart';

@Injectable({
  providedIn: 'root'
})
export class CartServiceService {

  constructor(private http:HttpClient) {

   }
   private url="http://localhost:8089/api/cart";

   public addCartItemService(item_id:number,user_id:number,cart:Cart):Observable<Object>{
    console.log("In service"+item_id,user_id);
    return this.http.post<any>(`${this.url}/${item_id}/${user_id}`,cart)
  }
   public getCartItemByUserIdService(user_id:number):Observable<Cart[]>{
    console.log("inside service get cart item by user_id"+user_id);
   return this.http.get<Cart[]>(`${this.url}/${user_id}`);
  }
  public getCartListService():Observable<Cart[]>{
    return this.http.get<Cart[]>("http://localhost:8089/api/cart")
  }
  public deleteCartItemService(cart_id:number):Observable<any>
  {
    return this.http.delete(`${this.url}/${cart_id}`);

  }
  public getCartItemByIdService(cart_id:number):Observable<Cart>
  {
    
    return this.http.get<Cart>(`${this.url}/${cart_id}`);
  }
  public updateCartItemService(cart_id:number,cart:Cart):Observable<any>
  {
    return this.http.put(`${this.url}/${cart_id}`,cart);
  }
}
