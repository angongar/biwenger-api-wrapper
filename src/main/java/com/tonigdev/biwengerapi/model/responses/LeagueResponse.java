package com.tonigdev.biwengerapi.model.responses;

import java.util.List;

import com.tonigdev.biwengerapi.model.UserDto;

import lombok.Data;

@Data
public class LeagueResponse {
	
	private String name;
	private String mode;
	private Integer scoreID;
	private String cover;
	private Integer created;
	private Integer id;
	private String marketMode;
	private String type;
	private String icon;
	private List<UserDto> users;

}
