package com.tonigdev.biwengerapi.model.league.content;

import lombok.Data;

/*
 * Paquete de mejora de la liga.
 */
@Data
public class LeagueUpgradeContentDto {

	// Identificador de la mejora
	private String id;
	// Precio de la mejora
	private long price;
	// Moneda
	private String currency;
	// Identificador de google
	private String google;
	// Identificador de huawei
	private String huawei;
	// Identificador de apple
	private String apple;
}
