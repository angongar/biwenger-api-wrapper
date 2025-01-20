package com.tonigdev.biwengerapi.services;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Optional;

import com.tonigdev.biwengerapi.model.CredentialsDto;
import com.tonigdev.biwengerapi.utils.JsonUtils;

public class AuthService {

	private final HttpClient httpClient;
	private Optional<String> accessToken;

	public AuthService() {
		this.httpClient = HttpClient.newHttpClient();
		this.accessToken = Optional.empty();
	}

	public boolean authenticate(String username, String password, String url) {
		boolean res = false;
		CredentialsDto credentials = new CredentialsDto(username, password);
		String requestBody = JsonUtils.convertToJson(credentials);

		if (requestBody != null) {
			HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url))
					.header("Content-Type", "application/json").POST(HttpRequest.BodyPublishers.ofString(requestBody))
					.build();
			
			try {
				HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
				
				if(response.statusCode() == 200) {
					this.accessToken = Optional.of(extractToken(requestBody));
					res = true;
				}else{
					System.err.println("Error en autenticación: " + response.body());
				}
				
			} catch (IOException | InterruptedException e) {
				System.out.println("Se ha producido un error: " + e.getMessage());
				return false;
			}
		}
		
		return res;

	}
	
    public String getAccessToken() {
        return accessToken.orElseThrow(() -> new IllegalStateException("No está autenticado."));
    }
	
	private String extractToken(String responseBody) {
        return responseBody.replaceAll(".*\"token\":\"([^\"]+)\".*", "$1");
    }

	public void logout() {
		this.accessToken = Optional.empty();
	}
	
	public boolean isAuthenticated() {
        return accessToken.isPresent();
    }
}
