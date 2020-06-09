package com.webcore.app.easyemi.master.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.easyemi.master.model.Status;
import com.webcore.app.easyemi.master.repository.StatusRepository;

@Service
public class StatusServiceimpl implements StatusService{

	@Autowired
	StatusRepository sr;
	
	@Override
	public void saveRole(Status status) {
		// TODO Auto-generated method stub
		sr.save(status);
	}

	@Override
	public List<Status> fetchAllData() {
		// TODO Auto-generated method stub
		
		List<Status> statusList=sr.findAll();
		return statusList;
	}

	@Override
	public void deleteStatusById(int id) {
		// TODO Auto-generated method stub
		sr.deleteById(id);
		
	}

}
