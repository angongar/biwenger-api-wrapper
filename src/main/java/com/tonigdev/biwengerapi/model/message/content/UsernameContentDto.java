package com.tonigdev.biwengerapi.model.message.content;

import com.tonigdev.biwengerapi.model.message.AuthorDto;

import lombok.Data;

/**
 * Representa un cambio en el nombre del participante
 */
@Data
public class UsernameContentDto {
	// Usuario que cambia de nombre
	private AuthorDto user;
	// Nombre anterior
	private String from;
	// Nuevo nombre
	private String to;
}
