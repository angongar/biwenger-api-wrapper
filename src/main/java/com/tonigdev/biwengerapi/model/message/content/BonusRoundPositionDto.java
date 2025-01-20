package com.tonigdev.biwengerapi.model.message.content;

import lombok.Data;

/**
 * Informacion sobre los bonus que obtienen los usuarios cada ronda o jornada.
 */
@Data
public class BonusRoundPositionDto {
	// Posicion en la que quedo el usuario en la jornada o ronda.
	private int position;
	// Bonus que recibe.
	private int bonus;

}
