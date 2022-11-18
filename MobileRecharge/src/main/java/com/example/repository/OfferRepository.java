package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.entity.Offers;

public interface OfferRepository extends JpaRepository<Offers, Integer> {

	
	@Query(value = "select * from Plans p where p.operatorid = operatorid", nativeQuery = true)
	List<Offers> findByOperator(@Param("operatorId")int operator);
}
