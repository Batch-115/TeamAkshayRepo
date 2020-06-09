package com.webcore.app.easyemi.master.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webcore.app.easyemi.master.model.Card;
@Repository
public interface CardRepository extends CrudRepository<Card,Integer>
{

}
