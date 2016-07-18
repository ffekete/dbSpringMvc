package com.epam.ui.view;

public class ListClientsModel {
	private Iterable<ClientDto> clients;
	
	private String newClientUrl;

	public Iterable<ClientDto> getClients() {
		return clients;
	}

	public void setClients(Iterable<ClientDto> clients) {
		this.clients = clients;
	}

	public String getNewClientUrl() {
		return newClientUrl;
	}

	public void setNewClientUrl(String newClientUrl) {
		this.newClientUrl = newClientUrl;
	}

	public ListClientsModel(Iterable<ClientDto> clients, String newClientUrl) {
		super();
		this.clients = clients;
		this.newClientUrl = newClientUrl;
	}
	

}
