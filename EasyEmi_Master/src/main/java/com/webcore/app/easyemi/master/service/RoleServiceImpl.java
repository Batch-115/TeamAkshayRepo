package com.webcore.app.easyemi.master.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.easyemi.master.dto.RoleDisplayDto;
import com.webcore.app.easyemi.master.model.Role;
import com.webcore.app.easyemi.master.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	RoleRepository rr;
	
	@Override
	public void saveRole(Role role) {
		
		rr.save(role);
		
	}

	@Override
	public List<Role> fetchAllData() {
		// TODO Auto-generated method stub
		List<Role> roleList=rr.findAll()
;		return roleList;
	}

	@Override
	public Role getRoleById(int id) {
		// TODO Auto-generated method stub
		Role role=rr.findById(id).get();
		return role;
	}

	@Override
	public void deleteRoleById(int id) {
		// TODO Auto-generated method stub
		rr.deleteById(id);
		
	}

	@Override
	public List<RoleDisplayDto> getRoleList() {
		List<RoleDisplayDto> roleList=rr.getRoleList();
		return roleList;
	}

}
