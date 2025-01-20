package com.tonigdev.biwengerapi.model;

import lombok.Data;

/**
 * Informacion de un equipo.
 */
@Data
public class TeamDto {

	// Identificador unico del equipo
	private int id;
	// Nombre del equipo
	private String name;
	// Nombre de equipo en formato slug
	private String slug;

}
