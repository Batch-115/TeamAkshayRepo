package com.webcore.app.easyemi.master.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.webcore.app.easyemi.master.dto.UserDisplayDto;
import com.webcore.app.easyemi.master.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	@Query("Select new com.webcore.app.easyemi.master.dto.UserDisplayDto(u.userId, u.firstName, u.lastName, u.mobileNo, u.emailId, u.role, ub.branchName) from User u INNER JOIN u.userBranch ub")
	List<UserDisplayDto> getAllUserDto();

}
