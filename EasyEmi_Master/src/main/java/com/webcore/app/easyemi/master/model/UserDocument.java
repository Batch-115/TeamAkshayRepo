package com.webcore.app.easyemi.master.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class UserDocument {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int docId;
	@Column(length = 16777215)
	private String adharCard;
	@Column(length = 16777215)
	private String panCard;
	@Column(length = 16777215)
	private String userPhoto;
	@Column(length = 16777215)
	private String passbook;
	
	public String getPassbook() {
		return passbook;
	}
	public void setPassbook(String passbook) {
		this.passbook = passbook;
	}
	public int getDocId() {
		return docId;
	}
	public void setDocId(int docId) {
		this.docId = docId;
	}
	public String getAdharCard() {
		return adharCard;
	}
	public void setAdharCard(String adharCard) {
		this.adharCard = adharCard;
	}
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	public String getUserPhoto() {
		return userPhoto;
	}
	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}
}
