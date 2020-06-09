import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Status } from '../model/status';
import { AdminService } from '../adminservices/admin.service';

@Component({
  selector: 'app-status-view',
  templateUrl: './status-view.component.html',
  styleUrls: ['./status-view.component.scss']
})
export class StatusViewComponent implements OnInit {

  constructor(
    private route:ActivatedRoute,
    private router:Router,
    private adminSer : AdminService) { }

  public status:Status[];

  ngOnInit() {

    this.adminSer.getStatusData().subscribe((element:Status[])=>{this.status=element,
      console.log(element)});
  }



  delete(status:Status){

    this.adminSer.deleteStatus(status).subscribe((element:Status[])=>{this.status=element});
}


  addStatus(){
    
    this.router.navigate(['../status'],{relativeTo:this.route})

}

}
