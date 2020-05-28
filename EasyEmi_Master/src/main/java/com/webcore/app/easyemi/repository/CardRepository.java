package com.webcore.app.easyemi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webcore.app.easyemi.model.Card;
@Repository
public interface CardRepository extends CrudRepository<Card,Integer>
{

}
