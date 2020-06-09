package com.webcore.app.easyemi.master.dto;

public class DistStateCountry {
	private String districtName;
	private String stateName;
	private String countryName;
	
	public DistStateCountry() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DistStateCountry(String districtName, String stateName, String countryName) {
		super();
		this.districtName = districtName;
		this.stateName = stateName;
		this.countryName = countryName;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

}
