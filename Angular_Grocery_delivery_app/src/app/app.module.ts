import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { AdminComponent } from './admin/admin.component';
import { RegisterComponent } from './Register/register.component';
import { SignUpAdminComponent } from './sign-up-admin/sign-up-admin.component';
import { SignInAdminComponent } from './sign-in-admin/sign-in-admin.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { SignUpUserComponent } from './sign-up-user/sign-up-user.component';
import { SignInUserComponent } from './sign-in-user/sign-in-user.component';
import { RegisterUserComponent } from './register-user/register-user.component';
import { AdminHomeComponent } from './admin-home/admin-home.component';
import { AddItemComponent } from './add-item/add-item.component';
import { ItemListComponent } from './item-list/item-list.component';
import { UpdateItemComponent } from './update-item/update-item.component';
import { CartListComponent } from './cart-list/cart-list.component';
import { PaymentListComponent } from './payment-list/payment-list.component';
import { UserListComponent } from './user-list/user-list.component';
import { UserHomeComponent } from './user-home/user-home.component';
import { ItemListForUserComponent } from './item-list-for-user/item-list-for-user.component';
import { CartListForUserComponent } from './cart-list-for-user/cart-list-for-user.component';
import { PaymentForUserComponent } from './payment-for-user/payment-for-user.component';


@NgModule({
  declarations: [
    AppComponent,
    WelcomeComponent,
    AdminComponent,
    RegisterComponent,
    SignUpAdminComponent,
    SignInAdminComponent,
    SignUpUserComponent,
    SignInUserComponent,
    RegisterUserComponent,
    AdminHomeComponent,
    AddItemComponent,
    ItemListComponent,
    UpdateItemComponent,
    CartListComponent,
    PaymentListComponent,
    UserListComponent,
    UserHomeComponent,
    ItemListForUserComponent,
    CartListForUserComponent,
    PaymentForUserComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
