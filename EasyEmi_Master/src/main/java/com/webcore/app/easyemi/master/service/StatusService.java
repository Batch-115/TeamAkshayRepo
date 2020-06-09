package com.webcore.app.easyemi.master.service;

import java.util.List;

import com.webcore.app.easyemi.master.model.Status;

public interface StatusService {

	void saveRole(Status status);

	List<Status> fetchAllData();

	void deleteStatusById(int id);

}
