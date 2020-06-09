package com.webcore.app.easyemi.master.dto;

public class UserDisplayDto {
	private int userId;
	private String firstName;
	private String lastName;
	private long mobileNo;
	private String emailId;
	private String role;
	private String branchName;
	
	public UserDisplayDto(int userId, String firstName, String lastName, long mobileNo, String emailId, String role,
			String branchName) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.role = role;
		this.branchName = branchName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public UserDisplayDto() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	
}
