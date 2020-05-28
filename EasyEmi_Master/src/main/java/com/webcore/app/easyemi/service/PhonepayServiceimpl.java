package com.webcore.app.easyemi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.easyemi.model.Phonepay;
import com.webcore.app.easyemi.repository.PhonepayRepository;

@Service
public class PhonepayServiceimpl implements PhonepayService
{
	@Autowired
	PhonepayRepository pr;

	@Override
	public void registerPhonepay(Phonepay phonepay) 
	{
		pr.save(phonepay);	
	}

	@Override
	public Phonepay getPhonepaydata(int phonepayid) 
	{
		Phonepay phonepay=pr.findById(phonepayid).get();
		return phonepay;
	}

	

	@Override
	public List<Phonepay> getallPhonepaydata() 
	{
		List<Phonepay> phonepaylist=(List<Phonepay>) pr.findAll();
		return phonepaylist;
	}
	

}
