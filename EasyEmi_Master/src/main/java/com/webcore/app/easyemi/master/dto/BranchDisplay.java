package com.webcore.app.easyemi.master.dto;

public class BranchDisplay {
	private int branchId;
    private String branchName;
    private String branchType;
    private String branchMailId;
    private int addressId;
    private String city;
	public BranchDisplay(int branchId, String branchName, String branchType, String branchMailId, int addressId,
			String city) {
		super();
		this.branchId = branchId;
		this.branchName = branchName;
		this.branchType = branchType;
		this.branchMailId = branchMailId;
		this.addressId = addressId;
		this.city = city;
	}
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchType() {
		return branchType;
	}
	public void setBranchType(String branchType) {
		this.branchType = branchType;
	}
	public String getBranchMailId() {
		return branchMailId;
	}
	public void setBranchMailId(String branchMailId) {
		this.branchMailId = branchMailId;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
    
}
