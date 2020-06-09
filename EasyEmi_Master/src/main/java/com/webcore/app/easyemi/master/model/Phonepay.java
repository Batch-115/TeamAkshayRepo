package com.webcore.app.easyemi.master.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Phonepay {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int phonepay_Id;
	private long upi_Id;
	private long mobileNo;
	private long amount;

	public int getPhonepay_Id() {
		return phonepay_Id;
	}

	public void setPhonepay_Id(int phonepay_Id) {
		this.phonepay_Id = phonepay_Id;
	}

	public long getUpi_Id() {
		return upi_Id;
	}

	public void setUpi_Id(long upi_Id) {
		this.upi_Id = upi_Id;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

}
