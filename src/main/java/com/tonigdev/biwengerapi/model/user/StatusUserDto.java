package com.tonigdev.biwengerapi.model.user;

import lombok.Data;

/**
 * Infomracion resumida sobre el estado de las actividades de un usuario en el
 * mercado
 */
@Data
public class StatusUserDto {
	// Numero de ofertas activas
	private Integer offers;
	// Numero de pujas activas
	private Integer bids;

}
