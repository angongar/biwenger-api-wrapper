package com.tonigdev.biwengerapi.facade;

import java.net.http.HttpClient;

import com.tonigdev.biwengerapi.general.AppConstants;
import com.tonigdev.biwengerapi.model.AccountDto;
import com.tonigdev.biwengerapi.services.AccountService;
import com.tonigdev.biwengerapi.services.AuthService;


public class BiwengerFacade {

	private final HttpClient httpClient;
	private final AuthService authService;
	private final AccountService accountService;
	
	public BiwengerFacade() {
		this.httpClient = HttpClient.newHttpClient();
		this.authService = new AuthService();
		this.accountService = new AccountService();
	}
	
	// Acciones sobre el login del usuario
	
	public String login(String username, String password) {
		return authService.authenticate(httpClient, username, password, AppConstants.urlLogin);
	}
	
	public String loginWithGoogle(String email, String password) {
		// Implimentar logica para el logeo de usuario con google.
		return null;
	}
	
	public String loginWithFacebook(String email, String password) {
		// Implimentar logica para el logeo de usuario con facebook.
		return null;
	}
	
	// Acciones sobre la cuenta del usuario
	
	public AccountDto getAccount(String authorization) {
		return accountService.getAccount(httpClient, authorization);
	}
	

}
