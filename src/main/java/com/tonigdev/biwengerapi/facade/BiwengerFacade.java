package com.tonigdev.biwengerapi.facade;

import com.tonigdev.biwengerapi.general.AppConstants;
import com.tonigdev.biwengerapi.services.AuthService;


public class BiwengerFacade {
	private final AuthService authService;
	
	public BiwengerFacade() {
		this.authService = new AuthService();
	}
	
	public boolean login(String username, String password) {
		return authService.authenticate(username, password, AppConstants.urlLogin);
	}
	
    public String getAccessToken() {
        return authService.getAccessToken();  // Proporciona el token de acceso cuando se requiere
    }

	public void logout() {
		authService.logout();
	}
	
    public boolean isAuthenticated() {
        return authService.isAuthenticated();
    }
	

}
