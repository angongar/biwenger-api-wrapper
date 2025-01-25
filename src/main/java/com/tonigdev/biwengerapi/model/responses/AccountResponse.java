package com.tonigdev.biwengerapi.model.responses;

import java.util.List;

import com.tonigdev.biwengerapi.model.AccountDto;
import com.tonigdev.biwengerapi.model.LeagueDto;
import com.tonigdev.biwengerapi.model.NotificationDto;
import com.tonigdev.biwengerapi.model.user.LocationDto;

import lombok.Data;

@Data
public class AccountResponse {
	
	private AccountDto account;
	private List<LeagueDto> leagues;
	private List<NotificationDto> notifications;
	private LocationDto location;
	private Integer lastOfficialLeagueChange;
	private Integer version;

}
