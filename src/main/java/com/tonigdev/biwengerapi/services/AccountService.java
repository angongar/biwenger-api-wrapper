package com.tonigdev.biwengerapi.services;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.tonigdev.biwengerapi.general.AppConstants;
import com.tonigdev.biwengerapi.model.AccountDto;
import com.tonigdev.biwengerapi.model.responses.AccountResponse;
import com.tonigdev.biwengerapi.model.responses.ApiResponse;
import com.tonigdev.biwengerapi.utils.JsonUtils;

public class AccountService {

	/**
	 * Obtiene los datos de la cuenta del usuario que recibe por parametros.
	 * @param httpClient
	 * @param authorization
	 * @return Datos de la cuenta
	 */
	public AccountDto getAccount(HttpClient httpClient, String authorization) {
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(AppConstants.urlAccount))
				.header("Content-Type", "application/json").header("Authorization", authorization)
				.header("Accept", "application/json").GET().build();

		try {
			HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

			if (response.statusCode() == 200) {
				ApiResponse<AccountResponse> apiResponse = JsonUtils.convertResponseToObject(response.body(),
						JsonUtils.getParametricType(ApiResponse.class, AccountResponse.class));
				System.out.println(response.body());
				return apiResponse.getData().getAccount();
			} else {
				System.err.println("Error en autenticación: " + response.body());
			}
		} catch (IOException | InterruptedException e) {
			System.out.println("Se ha producido un error: " + e.getMessage());
		}

		return null;
	}

}
