import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { AdminService } from '../adminservices/admin.service';
import { Role } from '../Model/role';

@Component({
  selector: 'app-role-view',
  templateUrl: './role-view.component.html',
  styleUrls: ['./role-view.component.scss']
})
export class RoleViewComponent implements OnInit {
  public role:Role[];
  constructor(private route:ActivatedRoute,
    private router:Router,
    private adminSer: AdminService) { }

  ngOnInit() {

    this.adminSer.gettRoleData().subscribe((element:Role[])=>{this.role=element,
      console.log(element)});
  }



  delete(role:Role){

    this.adminSer.deleteRole(role).subscribe((element:Role[])=>{this.role=element});
}

  addRole(){
    
    this.router.navigate(['../role'],{relativeTo:this.route})

}
}
