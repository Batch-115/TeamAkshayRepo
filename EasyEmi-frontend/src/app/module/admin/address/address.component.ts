import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { AdminService } from '../adminservices/admin.service';

@Component({
  selector: 'app-address',
  templateUrl: './address.component.html',
  styleUrls: ['./address.component.scss']
})
export class AddressComponent implements OnInit {

  constructor(
    private route:ActivatedRoute,
    private router:Router,
    private adminSer : AdminService
    ) { }

  ngOnInit() {
  //this.adminSer.district;
  }
viewAddress(){
  this.router.navigate(['../viewaddress'],{relativeTo:this.route});
}
onSubmit()
{
  console.log(this.adminSer.district.value);
  this.adminSer.postAddress(this.adminSer.district.value).subscribe((res) => console.log(res));
  this.reset();
  
}
reset()
{
  this.adminSer.district.reset();
}
}
