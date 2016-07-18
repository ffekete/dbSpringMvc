package com.epam.ui.transformer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.epam.ui.view.ClientDto;
import com.epam.ui.view.ListClientsModel;
import com.epam.ui.view.UrlConstants;

import backend.domain.Client;

@Component
public class ClientsToListClientsModelTransformer {
	public ListClientsModel transform(Iterable<Client> clients) {
		List<ClientDto> clientDtos = new ArrayList<ClientDto>();

		for (Client c : clients) {
			ClientDto clientDto = new ClientDto();
			clientDto.setId(c.getId());
			clientDto.setName(c.getName());
			clientDto.setViewUrl(UrlConstants.showClient(c.getId()));
			clientDtos.add(clientDto);
		}

		return new ListClientsModel(clientDtos, UrlConstants.NEW_CLIENT);
	}
}
