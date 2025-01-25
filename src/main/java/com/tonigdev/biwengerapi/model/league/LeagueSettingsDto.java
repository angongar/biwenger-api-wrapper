package com.tonigdev.biwengerapi.model.league;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.tonigdev.biwengerapi.json.deserializer.BooleanFromStringDeserializer;

import lombok.Data;

/*
 * Configuracion de la liga.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL) // Esto es util para la serializacion, para no incluir valores nulos
public class LeagueSettingsDto {

	// Codigo secreto de la liga
	private String secret;
	// Privacidad de la liga
	private String privacy;
	// Solo los administradores pueden publicar
	private boolean onlyAdminPosts;
	// Clausula de la liga
	private String clause;
	// Incremento de la clausula
	private int clauseIncrement;
	// Ventas inmediatas
	private int immediateSales;
	// Visibilidad del balance
	private String balance;
	// Ofertas del usuario activas
	private String userOffers;
	// Cesiones permitidas
	private String loans;
	// Minimo de jornadas de cesiones
	private int loansMinRounds;
	// Maximo de jornadas de cesiones
	private int loansMaxRounds;
	// Precio maximo de compra
	private int maxPurchasePrice;
	// Retos permitidos
	private boolean challengesAllow;
	// Rondas retrasadas
	private String roundDelayed;
	// Mostrar pujas en el mercado
	private boolean marketShowBids;
	// Permitir multiposicion
	private boolean lineupMultiPos;
	// Permitir alineacion extra
	private boolean lineupAllowExtra;
	// Cambios de alineacion por jornada
	private int lineupRoundChanges;
	// Cambios de alineacion con la jornada empezada
	private String lineupRoundChangesIn;
	// Alinear entrenador
	private boolean lineupCoach;
	// Alinear capitan
	private boolean lineupCaptain;
	// Alinear ariete
	private boolean lineupStriker;
	// Alinear reservas
	private boolean lineupReserves;
	// Permitir favoritos
	private boolean favoritesAllow;
	// Permitir subastas
	private boolean auctions;
	// Puntuacion personalizada
	@JsonDeserialize(using = BooleanFromStringDeserializer.class)
	private Boolean customScore;
}
