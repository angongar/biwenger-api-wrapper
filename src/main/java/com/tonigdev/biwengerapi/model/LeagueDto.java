package com.tonigdev.biwengerapi.model;

import java.util.List;

import com.tonigdev.biwengerapi.model.league.LeagueSettingsDto;
import com.tonigdev.biwengerapi.model.league.LeagueUpgradeDto;
import com.tonigdev.biwengerapi.model.message.content.SponsorDto;

import lombok.Data;

/*
 * Informacion de la liga de la cuenta de usuario.
 */
@Data
public class LeagueDto {

	// Identificador de la liga
	private int id;
	// Nombre de la liga
	private String name;
	// Competicion a la que pertenece
	private String competition;
	// Identificadopr del sistema de puntuacion
	private int scoreID;
	// Tipo de liga
	private String type;
	// Modo de la liga
	private String mode;
	// Mode de mercado de la liga
	private String marketMode;
	// Fecha de creacion de la liga
	private int created;
	// Ruta del icono de la liga
	private String icon;
	// Ruta de la portada de la liga
	private String cover;
	// Informacion del usuario de la liga
	private UserDto user;
	// Informacion de los usuarios de la liga
	private List<UserDto> users;
	// Configuracion de la liga
	private LeagueSettingsDto settings;
	// Mejoras disponibles para la liga
	private LeagueUpgradeDto upgrades;
	// Clasificaciones de los usuarios en la liga
	private List<UserDto> standings;
	// Tablon de anuncios de la liga
	private String billboardLink;
	// Campo adicional
	private String customField;
	// Informacion sobre el sponsor de la liga
	private SponsorDto sponsor;

}
