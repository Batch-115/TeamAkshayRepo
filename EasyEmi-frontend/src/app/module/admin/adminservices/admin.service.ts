import { Injectable } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { District } from '../Model/District';
import { Phonepay } from '../Model/phonepay';
import { Neft } from '../Model/neft';
import { Card } from '../Model/card';
import { Status } from '../model/status';
import { Role } from '../Model/role';

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  public isUserActive: Boolean = true;
  public isUserAddressDisabled: Boolean = true;
  public isUserBranchDisabled: Boolean = true;
  public isViewUserDisabled: Boolean = false;
  public isuserDocumentDisabled: Boolean = true;

  public adharCard: string;
  public isAdharDisplay: Boolean = false;
  public panCard: string;
  public isPanCardDisplay: Boolean = false;
  public passbook: string;
  public isPassbookDisplay: Boolean = false;
  public userPhoto: string;
  public isUserPhotoDisplay: Boolean = false;

  constructor(private formBuilder: FormBuilder, private http: HttpClient) { }

  public userDocument: FormGroup = this.formBuilder.group({
    docId: [''],
    adharCard: [''],
    panCard: [''],
    userPhoto: [''],
    passbook: ['']
  });

  public country: FormGroup = this.formBuilder.group({
    countryId: null,
    countryName: [''],
    countryCode: null,
    countryStatusCode: null
  });

  public state: FormGroup = this.formBuilder.group({
    stateId: [''],
    stateName: [''],
    stateCode: [''],
    stateStatusCode: [''],
    country: this.country
  })

  public district: FormGroup = this.formBuilder.group({
    districtId: null,
    districtName: [''],
    districtCode: null,
    districtStatusCode: null,
    state: this.state
  })

  // public perm_country: FormGroup = this.formBuilder.group({
  //   countryId: null,
  //   countryName: [''],
  //   countryCode: null,
  //   countryStatusCode: null
  // });


  // public perm_district: FormGroup = this.formBuilder.group({
  //   districtId: [''],
  //   districtName: [''],
  //   districtCode: null,
  //   districtStatusCode: null,
  //   state: this.perm_state
  // })

  public userAddress: FormGroup = this.formBuilder.group({
    addressId: [''],
    houseNo: ['', [Validators.required]],
    streetName: ['', [Validators.required]],
    area: ['', [Validators.required]],
    landmark: ['', [Validators.required]],
    taluka: ['', [Validators.required]],
    district: [''],
    city: ['', [Validators.required]],
    state : [''],
    country : [''],
    pincode: ['', [Validators.required, Validators.pattern('[0-9]{6}')]],
    perm_houseNo: ['', [Validators.required]],
    perm_streetName: ['', [Validators.required]],
    perm_area: ['', [Validators.required]],
    perm_landmark: ['', [Validators.required]],
    perm_taluka: ['', [Validators.required]],
    perm_district: [''],
    perm_city: ['', [Validators.required]],
    perm_state : [''],
    perm_country : [''],
    perm_pincode: ['', [Validators.required, Validators.pattern('[0-9]{6}')]],
    statusCode: [''],
  });

  public branchAddress: FormGroup = this.formBuilder.group({
    addressId: null,
    houseNo: [''],
    area: [''],
    streetName: [''],
    landMark: [''],
    city: [''],
    taluka: [''],
    district: [''],
    state: [''],
    country: [''],
    pincode: ['']
  })

  public branch: FormGroup = this.formBuilder.group({
    branchId: null,
    branchName: [''],
    branchType: [''],
    ifscCode: [''],
    micrCode: [''],
    branchCode: [''],
    branchContactNo: [''],
    branchMailId: [''],
    status: [''],
    branchAddress: this.branchAddress
  })

  public user: FormGroup = this.formBuilder.group({
    userId: null,
    firstName: ['', [Validators.required, Validators.minLength(3), Validators.pattern('[a-zA-Z ]*')]],
    middleName: ['', [Validators.required, Validators.minLength(3), Validators.pattern('[a-zA-Z ]*')]],
    lastName: ['', [Validators.required, Validators.minLength(3), Validators.pattern('[a-zA-Z ]*')]],
    mobileNo: ['', [Validators.required, Validators.pattern('[7-9][0-9]{9}')]],
    anotherMobileNo: ['', [Validators.required, Validators.pattern('[789][0-9]{9}')]],
    emailId: ['', [Validators.required, Validators.pattern('[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+')]],
    gender: [''],
    dateOfBirth: ['', [Validators.required, Validators.pattern('(0[1-9]|[1-2][0-9]|3[0-1])\/(0[1-9]|1[0-2])\/[0-9]{4}')]],
    dateOfJoining: ['', [Validators.required, Validators.pattern('(0[1-9]|[1-2][0-9]|3[0-1])\/(0[1-9]|1[0-2])\/[0-9]{4}')]],
    username: ['', [Validators.required, Validators.minLength(3)]],
    password: ['', [Validators.required, Validators.minLength(3)]],
    role: [''],
    userStatusCode: [''],
    userAddress: this.userAddress,
    userDocument: this.userDocument,
    userBranch: this.branch
  });

  getDisplayRole() {
    return this.http.get("http://localhost:8082/masterRole/getrolelist")
  }

  registerUser(user) {
    this.user.reset();
    console.log(user)
    console.log("in register user service")
    return this.http.post("http://localhost:8082/masteruser/register", user);
  }

  getUserAllData() {
    //return this.http.get("http://localhost:8082/masteruser/getAllUser");
    return this.http.get("http://localhost:8082/masteruser/getAllUserDto");
  }

  deleteUser(userId) {
    console.log(userId)
    return this.http.delete("http://localhost:8082/masteruser/deleteUser/" + userId);
  }

  updateUser(user) {
    this.user.reset();
    console.log(user)
    console.log("in update user service")
    return this.http.put("http://localhost:8082/masteruser/updateuser", user);
  }

  getBranch() {
    return this.http.get("http://localhost:8082/masterbranch/getbranch");
  }

  getBranchDto() {
    return this.http.get("http://localhost:8082/masterbranch/getallbranchdto");
  }

  getBranchDetails(branchId: number) {
    return this.http.get("http://localhost:8082/masterbranch/getsinglebranch/"+branchId);
  }

  getDistrict() {
    console.log("in address service")
    return this.http.get("http://localhost:8082/masterDistrict/ditrictdtolist")
  }

  getdistStateCountry(districtId: any) {
    return this.http.get("http://localhost:8082/masterDistrict/fetchdistrict/"+districtId)

  }

  userDetails(id) {
    return this.http.get("http://localhost:8082/masteruser/getUserData/" + id);
  }

  postBranchDta(branch) {
    console.log("in admin post branch")
    console.log(branch)
    return this.http.post("http://localhost:8082/masterbranch/branch", branch);
  }

  deleteBranchData(branchId: number) {
    console.log(branchId)
    console.log("i service delete branch")
    return this.http.delete("http://localhost:8082/masterbranch/deletebranch/" + branchId);
  }

  updateBranchData(branch) {
    return this.http.put("http://localhost:8082/masterbranch/updatebranch", branch);
  }

  postAddress(district: District) {
    return this.http.post("http://localhost:8082/masterDistrict/add", district, {responseType : 'text'});
  }


  getAddress() {
    return this.http.get("http://localhost:8082/masterDistrict/fetch");
  }

  deleteDistrict(districtId) {
    console.log(districtId);
    return this.http.delete( "http://localhost:8082/masterDistrict/delete/"+ districtId);
  }

  cardForm:FormGroup=this.formBuilder.group({
    card_Id:[''],
    card_Type:[""],
    pcardNo:[''],
    name:[""],
    card_Validuptil_Month:[''],
    card_Validuptil_Year:[""],
    cvc:[''],
    amount:['']
  });
  neftForm:FormGroup=this.formBuilder.group({
    neft_Id:[''],
    base_Branch_Name:[""],
    account_No:[''],
    name_Of_Account_Holder:[""],
    beneficiary_Bank_Name:[""],
    ifsc_Code:[""],
    beneficiary_Account_No:[''],
    beneficiary_Name:[""],
    amount:[''],
  });
  phonepayForm:FormGroup=this.formBuilder.group({
    phonepay_Id:[''],
    upi_Id:[''],
    mobileNo:[''],
    amount:['']
  });

  postPhonepayData(phonepay:Phonepay)
  {
    console.log(phonepay)
    return this.http.post("http://localhost:8082/masterphonepay/registerPhonepaydata",phonepay);
  }

  postCardData(card:Card)
  {
    console.log(card)
    return this.http.post("http://localhost:8082/mastercard/registerCarddata",card);
  }

  postNeftData(neft:Neft)
  {
    console.log(neft)
    return this.http.post("http://localhost:8082/masterneft/registerNeftdata",neft);
  }

  roleForm:FormGroup=this.formBuilder.group({
    roleId:[''],
    roleName:[""],
    roleCode:[''],
    roleStatusCode:['']
  });
  statusForm:FormGroup=this.formBuilder.group({
    statusId:[''],
    statusDescription:[""],
    statusCode:['']
  });

  postRoleData(role:Role)
  {
    return this.http.post("http://localhost:8082/masterRole/add",role);
  }

  postStatusData(status:Status)
  {
    return this.http.post("http://localhost:8082/masterStatus/add",status);
  }
  gettRoleData()
  {
    return this.http.get("http://localhost:8082/masterRole/fetch");
  }

  getStatusData()
  {
    return this.http.get("http://localhost:8082/masterStatus/fetch");
  }

  deleteRole(role:Role)
  {
    console.log(role.roleId);
  return this.http.delete("http://localhost:8082/masterRole/delete"+"/"+role.roleId);
  }
  deleteStatus(status:Status)
  {
    console.log(status.statusId);
  return this.http.delete("http://localhost:8082/masterStatus/delete"+"/"+status.statusId);
  }

}
