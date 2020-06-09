import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-payment-method',
  templateUrl: './payment-method.component.html',
  styleUrls: ['./payment-method.component.scss']
})
export class PaymentMethodComponent implements OnInit {

  constructor(private route:ActivatedRoute,private router:Router) { }

  ngOnInit() {
  }
card(){
  this.router.navigate(['../card'],{relativeTo:this.route})
}
phonepay()
{
  this.router.navigate(['../phonepay'],{relativeTo:this.route})
}
neft()
{
  this.router.navigate(['../neft'],{relativeTo:this.route})
}
}
