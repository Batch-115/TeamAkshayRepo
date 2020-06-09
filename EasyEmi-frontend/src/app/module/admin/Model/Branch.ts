import { BranchAddress } from './BranchAddress';

export class Branch{
    branchId : number;
    branchName : string;
    branchType : string;
    ifscCode : string;
    micrCode : number;
    branchCode : number;
    branchContactNo : number;
    branchMailId : string;
    status : number;
    branchAddress : BranchAddress;
}