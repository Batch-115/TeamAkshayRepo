package com.webcore.app.easyemi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webcore.app.easyemi.model.Neft;

@Repository
public interface NeftRepository extends CrudRepository<Neft,Integer>
{

}
