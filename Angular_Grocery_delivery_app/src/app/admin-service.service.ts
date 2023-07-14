import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class AdminServiceService {

  constructor(private http:HttpClient) { }

  public adminloginService(user:User):Observable<any>
  {
    return this.http.post<any>("http://localhost:8089/api/users/login",user)
  }
  public adminCreateService(user:User):Observable<any>
  {
    return this.http.post<any>("http://localhost:8089/api/users",user)
  }
}

