package com.tonigdev.biwengerapi.client;

import com.tonigdev.biwengerapi.facade.BiwengerFacade;
import com.tonigdev.biwengerapi.mapper.LeagueMapper;
import com.tonigdev.biwengerapi.model.AccountDto;
import com.tonigdev.biwengerapi.model.LeagueDto;
import com.tonigdev.biwengerapi.utils.HeadersUtils;

public class BiwengerClient {
	
	private final BiwengerFacade facade;
	private String accessToken;
	
	public BiwengerClient() {
		this.facade = new BiwengerFacade();
		this.accessToken = null;
	}
	
	public void login(String username, String pass) {
		this.accessToken = facade.login(username, pass);
	}
	
	public void logout() {
		this.accessToken = null;
	}
	
    public boolean isAuthenticated() {
        return accessToken != null;
    }
    
    // Funciones para obtener datos de la cuenta del usuario
    
    public AccountDto getAccount() {
    	AccountDto account = null;
    	String authorization = HeadersUtils.convertToBearerToken(this.accessToken);
    	try {
    		account = facade.getAccount(authorization);
    		
    	}catch(Exception e) {
    		// Lanzariamos aqui la excepcion correspondiente del cliente
    	}
    	
    	return account;
    }
    
    // Acciones relacionadas con la liga de un usuario
    
    public LeagueDto getLeagueInfo(String idleague, String iduser) {
    	LeagueDto league = null;
    	String authorization = HeadersUtils.convertToBearerToken(this.accessToken);
    	try {
    		league = facade.getLeagueInfo(authorization, LeagueMapper.convertToRequest(idleague, iduser));
    		
    	}catch(Exception e) {
    		// Lanzariamos aqui la excepcion correspondiente del cliente
    	}
    	
    	return league;
    
    }
    

}
