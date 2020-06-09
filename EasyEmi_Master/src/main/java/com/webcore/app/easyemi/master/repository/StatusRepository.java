package com.webcore.app.easyemi.master.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webcore.app.easyemi.master.model.Status;

@Repository
public interface StatusRepository extends JpaRepository<Status, Integer>{

}
