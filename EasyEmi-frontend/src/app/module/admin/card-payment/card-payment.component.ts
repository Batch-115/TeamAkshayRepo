import { Component, OnInit } from '@angular/core';
import { AdminService } from '../adminservices/admin.service';

@Component({
  selector: 'app-card-payment',
  templateUrl: './card-payment.component.html',
  styleUrls: ['./card-payment.component.scss']
})
export class CardPaymentComponent implements OnInit {

  constructor(private adminSer: AdminService) { }

  ngOnInit() {
  }
  saveCard() {

    console.log(this.adminSer.cardForm.value);
    this.adminSer.postCardData(this.adminSer.cardForm.value).subscribe();
    this.reset();

  }
  reset() {

    this.adminSer.cardForm.reset();
  }
}

