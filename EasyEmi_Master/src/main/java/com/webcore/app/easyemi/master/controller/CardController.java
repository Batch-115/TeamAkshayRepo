package com.webcore.app.easyemi.master.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.easyemi.master.model.Card;
import com.webcore.app.easyemi.master.service.CardService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "mastercard")
public class CardController 
{
	@Autowired
	CardService cs;
	
    @RequestMapping(value="registerCarddata",method = RequestMethod.POST)
	public Card registerCarddata(@RequestBody Card card)
	{
		cs.registerCarddata(card);
		return card;
	}
    
    @RequestMapping(value="getCarddata/{card_Id}",method = RequestMethod.GET)
    public Card getCarddata(@PathVariable("card_Id") int cardid)
    {
    	Card card=cs.getCarddata(cardid);
    	
    	return card;
    }
    
    @RequestMapping(value="getallCarddata",method = RequestMethod.GET)
    public List<Card> getallCarddata()
    {
    	List<Card> cardlist=cs.getallCarddata();
    	
    	return cardlist;
    }
    
	
}
