package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.repository.BillRepository;
import com.example.repository.OfferRepository;



@Controller
public class RechargeController {

	@Autowired
	OfferRepository offerRepository;
	
	
	@Autowired
	BillRepository billRepository;
	

	@PostMapping("showplan")
	public ModelAndView showPlan(@RequestParam("operator") Integer operatorId, @RequestParam("mobilenumber") Long mobileNo){
		
		ModelAndView mv = new ModelAndView("plan");
		mv.addObject("offer", offerRepository.findByOperator(operatorId));
		mv.addObject("mobilenumber",mobileNo);
		return mv;
	}

	
}
