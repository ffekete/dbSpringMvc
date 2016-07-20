package com.epam.ui.view;

public class UrlConstants {
	public static final String LOGIN_PAGE = "/loginPage.html";
	public static final String LIST_CLIENTS = "/listClients.html";
	public static final String SHOW_CLIENT = "/showClient.html";
	public static final String NEW_CLIENT = "/newClient.html";
	public static final String NEW_CLIENT_POST = "/newClientPost.html";
	public static final String FILE_UPLOAD = "/uploadForm.html";
	public static final String FILE_DOWNLOAD = "/downloadForm/{symbolicName:[a-z-]+}{extension:\\.[a-z]+}";
	
	public static String showClient(long clientId){
		return SHOW_CLIENT + "?id=" + clientId;
	}
}
