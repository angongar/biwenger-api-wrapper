package com.tonigdev.biwengerapi.services;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.tonigdev.biwengerapi.general.AppConstants;
import com.tonigdev.biwengerapi.mapper.LeagueMapper;
import com.tonigdev.biwengerapi.model.LeagueDto;
import com.tonigdev.biwengerapi.model.RoundDto;
import com.tonigdev.biwengerapi.model.request.LeagueRequest;
import com.tonigdev.biwengerapi.model.responses.ApiResponse;
import com.tonigdev.biwengerapi.model.responses.LeagueResponse;
import com.tonigdev.biwengerapi.model.responses.RoundResponse;
import com.tonigdev.biwengerapi.utils.JsonUtils;

public class LeagueService {

	public LeagueDto getLeagueInfo(HttpClient httpClient, String authorization, LeagueRequest leagueRequest) {

		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(AppConstants.urlLeague))
				.header("Content-Type", "application/json").header("Authorization", authorization)
				.header("X-League", leagueRequest.getIdleague()).header("X-User", leagueRequest.getIduser()).GET()
				.build();

		try {
			HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

			if (response.statusCode() == 200) {
				ApiResponse<LeagueResponse> apiResponse = JsonUtils.convertResponseToObject(response.body(),
						JsonUtils.getParametricType(ApiResponse.class, LeagueResponse.class));
				System.out.println(response.body());
				return LeagueMapper.convertResponseToDto(apiResponse.getData());
			}

		} catch (IOException | InterruptedException e) {
			System.out.println("Se ha producido un error: " + e.getMessage());
		}

		return null;
	}

	public RoundDto getRound(HttpClient httpClient, String authorization, LeagueRequest leagueRequest) {
		String url = String.format(AppConstants.urlRound, String.valueOf(leagueRequest.getRound()));

		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url))
				.header("Content-Type", "application/json").header("Authorization", authorization)
				.header("X-League", leagueRequest.getIdleague()).header("X-User", leagueRequest.getIduser()).GET()
				.build();

		try {
			HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

			if (response.statusCode() == 200) {
				ApiResponse<RoundResponse> apiResponse = JsonUtils.convertResponseToObject(response.body(),
						JsonUtils.getParametricType(ApiResponse.class, RoundResponse.class));
				System.out.println(response.body());
				return apiResponse.getData().getRound();
			}

		} catch (IOException | InterruptedException e) {
			System.out.println("Se ha producido un error: " + e.getMessage());
		}

		return null;

	}

	public RoundDto getLastRound(HttpClient httpClient, String authorization, LeagueRequest leagueRequest) {

		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(AppConstants.urlLastRound))
				.header("Content-Type", "application/json").header("Authorization", authorization)
				.header("X-League", leagueRequest.getIdleague()).header("X-User", leagueRequest.getIduser()).GET()
				.build();

		try {
			HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

			if (response.statusCode() == 200) {
				ApiResponse<RoundResponse> apiResponse = JsonUtils.convertResponseToObject(response.body(),
						JsonUtils.getParametricType(ApiResponse.class, RoundResponse.class));
				System.out.println(response.body());
				return apiResponse.getData().getRound();
			}

		} catch (IOException | InterruptedException e) {
			System.out.println("Se ha producido un error: " + e.getMessage());
		}

		return null;

	}

}
