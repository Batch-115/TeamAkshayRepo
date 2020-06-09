import { Component, OnInit, Inject } from '@angular/core';
import { AdminService } from '../adminservices/admin.service';
import { User } from '../Model/User';
import { Router, ActivatedRoute } from '@angular/router';
import { DOCUMENT } from '@angular/common';

@Component({
  selector: 'app-viewuser',
  templateUrl: './viewuser.component.html',
  styleUrls: ['./viewuser.component.scss']
})
export class ViewuserComponent implements OnInit {
  public users: User[];
  public user : User = new User();
  public userDto: any;
  public showDetails: Boolean = false;
  headElements = ['Id', 'FirstName', 'LastName', 'Mobile No', 'EmailId', 'Role', 'Branch', 'Edit', 'Delete', 'More Details'];
  constructor(private adminSer: AdminService, private router: Router,
    private route: ActivatedRoute, @Inject(DOCUMENT) private document: Document) { }

  ngOnInit() {
    // this.adminSer.getUserAllData().subscribe((data : User[]) => this.users=data);
    this.adminSer.getUserAllData().subscribe((data: any) => {
      this.userDto = data;
    console.log(data)});
  }

  editData(user) {
    this.adminSer.user.setValue(user);
    this.adminSer.adharCard = user.userDocument.adharCard;
    this.adminSer.isAdharDisplay = true;
    this.adminSer.panCard = user.userDocument.panCard;
    this.adminSer.isPanCardDisplay = true;
    this.adminSer.passbook = user.userDocument.passbook;
    this.adminSer.isPassbookDisplay = true;
    this.adminSer.userPhoto = user.userDocument.userPhoto;
    this.adminSer.isUserPhotoDisplay = true;
    console.log(this.adminSer.user.value);
    this.router.navigate(['../user'], { relativeTo: this.route })
  }

  deleteData(userId) {
    console.log(userId);
    this.adminSer.deleteUser(userId).subscribe((data: User[]) => this.users = data);
  }

  userDetails(userId) {
    console.log(userId);
    this.adminSer.userDetails(userId).subscribe((data: User) => {
      this.user = data;
      console.log(data);
      this.showDetails=true;
    })
    //this.router.navigate(['../userdetails/' + userId], { relativeTo: this.route });
  }


}
