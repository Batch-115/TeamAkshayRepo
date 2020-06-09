package com.webcore.app.easyemi.master.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class UserAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressId;
	private String houseNo;
	private String streetName;
	private String area;
	private String landmark;
	private String taluka;
	/*
	 * @OneToOne(cascade = {CascadeType.ALL,CascadeType.MERGE}) private District
	 * district;
	 */
	private String district;
	private String city;
	private String state;
	private String country;
	private int pincode;
	private String perm_houseNo;
	private String perm_streetName;
	private String perm_area;
	private String perm_landmark;
	private String perm_taluka;
	/*
	 * @OneToOne(cascade = CascadeType.MERGE) private District perm_district;
	 */
	private String perm_district;
	private String perm_city;
	private String perm_state;
	private String perm_country;
	private int perm_pincode;
	private int statusCode;
	
	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPerm_district() {
		return perm_district;
	}

	public void setPerm_district(String perm_district) {
		this.perm_district = perm_district;
	}

	public String getPerm_state() {
		return perm_state;
	}

	public void setPerm_state(String perm_state) {
		this.perm_state = perm_state;
	}

	public String getPerm_country() {
		return perm_country;
	}

	public void setPerm_country(String perm_country) {
		this.perm_country = perm_country;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getTaluka() {
		return taluka;
	}

	public void setTaluka(String taluka) {
		this.taluka = taluka;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getPerm_houseNo() {
		return perm_houseNo;
	}

	public void setPerm_houseNo(String perm_houseNo) {
		this.perm_houseNo = perm_houseNo;
	}

	public String getPerm_streetName() {
		return perm_streetName;
	}

	public void setPerm_streetName(String perm_streetName) {
		this.perm_streetName = perm_streetName;
	}

	public String getPerm_area() {
		return perm_area;
	}

	public void setPerm_area(String perm_area) {
		this.perm_area = perm_area;
	}

	public String getPerm_landmark() {
		return perm_landmark;
	}

	public void setPerm_landmark(String perm_landmark) {
		this.perm_landmark = perm_landmark;
	}

	public String getPerm_taluka() {
		return perm_taluka;
	}

	public void setPerm_taluka(String perm_taluka) {
		this.perm_taluka = perm_taluka;
	}

	public String getPerm_city() {
		return perm_city;
	}

	public void setPerm_city(String perm_city) {
		this.perm_city = perm_city;
	}
	public int getPerm_pincode() {
		return perm_pincode;
	}

	public void setPerm_pincode(int perm_pincode) {
		this.perm_pincode = perm_pincode;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
}
