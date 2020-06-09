package com.webcore.app.easyemi.master.service;

import java.util.List;

import com.webcore.app.easyemi.master.dto.BranchDisplay;
import com.webcore.app.easyemi.master.model.Branch;

public interface BranchI {

	void saveBranch(Branch branch);

	List<Branch> getAllData();

	void deleteBranch(int id);

	Branch getSingleBranch(int id);

	List<BranchDisplay> getAllBranchDto();

}
