package com.webcore.app.easyemi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.easyemi.model.Card;
import com.webcore.app.easyemi.repository.CardRepository;

@Service
public class CardServiceimpl implements CardService
{
	@Autowired
	CardRepository cr;

	@Override
	public void registerCarddata(Card card) 
	{
		cr.save(card);
		
	}

	@Override
	public Card getCarddata(int cardid) 
	{
		Card card=cr.findById(cardid).get();
		return card;
	}

	@Override
	public List<Card> getallCarddata() 
	{
		List<Card> cardlist=(List<Card>) cr.findAll();
		return cardlist;
	}

}
