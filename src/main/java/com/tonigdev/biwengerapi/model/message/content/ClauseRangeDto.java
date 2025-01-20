package com.tonigdev.biwengerapi.model.message.content;

import lombok.Data;

/**
 * Informacion sobre las clausulas de los jugadores.
 */
@Data
public class ClauseRangeDto {
	// Tipo de clausula
	private String type;
	// Cantidad fijada.
	private int amount;
	// Porcentaje aplicado a la clausula.
	private String proportion;

}
