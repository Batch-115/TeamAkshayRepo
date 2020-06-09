import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { AdminService } from '../adminservices/admin.service';
import { RoleDisplayDto } from '../DTO/RoleDisplayDto';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.scss']
})
export class UserComponent implements OnInit {
  public role : RoleDisplayDto[];

  constructor(private router : Router, private route : ActivatedRoute, private adminser : AdminService) { }

  ngOnInit() {
    this.adminser.getDisplayRole().subscribe((data : RoleDisplayDto[]) => {
      this.role=data;
      console.log(data)
    })
  }

  get firstName(){
    return this.adminser.user.get('firstName')
  }

  
  get middleName(){
    return this.adminser.user.get('middleName')
  }

  get lastName(){
    return this.adminser.user.get('lastName')
  }
  
  get mobileNo(){
    return this.adminser.user.get('mobileNo')
  }
  
  get anotherMobileNo(){
    return this.adminser.user.get('anotherMobileNo')
  }
  
  get emailId(){
    return this.adminser.user.get('emailId')
  }
  
  get dateOfBirth(){
    return this.adminser.user.get('dateOfBirth')
  }
  
  get dateOfJoining(){
    return this.adminser.user.get('dateOfJoining')
  }
  
  get username(){
    return this.adminser.user.get('username')
  }

  get password(){
    return this.adminser.user.get('password')
  }
  // onAddUser(){
  //   console.log("in Adduser")
  //   this.router.navigate(['../user'], { relativeTo : this.route });
  // };

  onViewUser(){
    console.log(this.adminser.user)
    console.log("in view user")
    this.router.navigate(['../viewuser'], { relativeTo : this.route});
  }

  onAddUser(){
    console.log("In Add User")
    this.adminser.isUserActive=true;
    this.adminser.isUserAddressDisabled=true;
    this.adminser.isUserBranchDisabled=true;
    this.adminser.isuserDocumentDisabled=true;
    this.adminser.isViewUserDisabled=false;
    this.router.navigate(['../user'], { relativeTo: this.route})
  }

  onUserAddress(){
    console.log("in user Address");
    this.adminser.isuserDocumentDisabled=true;
    this.adminser.isUserBranchDisabled=true
    this.adminser.isUserActive=false;
    this.router.navigate(['useraddress'], { relativeTo: this.route})
  }

  onUserBranch(){
    console.log("in user branch")
    this.adminser.isUserActive=false;
    this.router.navigate(['userbranch'],{relativeTo : this.route})
  }

  onUserDocument(){
    console.log("in User Document");
    this.adminser.isUserActive=false;
    this.router.navigate(['userdocument'], {relativeTo: this.route})
  }

  onAddUserSubmit()
  {
    this.adminser.isViewUserDisabled=true;
    this.adminser.isUserActive=false;
    this.adminser.isUserAddressDisabled=false;
    this.router.navigate(['useraddress'], { relativeTo : this.route})
  }

  setRole(roleName){
    console.log(roleName)
    this.adminser.user.patchValue({
      role : roleName
    })
  }
}
