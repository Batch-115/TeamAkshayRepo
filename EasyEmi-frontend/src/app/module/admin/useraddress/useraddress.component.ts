import { Component, OnInit } from '@angular/core';
import { AdminService } from '../adminservices/admin.service';
import { Router, ActivatedRoute } from '@angular/router';
import { DistrictListDto } from '../DTO/DistrictListDto';
import { DistStateCountry } from '../DTO/DistStateCountry';

@Component({
  selector: 'app-useraddress',
  templateUrl: './useraddress.component.html',
  styleUrls: ['./useraddress.component.scss']
})
export class UseraddressComponent implements OnInit {
  public districts: DistrictListDto[];
  public distStateCountry : DistStateCountry= new DistStateCountry;
  public perm_distStateCountry : DistStateCountry = new DistStateCountry;
  public isSameAddress: Boolean = false;
  public isSelectHasError : Boolean = true;
  public isPermSelectHasError : Boolean = true;
  constructor(
    private adminser: AdminService,
    private router: Router,
    private route: ActivatedRoute) { }

    get houseNo(){
      return this.adminser.userAddress.get('houseNo')
    }

    get city(){
      return this.adminser.userAddress.get('city')
    }
    
    get taluka(){
      return this.adminser.userAddress.get('taluka')
    }
    
    get landmark(){
      return this.adminser.userAddress.get('landmark')
    }
    
    get area(){
      return this.adminser.userAddress.get('area')
    }
    
    get streetName(){
      return this.adminser.userAddress.get('streetName')
    }
    
    get pincode(){
      return this.adminser.userAddress.get('pincode')
    }

    get perm_houseNo(){
      return this.adminser.userAddress.get('perm_houseNo')
    }

    get perm_city(){
      return this.adminser.userAddress.get('perm_city')
    }
    
    get perm_taluka(){
      return this.adminser.userAddress.get('perm_taluka')
    }
    
    get perm_landmark(){
      return this.adminser.userAddress.get('perm_landmark')
    }
    
    get perm_area(){
      return this.adminser.userAddress.get('perm_area')
    }
    
    get perm_streetName(){
      return this.adminser.userAddress.get('perm_streetName')
    }

    get perm_pincode(){
      return this.adminser.userAddress.get('perm_pincode')
    }

    get state(){
      return this.adminser.userAddress.get('state')
    }

  ngOnInit() {
    this.adminser.isUserActive = false;
    this.adminser.isUserAddressDisabled = false;
    console.log("in address ngoninit")
    this.adminser.getDistrict().subscribe((data: DistrictListDto[]) => this.districts = data);
  }

  onUserAddressSubmit() {
    //this.adminser.isuserDocumentDisabled=false;
    this.adminser.isUserBranchDisabled = true;
    //this.router.navigate(['../userdocument'], { relativeTo: this.route })
    this.router.navigate(['../userbranch'], { relativeTo: this.route })
  }

  onAddressChecked() {
    console.log("changed");
    if (this.isSameAddress == false) {
      this.isSameAddress = true;
      this.adminser.userAddress.patchValue({
        perm_houseNo: this.adminser.userAddress.get('houseNo').value,
        perm_streetName: this.adminser.userAddress.get('streetName').value,
        perm_area: this.adminser.userAddress.get('area').value,
        perm_landmark: this.adminser.userAddress.get('landmark').value,
        perm_taluka: this.adminser.userAddress.get('taluka').value,
        perm_district: this.adminser.userAddress.get('district').value,
        perm_city: this.adminser.userAddress.get('city').value,
        perm_state: this.adminser.userAddress.get('state').value,
        perm_country: this.adminser.userAddress.get('country').value,
        perm_pincode: this.adminser.userAddress.get('pincode').value
      })
    } else {
      this.isSameAddress = false;
    }
  }

  onDistrictSelect(distrct: any) {
    this.isSelectHasError=false;
    // console.log(distId);
    //let a=parseInt(distId)
    this.adminser.getdistStateCountry(distrct.districtId).subscribe((data : DistStateCountry) => {this.distStateCountry=data;
    console.log(data);
    console.log(this.distStateCountry);
    this.adminser.userAddress.patchValue({
      district: this.distStateCountry.districtName,
      state: this.distStateCountry.stateName,
      country: this.distStateCountry.countryName
    });
  })
    // console.log(this.adminser.state.get('stateName').value);
    // console.log(this.adminser.country.get('countryName').value)
  }

  onPermDistrictSelect(distrct: any){
    this.isPermSelectHasError=false;
    this.adminser.getdistStateCountry(distrct.districtId).subscribe((data : DistStateCountry) => {this.perm_distStateCountry=data;
      console.log(data)})
      console.log(this.perm_distStateCountry)
      this.adminser.userAddress.patchValue({
        perm_district: this.distStateCountry.districtName,
        perm_state: this.distStateCountry.stateName,
        perm_country: this.distStateCountry.countryName
      })
    //console.log(this.district)
    
  }

}
