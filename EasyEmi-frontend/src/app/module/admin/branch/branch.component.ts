import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-branch',
  templateUrl: './branch.component.html',
  styleUrls: ['./branch.component.css']
})
export class BranchComponent implements OnInit {

  constructor(private router:Router,private route:ActivatedRoute) { }

  ngOnInit(): void {
  }

  OnAddBranch(){
    console.log("In Add branch")
    this.router.navigate(['addbranch'], { relativeTo :this.route})
  }
  OnBranchview(){

    console.log("In View Branch")
    this.router.navigate(['viewbranch'],{ relativeTo :this.route})
  }

}
