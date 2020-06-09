package com.webcore.app.easyemi.master.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.easyemi.master.dto.DistStateCountry;
import com.webcore.app.easyemi.master.dto.DistrictListDto;
import com.webcore.app.easyemi.master.model.District;
import com.webcore.app.easyemi.master.service.DistrictService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "masterDistrict")
public class DistrictController {
	@Autowired
	DistrictService ds;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<String> registerDistrict(@RequestBody District district) {
		ds.addDistrict(district);
		return new ResponseEntity<String>("District Added Successfully!!!",HttpStatus.OK);
	}

	@RequestMapping(value = "/fetch", method = RequestMethod.GET)
	public List<District> getAllData() {
		List<District> list = ds.fetch();
		return list;
	}
	
	@RequestMapping(value = "/ditrictdtolist", method = RequestMethod.GET)
	public List<DistrictListDto> getAllDistrict() {
		List<DistrictListDto> districtDtoList = ds.fetchDistrictList();
		return districtDtoList;
	}

	@RequestMapping(value = "/fetch/{distId}", method = RequestMethod.GET)
	public District getDistrict(@PathVariable("distId") int id) {
		District district = ds.fetch(id);
		return district;
	}
	
	@RequestMapping(value = "/fetchdistrict/{distId}", method = RequestMethod.GET)
	public DistStateCountry getDistStateCountry(@PathVariable("distId") int id) {
		//District district = ds.fetch(id);
		DistStateCountry distStateCountry=ds.fetchDistStateCountry(id);
		return distStateCountry;
	}

	@RequestMapping(value = "/delete/{districtId}", method = RequestMethod.DELETE)
	public List<District> deleteDistrict(@PathVariable("districtId") int id) {
		ds.delete(id);
		List<District> list = ds.fetch();
		return list;
	}

}
