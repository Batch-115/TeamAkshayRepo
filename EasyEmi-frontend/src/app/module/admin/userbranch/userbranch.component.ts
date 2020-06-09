import { Component, OnInit } from '@angular/core';
import { AdminService } from '../adminservices/admin.service';
import { Router, ActivatedRoute } from '@angular/router';
import { Branch } from '../Model/Branch';
import { BranchDisplay } from '../DTO/BranchDisplay';

@Component({
  selector: 'app-userbranch',
  templateUrl: './userbranch.component.html',
  styleUrls: ['./userbranch.component.scss']
})
export class UserbranchComponent implements OnInit {
  headElements = ['', 'Branch Id', 'Branch Name', 'Branch MailId', 'Branch Type', 'Branch AddressId', 'Branch City'];
  //branches : BranchDisplay[];
  branch: Branch = new Branch();
  branchesDto: BranchDisplay[];
  constructor(
    private adminSer: AdminService,
    private router: Router,
    private route: ActivatedRoute) { }

  ngOnInit() {
    this.adminSer.isUserActive = false;
    this.adminSer.isUserBranchDisabled = false;
    this.adminSer.isuserDocumentDisabled = true;
    //this.adminSer.getBranch().subscribe((data : Branch[]) => this.branches=data )
    this.adminSer.getBranchDto().subscribe((data: BranchDisplay[]) => this.branchesDto = data)
  }

  onUserBranchSubmit(branchId) {
    this.adminSer.getBranchDetails(branchId).subscribe((data: Branch) => {
    this.branch = data;
      console.log(data);
      this.adminSer.branch.setValue(this.branch);
    })

    this.router.navigate(['../userdocument'], { relativeTo: this.route })
  }

}
