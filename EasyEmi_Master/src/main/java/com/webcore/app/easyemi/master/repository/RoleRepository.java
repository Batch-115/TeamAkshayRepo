package com.webcore.app.easyemi.master.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.webcore.app.easyemi.master.dto.RoleDisplayDto;
import com.webcore.app.easyemi.master.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{
	@Query("Select new com.webcore.app.easyemi.master.dto.RoleDisplayDto(r.roleName) from Role r")
	public List<RoleDisplayDto> getRoleList();

}
