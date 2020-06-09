package com.webcore.app.easyemi.master.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.easyemi.master.dto.RoleDisplayDto;
import com.webcore.app.easyemi.master.model.Role;
import com.webcore.app.easyemi.master.service.RoleService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "masterRole")
public class RoleController {

	@Autowired
	RoleService rs;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String registerRole(@RequestBody Role role) {
		rs.saveRole(role);

		return "Role Added Successfully";

	}

	@RequestMapping(value = "/fetch", method = RequestMethod.GET)
	public List<Role> getAllRoles() {

		List<Role> roleList = rs.fetchAllData();
		return roleList;

	}
	
	@RequestMapping(value = "/getrolelist", method = RequestMethod.GET)
	public List<RoleDisplayDto> getRoleList() {

		List<RoleDisplayDto> roleList = rs.getRoleList();
		return roleList;

	}

	@RequestMapping(value = "/fetch/{roleId}", method = RequestMethod.GET)
	public Role getRole(@PathVariable("roleId") int id) {
		Role role = rs.getRoleById(id);

		return role;

	}

	@RequestMapping(value = "/delete/{roleId}", method = RequestMethod.DELETE)
	public List<Role> deleteRole(@PathVariable("roleId") int id) {
		rs.deleteRoleById(id);
		List<Role> roleList = rs.fetchAllData();
		return roleList;

	}
}
