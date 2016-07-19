package com.epam.ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.epam.ui.NewClientsRequestModel;
import com.epam.ui.view.UrlConstants;

import backend.domain.Client;

@Controller
public class NewClientGetController {

	/*
	public Client saveClient(NewClientsRequestModel model){
		
	}*/
	
	@ModelAttribute
	public NewClientsRequestModel createNewClientModel(){
		return new NewClientsRequestModel();
	}
	
	public NewClientGetController(){
		super();
	}
	
	@RequestMapping(value=UrlConstants.NEW_CLIENT, method=RequestMethod.GET)
	public String newCLient(){
		return "newClient";
	}
}
