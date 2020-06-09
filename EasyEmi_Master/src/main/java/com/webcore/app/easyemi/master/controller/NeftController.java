package com.webcore.app.easyemi.master.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.easyemi.master.model.Neft;
import com.webcore.app.easyemi.master.service.NeftService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path="masterneft")
public class NeftController 
{
	@Autowired
	NeftService ns;
	
	@RequestMapping(value = "registerNeftdata",method = RequestMethod.POST)
	public Neft registerNeftdata(@RequestBody Neft neft)
	{
		ns.registerNeftdata(neft);
		return neft;
	}
	
	@RequestMapping(value = "getNeftdata/{neft_Id}",method = RequestMethod.GET)
	public Neft getNeftdata(@PathVariable("neft_Id") int neftid)
	{
		Neft neft=ns.getNeftdata(neftid);
		return neft;
	}
	
	@RequestMapping(value = "getallNeftdata",method=RequestMethod.GET)
	public List<Neft> getallNeftdata()
	{
		List<Neft> neftlist=ns.getallNeftdata();
		
		return neftlist;
		
	}
	
}
