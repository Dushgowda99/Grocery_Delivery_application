import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { WelcomeComponent } from './welcome/welcome.component';
import { AdminComponent } from './admin/admin.component';
import {RegisterComponent} from './Register/register.component'
import { SignUpAdminComponent } from './sign-up-admin/sign-up-admin.component';
import { SignInAdminComponent } from './sign-in-admin/sign-in-admin.component';
import { SignInUserComponent } from './sign-in-user/sign-in-user.component';
import { SignUpUserComponent } from './sign-up-user/sign-up-user.component';
import { RegisterUserComponent } from './register-user/register-user.component';
import { AdminHomeComponent } from './admin-home/admin-home.component';
import { ItemListComponent } from './item-list/item-list.component';
import { UpdateItemComponent } from './update-item/update-item.component';
import { CartListComponent } from './cart-list/cart-list.component';
import { PaymentListComponent } from './payment-list/payment-list.component';
import { UserListComponent } from './user-list/user-list.component';
import { AddItemComponent } from './add-item/add-item.component';
import { UserHomeComponent } from './user-home/user-home.component';
import { ItemListForUserComponent } from './item-list-for-user/item-list-for-user.component';
import { CartListForUserComponent } from './cart-list-for-user/cart-list-for-user.component';
import { PaymentForUserComponent } from './payment-for-user/payment-for-user.component';

const routes: Routes = [{path:'',component:WelcomeComponent},
{path:'welcome',component:WelcomeComponent},
{path:'register',component:RegisterComponent},
{path:'signUpAdmin',component:SignUpAdminComponent},
{path:'signInAdmin',component:SignInAdminComponent},
{path:'signUpUser',component:SignUpUserComponent},
{path:'signInUser',component:SignInUserComponent},
{path:'registerUser',component:RegisterUserComponent},
{path:'adminHome',component:AdminHomeComponent},
{path:'itemList',component:ItemListComponent},
{path:'cartList',component:CartListComponent},
{path:'paymentList',component:PaymentListComponent},
{path:'userList',component:UserListComponent},
{path:'addItem',component:AddItemComponent},
{path:'updateItem',component:UpdateItemComponent},
{path:'updateItem/:item_id',component: UpdateItemComponent},
{path:'userHome/:user_id',component:UserHomeComponent},
{path:'userHome',component:UserHomeComponent},
{path:'cartListForUserComponent',component:CartListForUserComponent},
{path:'itemListForUser',component:ItemListForUserComponent},
{path:'itemListForUser/:user_id',component:ItemListForUserComponent},
{path:'cartListForUserComponent',component:CartListForUserComponent},
{path:'cartListForUserComponent/:item_id/:user_id',component:CartListForUserComponent},
{path:'paymentForUserComponent',component:PaymentForUserComponent},
{path:'paymentForUserComponent/:cart_id/:user_id',component:PaymentForUserComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
