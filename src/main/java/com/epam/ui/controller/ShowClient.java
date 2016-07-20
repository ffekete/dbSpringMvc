package com.epam.ui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.epam.ui.ShowClientModel;
import com.epam.ui.ShowClientRequestModel;
import com.epam.ui.transformer.ClientToShowClientModelTransformer;
import com.epam.ui.view.UrlConstants;

import backend.domain.Client;
import backend.service.BankService;

@Controller
public class ShowClient {
	@Autowired
	BankService bankService;
	
	@RequestMapping(value=UrlConstants.SHOW_CLIENT, method=RequestMethod.GET)
	public String getUserForm(){
		return "showUser";
	}
	
	@ModelAttribute
	public ShowClientModel getShowClientModel(ShowClientRequestModel showClientRequestModel){
		Client client = bankService.getClientById(showClientRequestModel.getId());
		return new ClientToShowClientModelTransformer().transform(client);
	}
}
