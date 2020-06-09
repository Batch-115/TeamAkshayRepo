package com.webcore.app.easyemi.master.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.easyemi.master.dto.BranchDisplay;
import com.webcore.app.easyemi.master.dto.BranchDto;
import com.webcore.app.easyemi.master.dto.UserDto;
import com.webcore.app.easyemi.master.model.Branch;
import com.webcore.app.easyemi.master.service.BranchI;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "masterbranch")
public class BranchController {
	@Autowired
	BranchI bi;

	@RequestMapping(value = "/branch", method = RequestMethod.POST)
    public String saveBranch(@RequestBody Branch branch)
    {
        bi.saveBranch(branch);
        return "branch added succesfully";
    }

    @RequestMapping(value = "/getbranch", method =  RequestMethod.GET)
    public List<Branch> getAllData()
    {
        List<Branch> branchlist = bi.getAllData();
        System.out.println("get data");
        return branchlist;
    }
    
    @RequestMapping(value = "/getallbranchdto", method =  RequestMethod.GET)
    public List<BranchDisplay> getAllBranchDto()
    {
        List<BranchDisplay> branchDtoList = bi.getAllBranchDto();
        return branchDtoList;
    }

    @RequestMapping(value = "/deletebranch/{branchId}", method = RequestMethod.DELETE)
    public void deleteBranch(@PathVariable("branchId") int id)
    {
        bi.deleteBranch(id);
    }

    @RequestMapping(value = "/getsinglebranch/{branchId}", method = RequestMethod.GET)
    public Branch getSingleBranch(@PathVariable("branchId") int id)
    {
        Branch singleBranch = bi.getSingleBranch(id);
        return singleBranch;
    }
    
    @RequestMapping(value = "/getsinglebranchDto/{branchId}", method = RequestMethod.GET)
    public BranchDto getSingleBranchDto(@PathVariable("branchId") int id)
    {
        Branch singleBranch = bi.getSingleBranch(id);
        ModelMapper m = new ModelMapper(); 
		BranchDto singleBranchDto = m.map(singleBranch,  BranchDto.class);
        return singleBranchDto;
    }
    
    @RequestMapping(value = "/updatebranch", method = RequestMethod.PUT)
    public void updateBranch(@RequestBody Branch branch)
    {
        bi.saveBranch(branch);
    }
}
