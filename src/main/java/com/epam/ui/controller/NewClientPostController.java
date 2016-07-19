package com.epam.ui.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.epam.ui.NewClientsRequestModel;
import com.epam.ui.transformer.NewClientRequestToClientTransformer;
import com.epam.ui.view.UrlConstants;

import backend.domain.Client;
import backend.service.BankService;

@Controller
public class NewClientPostController {
	
	@Autowired
	public NewClientPostController(NewClientRequestToClientTransformer transformer, BankService bankService) {
		super();
		this.transformer = transformer;
		this.bankService = bankService;
	}
	
	NewClientRequestToClientTransformer transformer;
	
	BankService bankService;
	
	@ModelAttribute
	public void newClient(@Valid NewClientsRequestModel newClientRequestModel, BindingResult errors){
		
		if(errors.hasErrors()){
			return;
		}
		
		Client newClient = transformer.transform(newClientRequestModel);
		bankService.SaveClient(newClient);
	}
	
	@RequestMapping(value=UrlConstants.NEW_CLIENT_POST, method=RequestMethod.POST)
	public String newCLient(@Valid NewClientsRequestModel newClientRequestModel, BindingResult errors){
		if(errors.hasErrors()){
			return "newClient";
		}
		return "redirect:" + UrlConstants.LIST_CLIENTS;
	}
	
	public NewClientPostController(){
		
	}
}
