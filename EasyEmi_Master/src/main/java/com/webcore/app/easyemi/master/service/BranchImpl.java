package com.webcore.app.easyemi.master.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.easyemi.master.dto.BranchDisplay;
import com.webcore.app.easyemi.master.model.Branch;
import com.webcore.app.easyemi.master.repository.BranchRepository;

@Service
public class BranchImpl implements BranchI{
	@Autowired
	BranchRepository br;
	
	@Override
	public void saveBranch(Branch branch) {
		br.save(branch);
	}
	
	@Override
	public List<Branch> getAllData() {
		List<Branch> branchList=br.findAll();
		return branchList;
	}
	
	@Override
	public void deleteBranch(int id) {
		br.deleteById(id);
		
	}

	@Override
	public Branch getSingleBranch(int id) {
		Branch branch=br.findById(id).get();
		return branch;
	}

	@Override
	public List<BranchDisplay> getAllBranchDto() {
		List<BranchDisplay> branchDtoList=br.getBranchDto();
		return branchDtoList;
	}
	
	

}
