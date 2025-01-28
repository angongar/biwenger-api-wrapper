package com.tonigdev.biwengerapi.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tonigdev.biwengerapi.model.user.StatusUserDto;

import lombok.Data;

/*
 * Informacion del usuario asociado a una liga.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDto {

	// Identificador del usuario
	private int id;
	// Nombre del usuario
	private String name;
	// Balance del usuario
	private long balance;
	// Ruta del icono del usuario
	private String icon;
	// Rol del usuario
	private String role;
	// Tipo de usuario
	private String type;
	// Fecha en la que se unio
	private long joinDate;
	// Estado de usuario
	private StatusUserDto status;
	// Listado de favoritos
	private List<String> favorites;
	// Puntos del usuario
	private int points;
	// Posicion del usuario
	private int position;
	// Valor del equipo del usuario
	private int teamValue;
	// Alineacion actual del usuario
	private LineUpDto lineup;
}
