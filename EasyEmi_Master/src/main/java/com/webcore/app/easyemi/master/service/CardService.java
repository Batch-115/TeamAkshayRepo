package com.webcore.app.easyemi.master.service;

import java.util.List;

import com.webcore.app.easyemi.master.model.Card;

public interface CardService 
{

	void registerCarddata(Card card);

	Card getCarddata(int cardid);

	List<Card> getallCarddata();

	
   
}
