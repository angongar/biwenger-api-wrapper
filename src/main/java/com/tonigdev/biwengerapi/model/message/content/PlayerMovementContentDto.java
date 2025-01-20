package com.tonigdev.biwengerapi.model.message.content;

import com.tonigdev.biwengerapi.model.TeamDto;

import lombok.Data;

/**
 *  Informacion acerca del movimiento de jugadores
 */
@Data
public class PlayerMovementContentDto {
	// Tipo de movimiento
	private String type;
	// Jugador involucrado en el movimiento
	private int player;
	// Equipo desde el que se mueve
	private TeamDto from;
	// Equipo al que se mueve
	private TeamDto to;
	// Equipo actual del jugador, despues de hacer el movimiento
	private TeamDto team;

}
