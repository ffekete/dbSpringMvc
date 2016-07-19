package com.epam.ui.transformer;

import org.springframework.stereotype.Component;

import com.epam.ui.NewClientsRequestModel;

import backend.domain.Client;

@Component
public class NewClientRequestToClientTransformer {
	public Client transform(NewClientsRequestModel newClientRequestModel){
		Client newClient = new Client();
		newClient.setName(newClientRequestModel.getName());
		return newClient;
	}
}
