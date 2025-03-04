package com.tonigdev.biwengerapi.mapper;

import com.tonigdev.biwengerapi.model.LeagueDto;
import com.tonigdev.biwengerapi.model.request.LeagueRequest;
import com.tonigdev.biwengerapi.model.responses.LeagueResponse;

public class LeagueMapper {
	
	
	public static LeagueDto convertResponseToDto(LeagueResponse response) {
		LeagueDto res = null;
		
		if(response != null) {
			res = new LeagueDto();
			
			res.setName(response.getName());
			res.setMode(response.getMode());
			res.setScoreID(response.getScoreID());
			res.setCover(response.getCover());
			res.setCreated(response.getCreated());
			res.setId(response.getId());
			res.setMarketMode(response.getMarketMode());
			res.setType(response.getType());
			res.setIcon(response.getIcon());
			res.setUsers(response.getUsers());
		}
		
		return res;
		
		
	}

	public static LeagueRequest convertToRequest(String idleague, String iduser, int idRound) {
		LeagueRequest res = new LeagueRequest();
		
		if(idleague != null) {
			res.setIdleague(idleague);
		}
		
		if(iduser != null) {
			res.setIduser(iduser);
		}
		
		if(idRound != Integer.MIN_VALUE) {
			res.setRound(idRound);
		}
		
		return res;
	}

}
