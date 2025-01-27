package com.tonigdev.biwengerapi.facade;

import java.net.http.HttpClient;

import com.tonigdev.biwengerapi.general.AppConstants;
import com.tonigdev.biwengerapi.model.AccountDto;
import com.tonigdev.biwengerapi.model.LeagueDto;
import com.tonigdev.biwengerapi.model.RoundDto;
import com.tonigdev.biwengerapi.model.request.LeagueRequest;
import com.tonigdev.biwengerapi.services.AccountService;
import com.tonigdev.biwengerapi.services.AuthService;
import com.tonigdev.biwengerapi.services.LeagueService;


public class BiwengerFacade {

	private final HttpClient httpClient;
	private final AuthService authService;
	private final AccountService accountService;
	private final LeagueService leagueService;
	
	public BiwengerFacade() {
		this.httpClient = HttpClient.newHttpClient();
		this.authService = new AuthService();
		this.accountService = new AccountService();
		this.leagueService = new LeagueService();
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
	
	
	// Acciones sobre una liga de un usuario
	
	public LeagueDto getLeagueInfo(String authorization, LeagueRequest request) {
		return leagueService.getLeagueInfo(httpClient, authorization, request);
	}

	public RoundDto getRound(String authorization, LeagueRequest request) {
		return leagueService.getRound(httpClient, authorization, request);
	}
	

}
