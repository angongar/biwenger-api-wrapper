package com.tonigdev.biwengerapi.model;

import com.tonigdev.biwengerapi.model.message.AuthorDto;

import lombok.Data;

/**
 * Informacion basica sobre un mensaje del tablon.
 */
@Data
public class MessageDto {
	// Tipo de mensaje
	private String type;
	// Fecha del mensaje
	private int date;
	// Autor del mensaje
	private AuthorDto author;

}
