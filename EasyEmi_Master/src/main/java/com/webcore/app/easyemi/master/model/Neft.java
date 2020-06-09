package com.webcore.app.easyemi.master.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Neft {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int neft_Id;
	private String base_Branch_Name;
	private long account_No;
	private String name_Of_Account_Holder;
	private String beneficiary_Bank_Name;
	private String ifsc_Code;
	private long beneficiary_Account_No;
	private String beneficiary_Name;
	private long amount;

	public int getNeft_Id() {
		return neft_Id;
	}

	public void setNeft_Id(int neft_Id) {
		this.neft_Id = neft_Id;
	}

	public String getBase_Branch_Name() {
		return base_Branch_Name;
	}

	public void setBase_Branch_Name(String base_Branch_Name) {
		this.base_Branch_Name = base_Branch_Name;
	}

	public long getAccount_No() {
		return account_No;
	}

	public void setAccount_No(long account_No) {
		this.account_No = account_No;
	}

	public String getName_Of_Account_Holder() {
		return name_Of_Account_Holder;
	}

	public void setName_Of_Account_Holder(String name_Of_Account_Holder) {
		this.name_Of_Account_Holder = name_Of_Account_Holder;
	}

	public String getBeneficiary_Bank_Name() {
		return beneficiary_Bank_Name;
	}

	public void setBeneficiary_Bank_Name(String beneficiary_Bank_Name) {
		this.beneficiary_Bank_Name = beneficiary_Bank_Name;
	}

	public String getIfsc_Code() {
		return ifsc_Code;
	}

	public void setIfsc_Code(String ifsc_Code) {
		this.ifsc_Code = ifsc_Code;
	}

	public long getBeneficiary_Account_No() {
		return beneficiary_Account_No;
	}

	public void setBeneficiary_Account_No(long beneficiary_Account_No) {
		this.beneficiary_Account_No = beneficiary_Account_No;
	}

	public String getBeneficiary_Name() {
		return beneficiary_Name;
	}

	public void setBeneficiary_Name(String beneficiary_Name) {
		this.beneficiary_Name = beneficiary_Name;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

}
