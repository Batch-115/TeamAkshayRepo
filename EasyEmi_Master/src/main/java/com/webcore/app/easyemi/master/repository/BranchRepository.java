package com.webcore.app.easyemi.master.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.webcore.app.easyemi.master.dto.BranchDisplay;
import com.webcore.app.easyemi.master.model.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Integer>{
	@Query("Select new com.webcore.app.easyemi.master.dto.BranchDisplay(br.branchId, br.branchName, br.branchType,"
			+ " br.branchMailId, brAddr.addressId, brAddr.city) from Branch br INNER JOIN br.branchAddress brAddr")
 	public List<BranchDisplay> getBranchDto();

}