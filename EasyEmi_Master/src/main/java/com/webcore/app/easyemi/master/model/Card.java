package com.webcore.app.easyemi.master.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Card {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int card_Id;
	private String card_Type;
	private long cardNo;
	private String name;
	private int card_Validuptil_Month;
	private int card_Validuptil_Year;
	private int cvc;
	private long amount;

	public int getCard_Id() {
		return card_Id;
	}

	public void setCard_Id(int card_Id) {
		this.card_Id = card_Id;
	}

	public String getCard_Type() {
		return card_Type;
	}

	public void setCard_Type(String card_Type) {
		this.card_Type = card_Type;
	}

	public long getCardNo() {
		return cardNo;
	}

	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCard_Validuptil_Month() {
		return card_Validuptil_Month;
	}

	public void setCard_Validuptil_Month(int card_Validuptil_Month) {
		this.card_Validuptil_Month = card_Validuptil_Month;
	}

	public int getCard_Validuptil_Year() {
		return card_Validuptil_Year;
	}

	public void setCard_Validuptil_Year(int card_Validuptil_Year) {
		this.card_Validuptil_Year = card_Validuptil_Year;
	}

	public int getCvc() {
		return cvc;
	}

	public void setCvc(int cvc) {
		this.cvc = cvc;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

}
