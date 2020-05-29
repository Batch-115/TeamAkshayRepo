package com.webcore.app.easyemi.master.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class District {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int districtId;
	private String districtName;
	private int districtCode;
	private int districtStatusCode;
	
	@OneToOne(cascade = CascadeType.ALL)
	private State state;

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

	public int getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(int districtCode) {
		this.districtCode = districtCode;
	}

	public int getDistrictStatusCode() {
		return districtStatusCode;
	}

	public void setDistrictStatusCode(int districtStatusCode) {
		this.districtStatusCode = districtStatusCode;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	
	
}
