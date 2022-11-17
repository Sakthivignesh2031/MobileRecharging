package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.repository.BillRepository;
import com.example.repository.OfferRepository;



@RestController
public class RechargeController {

	@Autowired
	OfferRepository offerRepository;
	
	
	@Autowired
	BillRepository billRepository;
	
	
	
	
}
