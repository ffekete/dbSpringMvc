package com.epam.ui;

public class NewClientsRequestModel {
	public NewClientsRequestModel() {
		super();
	}

	private String name;

	public NewClientsRequestModel(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}