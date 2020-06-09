import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";
import { Routes, RouterModule } from "@angular/router";
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { UserComponent } from './user/user.component';
import { ViewuserComponent } from './viewuser/viewuser.component';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { UseraddressComponent } from './useraddress/useraddress.component';
import { UserdocumentComponent } from './userdocument/userdocument.component';
import { HttpClientModule } from '@angular/common/http';
import { UserbranchComponent } from './userbranch/userbranch.component';
import { BranchComponent } from './branch/branch.component';
import { AddBranchComponent } from './add-branch/add-branch.component';
import { ViewBranchComponent } from './view-branch/view-branch.component';
import { AddressComponent } from './address/address.component';
import { ViewAddressComponent } from './view-address/view-address.component';
import { PaymentMethodComponent } from './payment-method/payment-method.component';
import { CardPaymentComponent } from './card-payment/card-payment.component';
import { NeftPaymentComponent } from './neft-payment/neft-payment.component';
import { PhonepayPaymentComponent } from './phonepay-payment/phonepay-payment.component';
import { RoleComponent } from './role/role.component';
import { StatusViewComponent } from './status-view/status-view.component';
import { RoleViewComponent } from './role-view/role-view.component';
import { StatusComponent } from './status/status.component';

const adminrouting: Routes = [
  { path: "admindashboard", component: AdmindashboardComponent },
  {
    path: "user", component: UserComponent,
    children: [
      { path: 'useraddress', component: UseraddressComponent },
      { path: 'userdocument', component: UserdocumentComponent },
      { path: 'userbranch', component: UserbranchComponent }
    ]
  },
  { path: "viewuser", component: ViewuserComponent },
  {
    path: "branch", component: BranchComponent,
    children: [
      { path: "addbranch", component: AddBranchComponent },
      { path: "viewbranch", component: ViewBranchComponent }
  ]},
  { path: "address", component: AddressComponent },
  { path: "viewaddress", component: ViewAddressComponent },
  { path: "payment", component: PaymentMethodComponent },
  { path: "card", component:CardPaymentComponent },
  { path: "neft", component: NeftPaymentComponent },
  { path: "phonepay", component: PhonepayPaymentComponent },
  { path: "role", component: RoleComponent },
  { path: "viewrole", component: RoleViewComponent },
  { path: "status", component: StatusComponent },
  { path: "viewstatus", component: StatusViewComponent }
]
@NgModule({
      declarations: [AdmindashboardComponent,
        UserComponent,
        ViewuserComponent,
        UseraddressComponent,
        UserdocumentComponent,
        UserbranchComponent,
        BranchComponent,
        AddBranchComponent,
        ViewBranchComponent,
        AddressComponent,
        ViewAddressComponent,
        PaymentMethodComponent,
        CardPaymentComponent,
        NeftPaymentComponent,
        PhonepayPaymentComponent,
        RoleViewComponent,
        RoleComponent,
        StatusViewComponent,
        StatusComponent
      ],
      imports: [CommonModule,
        RouterModule.forChild(adminrouting),
        ReactiveFormsModule,
        HttpClientModule,
        FormsModule
      ]
    })
export class AdminModule { }
