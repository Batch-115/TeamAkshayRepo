import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { AdminService } from '../adminservices/admin.service';

@Component({
  selector: 'app-status',
  templateUrl: './status.component.html',
  styleUrls: ['./status.component.scss']
})
export class StatusComponent implements OnInit {

  
  constructor(
    private adminSer : AdminService,
    private route:ActivatedRoute,
    private router:Router) { }

  ngOnInit() {
  }

  saveStatus()
  {
    
    console.log(this.adminSer.statusForm.value);
    this.adminSer.postStatusData(this.adminSer.statusForm.value).subscribe();
    this.reset();
    
  }
  reset()
  {
    
  this.adminSer.statusForm.reset();
  }
  viewStatus(){
    
    this.router.navigate(['../viewstatus'],{relativeTo:this.route})

}

}
