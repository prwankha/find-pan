package com.cg.banking.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.support.CustomSQLExceptionTranslatorRegistry;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cg.banking.dto.Customer;
import com.cg.banking.services.BankingService;

@Controller
public class BankingControllers {

	@Autowired
	BankingService services;
	public BankingService getServices() {
		return services;
	}
	public void setServices(BankingService services) {
		this.services = services;
	}
	public BankingControllers() {
		super();
	}
	@RequestMapping(value = "Test", method = RequestMethod.GET)
	public String displayTestPage( Model model) {
		model.addAttribute("customer",new Customer());
		return "acceptpancard";
	}
	@RequestMapping(value = "Success", method = RequestMethod.POST)
	public String displaySuccessPage(Model model,@ModelAttribute(value="customer") @Valid Customer customer,BindingResult result) {
	Customer cust = services.findPanNumber(customer.getPanCardNumber());
	System.out.println("customer is : "+cust);
	if(cust == null) {
		model.addAttribute("message", "Please check your pan number your details does not exist.");
		return "Error";
	}
	else if(cust.getCibilScore() < 750) {
		model.addAttribute("message", "Hii "+cust.getCustomerName()+"as your Cibil Score"+cust.getCibilScore()+" is poor, we are pleased to inform you that you are not eligible to get loan from us.");
		return "Error";
	}
	model.addAttribute("message", "Hii "+cust.getCustomerName()+"as your Cibil Score"+cust.getCibilScore()+" is good, we are pleased to inform you that you are eligible to get loan from us.");
	return "Success";
	} 
}
