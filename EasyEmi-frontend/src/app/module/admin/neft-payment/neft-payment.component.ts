import { Component, OnInit } from '@angular/core';
import { AdminService } from '../adminservices/admin.service';

@Component({
  selector: 'app-neft-payment',
  templateUrl: './neft-payment.component.html',
  styleUrls: ['./neft-payment.component.scss']
})
export class NeftPaymentComponent implements OnInit {

  constructor(private adminSer: AdminService) { }

  ngOnInit() {
  }
  saveNeft() {

    console.log(this.adminSer.neftForm.value);
    this.adminSer.postNeftData(this.adminSer.neftForm.value).subscribe();
    this.reset();

  }
  reset() {

    this.adminSer.neftForm.reset();
  }
}
