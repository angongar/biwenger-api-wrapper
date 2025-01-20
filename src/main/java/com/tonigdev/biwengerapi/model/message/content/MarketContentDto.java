package com.tonigdev.biwengerapi.model.message.content;

import java.util.List;

import com.tonigdev.biwengerapi.model.message.AuthorDto;

import lombok.Data;

/**
 * Informacion referente a contenido del mercado de una liga
 */
@Data
public class MarketContentDto {
	// Identificador unico del jugador
	private int player;
	// Destinatario de la transferencia
	private AuthorDto to;
	// Cantidad ofertada
	private int amount;
	// Lista de ofertas que tiene el jugador
	private List<BidsDto> bids;

}
