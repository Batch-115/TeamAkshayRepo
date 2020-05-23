package com.webcore.app.easyemi.master.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webcore.app.easyemi.master.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
