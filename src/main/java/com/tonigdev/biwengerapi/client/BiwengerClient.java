package com.tonigdev.biwengerapi.client;

import com.tonigdev.biwengerapi.facade.BiwengerFacade;

public class BiwengerClient {
	
	private final BiwengerFacade facade;
	private String accessToken;
	
	public BiwengerClient() {
		this.facade = new BiwengerFacade();
		this.accessToken = null;
	}
	
	public void login(String username, String pass) {
		if(facade.login(username, pass)) {
			this.accessToken = facade.getAccessToken();
		}
	}
	
	public void logout() {
		facade.logout();
		this.accessToken = null;
	}
	
    public boolean isAuthenticated() {
        return accessToken != null;
    }

}
