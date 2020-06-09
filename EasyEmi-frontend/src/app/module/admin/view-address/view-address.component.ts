import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { District } from '../model/district';
import { AdminService } from '../adminservices/admin.service';


@Component({
  selector: 'app-view-address',
  templateUrl: './view-address.component.html',
  styleUrls: ['./view-address.component.scss']
})
export class ViewAddressComponent implements OnInit {

  constructor(private route:ActivatedRoute,private router:Router,private adminSer : AdminService) { }
  public district:District[];
  ngOnInit() {
    this.adminSer.getAddress().subscribe((element:District[])=>{this.district=element,
      console.log(element)});

  }


  delete(districtId : number){

        this.adminSer.deleteDistrict(districtId).subscribe((element:District[])=>{this.district=element});
  }

  addAddress(){
    
        this.router.navigate(['../address'],{relativeTo:this.route})

  }

}
