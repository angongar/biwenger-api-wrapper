package com.tonigdev.biwengerapi.model.message;

import java.util.List;

import lombok.Data;

/**
 * Informacion sobre el autor del mensaje.
 */
@Data
public class AuthorDto {

	// Nombre del autor
	private String name;
	// Icono o avatar del autor
	private String icon;
	// Identificador del autor
	private int id;
	// Lista de respuestas a mensajes del autor
	private List<Integer> response;
}
