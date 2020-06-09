import { Component, OnInit } from '@angular/core';
import { AdminService } from '../adminservices/admin.service';

@Component({
  selector: 'app-add-branch',
  templateUrl: './add-branch.component.html',
  styleUrls: ['./add-branch.component.css']
})
export class AddBranchComponent implements OnInit {

  constructor(private adminSer: AdminService) { }

  ngOnInit(): void {
  }

  submitdata() {
    console.log(this.adminSer.branch)
    if(this.adminSer.branch.get('branchId').value == null)
    {
      console.log("new Branch");
      this.adminSer.postBranchDta(this.adminSer.branch.value).subscribe();
    } else {
      console.log("updated Branch");
      this.adminSer.updateBranchData(this.adminSer.branch.value).subscribe();
    }
  }

}
