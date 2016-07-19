package com.epam.ui;

import javax.validation.constraints.Size;

public class NewClientsRequestModel {
	public NewClientsRequestModel() {
		super();
	}

	@Size(min=5)
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