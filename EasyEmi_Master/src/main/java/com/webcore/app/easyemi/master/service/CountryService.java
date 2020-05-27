package com.webcore.app.easyemi.master.service;

import java.util.List;

import com.webcore.app.easyemi.master.model.Country;

public interface CountryService {

	void addCountry(Country country);

	List<Country> getCountry(int cid);

}
