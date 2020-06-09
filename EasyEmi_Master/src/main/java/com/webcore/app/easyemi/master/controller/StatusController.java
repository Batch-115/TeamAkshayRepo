package com.webcore.app.easyemi.master.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.easyemi.master.model.Status;
import com.webcore.app.easyemi.master.service.StatusService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "masterStatus")
public class StatusController {

	@Autowired
	StatusService ss;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String registerRole(@RequestBody Status status) {
		ss.saveRole(status);
		return "Status Added Successfully";
	}

	@RequestMapping(value = "/fetch", method = RequestMethod.GET)
	public List<Status> getAllRoles() {
		List<Status> statusList = ss.fetchAllData();
		return statusList;
	}

	@RequestMapping(value = "/delete/{statusId}", method = RequestMethod.DELETE)
	public List<Status> deleteRole(@PathVariable("statusId") int id) {
		ss.deleteStatusById(id);
		List<Status> statusList = ss.fetchAllData();
		return statusList;
	}

}
