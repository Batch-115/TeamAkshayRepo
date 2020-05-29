package com.webcore.app.easyemi.master.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.easyemi.master.model.District;
import com.webcore.app.easyemi.master.service.DistrictService;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "masterDistrict")
public class DistrictController {
	
	@Autowired
	DistrictService ds;
	
@RequestMapping(value = "/add",method = RequestMethod.POST)
	public String registerDistrict(@RequestBody District district)
	{
		ds.addDistrict(district);
		return "District added Successfully";
	}
@RequestMapping(value = "/fetch",method = RequestMethod.GET)
public List<District> getAllData(){
	
	List<District> list=ds.fetch();
	return list;
	
}
@RequestMapping(value = "fetch/{districtId}",method = RequestMethod.GET)
public District getDistrict(@PathVariable("districtId") int id)
{
	District district=ds.fetch(id);
	return district;
	
}
@RequestMapping(value = "delete/{districtId}",method = RequestMethod.DELETE)
public String deleteDistrict(@PathVariable("districtId") int id)
{
	ds.delete(id);
	return "delete record Successfully";
	
}

}
