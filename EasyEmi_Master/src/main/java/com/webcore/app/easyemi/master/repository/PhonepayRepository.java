package com.webcore.app.easyemi.master.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webcore.app.easyemi.master.model.Phonepay;

@Repository
public interface PhonepayRepository extends CrudRepository<Phonepay,Integer>
{

}
