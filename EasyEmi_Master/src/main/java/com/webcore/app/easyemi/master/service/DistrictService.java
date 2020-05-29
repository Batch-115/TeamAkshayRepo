package com.webcore.app.easyemi.master.service;

import java.util.List;

import com.webcore.app.easyemi.master.model.District;

public interface DistrictService {

	void addDistrict(District district);

	List<District> fetch();

	District fetch(int id);


	void delete(int id);

}
