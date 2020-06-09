import { Component, OnInit } from '@angular/core';
import { AdminService } from '../adminservices/admin.service';
import { ActivatedRoute, Router } from '@angular/router';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { RxwebValidators } from '@rxweb/reactive-form-validators';

@Component({
  selector: 'app-userdocument',
  templateUrl: './userdocument.component.html',
  styleUrls: ['./userdocument.component.scss']
})
export class UserdocumentComponent implements OnInit {
  
  constructor(
    private adminSer : AdminService, 
    private router : Router, 
    private route : ActivatedRoute ) { }

  ngOnInit() {
    this.adminSer.isUserActive=false;
    this.adminSer.isuserDocumentDisabled=false;
  }

  selectFile(event,name){
    console.log(event)
    const reader = new FileReader();
    console.log(name)
    //Select File
    if ((name === "adharCard") && event.target.files && event.target.files.length > 0 ) {
      console.log(name)
      reader.onload = (e: any) => {
         this.adminSer.adharCard= e.target.result;
         this.adminSer.isAdharDisplay=true;
        //console.log(this.adminSer.adharCard)
      }
      reader.readAsDataURL(event.target.files[0]);
      //console.log(name)
    }
    if ((name === "panCard") && event.target.files && event.target.files.length > 0) {
      reader.onload = (e: any) => {
        this.adminSer.panCard = e.target.result;
        this.adminSer.isPanCardDisplay=true;
        //console.log(this.adminSer.panCard)
      }
      reader.readAsDataURL(event.target.files[0]);
      //console.log(name)
    }
    if ((name === "passbook") && event.target.files && event.target.files.length > 0) {
      reader.onload = (e: any) => {
        this.adminSer.passbook = e.target.result;
        this.adminSer.isPassbookDisplay=true;
        //console.log(this.adminSer.passbook)
      }
      reader.readAsDataURL(event.target.files[0]);
      //console.log(name)
    }
    if ((name === "userPhoto") && event.target.files && event.target.files.length > 0) {
      reader.onload = (e: any) => {
        this.adminSer.userPhoto = e.target.result;
        this.adminSer.isUserPhotoDisplay=true;
        //console.log(this.adminSer.userPhoto)
      }
      reader.readAsDataURL(event.target.files[0]);
     // console.log(name)
    }
  }

  onUserDocumentSubmit(){
    this.adminSer.userDocument.patchValue({
      adharCard : this.adminSer.adharCard,
      panCard : this.adminSer.panCard,
      userPhoto : this.adminSer.userPhoto,
      passbook : this.adminSer.passbook
    });
    console.log(this.adminSer.user.value);
    let uid =this.adminSer.user.get("userId").value;
    if (uid === "null"){
      console.log("in user dcoument register")
    this.adminSer.registerUser(this.adminSer.user.value).subscribe();
    } else {
      console.log("in user dcoument update")
      this.adminSer.updateUser(this.adminSer.user.value).subscribe();
    }
    this.adminSer.isPanCardDisplay=false;
    this.adminSer.isAdharDisplay=false;
    this.adminSer.isPassbookDisplay=false;
    this.adminSer.isUserPhotoDisplay=false;
    this.adminSer.isUserAddressDisabled=true;
    this.adminSer.isuserDocumentDisabled=true;
    this.adminSer.isUserBranchDisabled=true;
    this.adminSer.isViewUserDisabled=false;
    this.adminSer.isUserActive=true;
    this.router.navigate(['../'], {relativeTo : this.route});
  }
}
