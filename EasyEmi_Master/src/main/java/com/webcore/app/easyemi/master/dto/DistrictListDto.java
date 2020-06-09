package com.webcore.app.easyemi.master.dto;

public class DistrictListDto {
	private int districtId;
	private String districtName;
	
	public DistrictListDto(int districtId, String districtName) {
		super();
		this.districtId = districtId;
		this.districtName = districtName;
	}
	
	public DistrictListDto() {
		super();
		// TODO Auto-generated constructor stub
	}

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
	
}
