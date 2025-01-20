package com.tonigdev.biwengerapi.model.message.content;

import com.tonigdev.biwengerapi.model.message.AuthorDto;

import lombok.Data;

/**
 * Informacion relacionada con una transferencia de un jugador
 */
@Data
public class TransferContentDto {
	// Identificador del jugador
	private int player;
	// Usuario que cede al jugador
	private AuthorDto from;
	// Usuario que adquiere al jugador
	private AuthorDto to;
	// Cantidad por la que se hace la transferencia
	private int amount;
	// Tipo de traspaso
	private String type;

}
