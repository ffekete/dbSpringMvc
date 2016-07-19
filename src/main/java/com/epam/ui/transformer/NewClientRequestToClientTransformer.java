package com.epam.ui.transformer;

import com.epam.ui.NewClientsRequestModel;

import backend.domain.Client;

public class NewClientRequestToClientTransformer {
	public Client transform(NewClientsRequestModel newClientRequestModel){
		Client newClient = new Client();
		newClient.setName(newClientRequestModel.getName());
		return newClient;
	}
}
