package com.tonigdev.biwengerapi.model.responses;

import com.tonigdev.biwengerapi.model.LeagueDto;
import com.tonigdev.biwengerapi.model.RoundDto;

import lombok.Data;

@Data
public class RoundResponse {
	
	private RoundDto round;
	private LeagueDto league;

}
