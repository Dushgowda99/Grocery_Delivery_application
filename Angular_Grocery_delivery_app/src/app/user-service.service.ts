import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from './user';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserServiceService {

  constructor(private http:HttpClient) { }

  public userloginService(user:User):Observable<any>
  {
    return this.http.post<any>("http://localhost:8089/api/users/login",user)
  }
  public userCreateService(user:User):Observable<any>
  {
    return this.http.post<any>("http://localhost:8089/api/users",user)
  }
  public getUserListService():Observable<User[]>{
  
    return this.http.get<User[]>("http://localhost:8089/api/users")
  }
}
