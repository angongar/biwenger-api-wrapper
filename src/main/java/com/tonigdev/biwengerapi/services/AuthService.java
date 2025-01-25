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


	public String authenticate(HttpClient httpClient, String username, String password, String url) {
		String res = null;
		CredentialsDto credentials = new CredentialsDto(username, password);
		String requestBody = JsonUtils.convertToJson(credentials);

		if (requestBody != null) {
			HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url))
					.header("Content-Type", "application/json")
					.header("Accept", "application/json")
					.POST(HttpRequest.BodyPublishers.ofString(requestBody))
					.build();
			
			try {
				HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
				
				if(response.statusCode() == 200) {
					res = extractToken(response.body());
				}else{
					System.err.println("Error en autenticación: " + response.body());
				}
				
			} catch (IOException | InterruptedException e) {
				System.out.println("Se ha producido un error: " + e.getMessage());
			}
		}
		
		return res;

	}
	
	private String extractToken(String responseBody) {
        return responseBody.replaceAll(".*\"token\":\"([^\"]+)\".*", "$1");
    }

}
