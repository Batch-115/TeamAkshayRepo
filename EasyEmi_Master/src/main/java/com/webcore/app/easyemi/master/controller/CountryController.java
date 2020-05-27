package com.webcore.app.easyemi.master.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.easyemi.master.model.Country;
import com.webcore.app.easyemi.master.service.CountryService;

@RestController
@CrossOrigin("*")
//@RequestMapping(path = "mastercountry")
public class CountryController {
	@Autowired
	CountryService cs;
	
	@RequestMapping(value = "/addcountry", method = RequestMethod.POST)
	public String addCountry(@RequestBody Country country)
	{
		cs.addCountry(country);
		return "country Added Successfully!!!";
	}
	
	@RequestMapping(value = "/getcountry/{countryId}", method = RequestMethod.GET)
	public List<Country> getCountry(@PathVariable("countryId") int cid)
	{
		List<Country> countryList=cs.getCountry(cid);
		return countryList;
	}

}
