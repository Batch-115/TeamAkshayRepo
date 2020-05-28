package com.webcore.app.easyemi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.easyemi.model.Neft;
import com.webcore.app.easyemi.repository.NeftRepository;

@Service
public class NeftServiceimpl implements NeftService
{
	@Autowired
	NeftRepository nr;

	@Override
	public void registerNeftdata(Neft neft)
	{
		nr.save(neft);
		
	}

	@Override
	public Neft getNeftdata(int neftid) 
	{
		Neft neft=nr.findById(neftid).get();
		return neft;
	}

	@Override
	public List<Neft> getallNeftdata() 
	{
		List<Neft> neftlist=(List<Neft>) nr.findAll();
		return neftlist;
	}

	
	
	
}
