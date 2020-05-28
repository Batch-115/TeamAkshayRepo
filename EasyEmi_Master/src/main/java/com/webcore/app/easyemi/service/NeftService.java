package com.webcore.app.easyemi.service;

import java.util.List;

import com.webcore.app.easyemi.model.Neft;

public interface NeftService {

	void registerNeftdata(Neft neft);

	Neft getNeftdata(int neftid);

	List<Neft> getallNeftdata();

}
