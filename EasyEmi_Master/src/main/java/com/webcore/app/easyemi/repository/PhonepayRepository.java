package com.webcore.app.easyemi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webcore.app.easyemi.model.Phonepay;

@Repository
public interface PhonepayRepository extends CrudRepository<Phonepay,Integer>
{

}
