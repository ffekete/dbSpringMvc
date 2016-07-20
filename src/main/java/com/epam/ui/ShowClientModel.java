package com.epam.ui;

public class ShowClientModel {
	
	private Long id;
	
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ShowClientModel(String name) {
		super();
		this.name = name;
	}
}
