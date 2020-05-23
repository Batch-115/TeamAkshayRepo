package com.webcore.app.easyemi.master.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class District {
	@Id
	private int districtId;
	private String districtName;
	private int statusCode;
	
	public int getDistrictId() {
		return districtId;
	}
	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
}
