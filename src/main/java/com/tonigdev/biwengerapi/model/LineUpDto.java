package com.tonigdev.biwengerapi.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

/**
 * Informacion sobre la alineacion usada por el usuario en cada jornada/ronda.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class LineUpDto {

	// Tipo de alineacion
	private String type;
	// Puntos obtenidos en la jornada/ronda
	private int points;
	// Posicion en la clasificacion de la jornada/ronda
	private int position;
	// Fecha de la jornada/ronda
	private int date;
	// Lista de IDs de los jugadores en la alineacion
	private List<Integer> players;
	// Indicador de si la alineacion cuenta para la clasificacion general
	private boolean count;

}
