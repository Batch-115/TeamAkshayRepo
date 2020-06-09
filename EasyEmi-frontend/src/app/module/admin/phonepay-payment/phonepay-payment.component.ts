import { Component, OnInit } from '@angular/core';
import { AdminService } from '../adminservices/admin.service';

@Component({
  selector: 'app-phonepay-payment',
  templateUrl: './phonepay-payment.component.html',
  styleUrls: ['./phonepay-payment.component.scss']
})
export class PhonepayPaymentComponent implements OnInit {

  constructor(private adminSer : AdminService) { }

  ngOnInit() {
  }
  savePhonepay()
  {
    
    console.log(this.adminSer.phonepayForm.value);
    this.adminSer.postPhonepayData(this.adminSer.phonepayForm.value).subscribe();
    this.reset();
    
  }
  reset()
  {
    
  this.adminSer.phonepayForm.reset();
  }
}
