package com.webcore.app.easyemi.master.service;

import java.util.List;

import com.webcore.app.easyemi.master.dto.RoleDisplayDto;
import com.webcore.app.easyemi.master.model.Role;

public interface RoleService {

	void saveRole(Role role);

	List<Role> fetchAllData();

	Role getRoleById(int id);

	void deleteRoleById(int id);

	List<RoleDisplayDto> getRoleList();

}
