package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.entity.Bill;
import com.example.entity.Offers;
import com.example.repository.BillRepository;
import com.example.repository.OfferRepository;

@Controller
public class RechargeController {

	@Autowired
	OfferRepository offerRepository;

	@Autowired
	BillRepository billRepository;

	@GetMapping("/")
	public String home() {
		return "index";
	}

	@GetMapping("showplan")
	public ModelAndView showPlan(@RequestParam("operator") Integer operatorId,
			@RequestParam("mobilenumber") Long mobileNo) {

		ModelAndView mv = new ModelAndView("plan");
		mv.addObject("offer", offerRepository.findByOperator(operatorId));
		mv.addObject("mobilenumber", mobileNo);
		return mv;
	}

	@GetMapping("rechargebill")
	public ModelAndView getBill(@RequestParam("planId") Integer planId, @RequestParam("mobilenumber") Long mobileNo) {

		ModelAndView mv = new ModelAndView("rechargebill");

		Offers offers = offerRepository.findById(planId).orElse(new Offers());

		mv.addObject("myplan", offers);
		mv.addObject("mobilenumber", mobileNo);

		Bill bill = new Bill();

		bill.setMobileNumber(mobileNo);
		bill.setOfferId(planId);

		billRepository.save(bill);

		mv.addObject("transctionId", bill.getTransactionId());

		return mv;

	}

}
