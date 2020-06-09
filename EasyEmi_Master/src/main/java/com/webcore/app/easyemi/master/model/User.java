package com.webcore.app.easyemi.master.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.web.bind.annotation.RequestMapping;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String firstName;
	private String middleName;
	private String lastName;
	private long mobileNo;
	private long anotherMobileNo;
	private String emailId;
	private String gender;
	private String dateOfBirth;
	private String dateOfJoining;
	private  String username;
	private String password;
	private String role;
	private int userStatusCode;
	@OneToOne(cascade = CascadeType.ALL)
	private UserAddress userAddress;
	@OneToOne(cascade = CascadeType.ALL)
	private UserDocument userDocument;
	@ManyToOne(cascade = {
			CascadeType.MERGE
	})
	private Branch userBranch;
	
	public Branch getUserBranch() {
		return userBranch;
	}
	public void setUserBranch(Branch userBranch) {
		this.userBranch = userBranch;
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
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
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
	public long getAnotherMobileNo() {
		return anotherMobileNo;
	}
	public void setAnotherMobileNo(long anotherMobileNo) {
		this.anotherMobileNo = anotherMobileNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getUserStatusCode() {
		return userStatusCode;
	}
	public void setUserStatusCode(int userStatusCode) {
		this.userStatusCode = userStatusCode;
	}
	public UserAddress getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(UserAddress userAddress) {
		this.userAddress = userAddress;
	}
	public UserDocument getUserDocument() {
		return userDocument;
	}
	public void setUserDocument(UserDocument userDocument) {
		this.userDocument = userDocument;
	}
}
