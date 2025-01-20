package com.tonigdev.biwengerapi.model.league;

import com.tonigdev.biwengerapi.model.league.content.LeagueUpgradeContentDto;

import lombok.Data;

/**
 * Informacion de las mejoras disponibles para la liga
 */
@Data
public class LeagueUpgradeDto {
	// Informacion sobre la mejora premium
	private LeagueUpgradeContentDto premium;
	// Informacion sobre la mejora ultra
	private LeagueUpgradeContentDto ultra;

}
