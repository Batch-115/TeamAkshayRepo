import { UserAddress } from './UserAddress';
import { UserDocument } from './UserDocument';
import { Branch } from './Branch';

export class User
{
    userId : number;
	firstName : string;
    middleName : string;
	lastName : string;
	mobileNo : number;
	anotherMobileNo : number;
	emailId : string;
	gender : string;
	dateOfBirth : string;
	dateOfJoining : string;
	username : string;
	password : string;
	role : string;
	userBranch : Branch;
	userStatusCode : string;
	userAddress : UserAddress;
	userDocument : UserDocument;
}