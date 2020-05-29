package com.webcore.app.easyemi.master.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int countryId;
	private  String countryName;
	private int countryCode;
	private int countryStatusCode;
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public int getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}
	public int getCountryStatusCode() {
		return countryStatusCode;
	}
	public void setCountryStatusCode(int countryStatusCode) {
		this.countryStatusCode = countryStatusCode;
	}

	
	
	
	
}
