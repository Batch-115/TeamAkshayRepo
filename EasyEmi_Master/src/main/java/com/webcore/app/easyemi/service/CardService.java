package com.webcore.app.easyemi.service;

import java.util.List;

import com.webcore.app.easyemi.model.Card;

public interface CardService 
{

	void registerCarddata(Card card);

	Card getCarddata(int cardid);

	List<Card> getallCarddata();

	
   
}
