package com.epam.ui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.epam.ui.NewClientsRequestModel;
import com.epam.ui.transformer.NewClientRequestToClientTransformer;

import backend.domain.Client;
import backend.service.BankService;

@Controller
public class NewClientPostController {
	@Autowired
	NewClientRequestToClientTransformer transformer;
	
	@Autowired
	BankService bankService;
	
	public void newClient(NewClientsRequestModel newClientRequestModel){
		Client newClient = transformer.transform(newClientRequestModel);
		bankService.SaveClient(newClient);
	}
}
