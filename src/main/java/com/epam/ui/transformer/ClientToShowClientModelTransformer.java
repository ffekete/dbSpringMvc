package com.epam.ui.transformer;

import org.springframework.stereotype.Component;

import com.epam.ui.ShowClientModel;

import backend.domain.Client;

@Component
public class ClientToShowClientModelTransformer {
	public ShowClientModel transform(Client client){
		ShowClientModel showClientModel = new ShowClientModel(client.getName());
		showClientModel.setId(client.getId());
		return showClientModel;
	}
}
