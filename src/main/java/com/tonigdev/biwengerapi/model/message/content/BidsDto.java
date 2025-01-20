package com.tonigdev.biwengerapi.model.message.content;

import com.tonigdev.biwengerapi.model.message.AuthorDto;

import lombok.Data;
/**
 * Informacion sobre las ofertas por los jugadores realizadas por los usuarios.
 */
@Data
public class BidsDto {
	// Usuario que realiza la oferta
	private AuthorDto user;
	// Cantidad ofertada
	private int amount;

}