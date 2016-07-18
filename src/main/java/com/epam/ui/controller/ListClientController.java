package com.epam.ui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.epam.ui.transformer.ClientsToListClientsModelTransformer;
import com.epam.ui.view.ListClientsModel;
import com.epam.ui.view.UrlConstants;

import backend.service.BankService;

@Controller
public class ListClientController {
	private BankService bankService;
	
	private ClientsToListClientsModelTransformer transformer;

	@Autowired
	public ListClientController(BankService bankService, ClientsToListClientsModelTransformer transformer) {
		super();
		this.bankService = bankService;
		this.transformer = transformer;
	}
	
	@RequestMapping(value=UrlConstants.LIST_CLIENTS, method=RequestMethod.GET)
	public String listClients(){
		return "listClients";
	}
	
	@ModelAttribute
	public ListClientsModel listClientsModel(){
		return transformer.transform(bankService.listClients());
	}
}
