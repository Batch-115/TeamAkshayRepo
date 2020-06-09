import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { AdminService } from '../adminservices/admin.service';

@Component({
  selector: 'app-role',
  templateUrl: './role.component.html',
  styleUrls: ['./role.component.scss']
})
export class RoleComponent implements OnInit {

  constructor(
    private adminSer : AdminService,
    private route:ActivatedRoute,
    private router:Router) { }

  ngOnInit() {
  }

  saveRole()
  {
    
    console.log(this.adminSer.roleForm.value);
    this.adminSer.postRoleData(this.adminSer.roleForm.value).subscribe();
    this.reset();
    
  }
  reset()
  {
    
  this.adminSer.roleForm.reset();
  }
  viewRole(){
    
    this.router.navigate(['../viewrole'],{relativeTo:this.route})

}
}
