package com.webcore.app.easyemi.master.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webcore.app.easyemi.master.model.Neft;

@Repository
public interface NeftRepository extends CrudRepository<Neft,Integer>
{

}
