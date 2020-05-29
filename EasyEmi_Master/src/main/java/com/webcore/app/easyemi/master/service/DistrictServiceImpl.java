package com.webcore.app.easyemi.master.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webcore.app.easyemi.master.model.District;
import com.webcore.app.easyemi.master.repository.DistrictRepository;

@Service
public class DistrictServiceImpl implements DistrictService{

	@Autowired
	DistrictRepository dr;
	
	@Override
	public void addDistrict(District district) {
		
		dr.save(district);
		
	}

	@Override
	public List<District> fetch() {
	
		List<District> list=dr.findAll();
		return list;
	}

	@Override
	public District fetch(int id) {
		
		District district=dr.findById(id).get();
		
		return district;
	}

	@Override
	public void delete(int id) {
		
		dr.deleteById(id);
	}


}
