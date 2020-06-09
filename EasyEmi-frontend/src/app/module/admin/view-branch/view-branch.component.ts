import { Component, OnInit } from '@angular/core';
import { AdminService } from '../adminservices/admin.service';
import { Branch } from '../Model/Branch';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-view-branch',
  templateUrl: './view-branch.component.html',
  styleUrls: ['./view-branch.component.css']
})

export class ViewBranchComponent implements OnInit {
public branch:Branch[];
public headElements : string[] = ['branchId', 'branchName', 'ifscCode', 'branchContactNo',
 'branchMailId', 'country', 'state','city', 'pinCode', 'Edit', 'Delete']
  constructor(private adminSer : AdminService, private route : ActivatedRoute, private router : Router) { }

  ngOnInit(){
    //console.log(this.branch)
    this.adminSer.getBranch().subscribe((data:Branch[])=>{this.branch=data;
      console.log(this.branch)
    })
  }

  editdata(branch : Branch){
    this.adminSer.branch.setValue(branch);
    this.router.navigate(['../addbranch'], {relativeTo : this.route});
  }

  deletedata(branchId : number){
    console.log(branchId)
    console.log("in deleteData view branch")
    this.adminSer.deleteBranchData(branchId).subscribe();
  }
}
