package com.webcore.app.easyemi.master.service;

import java.util.List;

import com.webcore.app.easyemi.master.model.Phonepay;

public interface PhonepayService {

	void registerPhonepay(Phonepay phonepay);

	Phonepay getPhonepaydata(int phonepayid);

	List<Phonepay> getallPhonepaydata();

}
