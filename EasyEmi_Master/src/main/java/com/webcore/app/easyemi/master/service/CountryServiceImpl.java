package com.webcore.app.easyemi.master.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.easyemi.master.model.Country;
import com.webcore.app.easyemi.master.repository.CountryRepository;

@Service
public class CountryServiceImpl implements CountryService{
	@Autowired
	CountryRepository cr;

	@Override
	public void addCountry(Country country) {
		cr.save(country);
	}

	@Override
	public List<Country> getCountry(int cid) {
		List<Country> countryList=cr.findAll();
		return countryList;
	}

}
