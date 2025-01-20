package com.tonigdev.biwengerapi.model.message.content;

import java.util.List;

import lombok.Data;

/**
 * Informacion de la configuracion de la liga.
 */
@Data
public class LeagueSettingsContentDto {

	// Ajustes de mercado
	// Hora de cierre del mercado
	private int marketClose;
	// Hora de apertura del mercado
	private int marketOpen;
	// Cantidad de jugadores que aparecen en el mercado
	private int marketSize;
	// Tiempo de vida del mercado
	private int marketTTL;
	// Indica si los jugadores se mantienen en el mercado tras el cierre del mercado
	private boolean marketKeepPlayers;
	// Indica si se muestran las ofertas en el mercado
	private boolean marketShowBids;
	// Numero de ventas inmediatas permitidas
	private int immediateSales;
	// Numero de dias que los jugadores permanecen a la venta
	private int daysForSale;
	// Limite para las ventas automaticas de jugadores
	private int autoSale;
	// Maximo de ventas que puede realizar un usuario en el mercado
	private int marketMaxUserSales;
	// Informacion sobre los sobres del mercado
	private String envelopes;
	// Intervalo entre los sobres
	private String envelopesInterval;
	// Tipos de sobres disponibles en el mercado
	private List<String> envelopesTypes;

	// Ajustes de liga

	// Indica si solo los administradores pueden realizar publicaciones en el tablon
	private boolean onlyAdminPosts;
	// Descripcion de la liga
	private String description;
	// Sistema de puntuacion de la liga
	private int score;

	// Ajustes de participantes
	// Privacidad del la liga
	private String privacy;
	// Informacion sobre el balance de la liga
	private String balance;
	// Numero maximo de participantes en la liga
	private int maxParticipants;
	// Indica si se muestra la fecha de ultimo acceso de los usuarios
	private boolean showLastAccess;
	// Indica si se permiten retos entre los usuarios
	private boolean challengesAllow;
	// La cantidad maxima de jugadores que puede tener un usuario
	private int teamMaxSize;
	// Valor maximo del equipo de los usuarios
	private String teamMaxValue;
	// Indica si se aplica estrictamente el limite del valor del equipo
	private boolean teamMaxValueStrict;
	// Cantidad de nuevos usuarios permitidos
	private int newUsers;
	// Numero de la nueva temporada
	private int newSeason;
	// Tiempo de vida de un usuario inactivo
	private int inactiveUserTTL;

	// Ajustes de alineaciones
	// Retraso de la ronda de la alineacion
	private String roundDelayed;
	// Configuracion sobre si se muestran o no las alineaciones
	private String lineupShow;
	// Valor que de termina si se muestran las alineaciones
	private int lineaupShow;
	// Numero de cambios permitidos
	private int lineupChanges;
	// Numero de cambios permitidos por ronda
	private int lineupRoundChanges;
	// Regla de como se eliminan las alineaciones invalidas
	private String lineupRemoveInvalid;
	// Informacion sobre los cambios que entran en la alineacion
	private String lineupRoundChangesIn;
	// Informacion sobre los cambios que salne en la alineacion
	private String lineupRoundCahangesOut;
	// Indica si esta permitido usar capitan
	private boolean lineupCaptain;
	// Valor maximo permitido para el capitan
	private int lineupCaptainMaxValue;
	// Posiciones permitidas para el capitan
	private List<Integer> lineupCaptainPositions;
	// Indica si esta permitido usar ariete
	private boolean lineupStriker;
	// Valor maximo permitido para el ariete
	private int lineupStrikerMaxValue;
	// Posiciones permitidsa para el ariete
	private List<Integer> lineupStrikerPositions;
	// Indica si se permiten realizar cambios en la alineacion
	private boolean lineupAllowExtra;
	// Indica si se permite usar entrenador
	private boolean lineupCoach;

	// Ajustes de compras y ventas
	// Valor maximo de una oferta
	private String maximumBid;
	// Configuracion de las ofertas de los usuarios
	private String userOffers;
	// Indica si se permiten realizar intercambios entre jugadores
	private boolean exchanges;
	// Informacion sobre las compras de los usuarios
	private String userOfferPurchases;
	// Informacion sobre las ventas de los usuarios
	private String userOfferSales;
	// Indica si las ofertas pueden sobrepasar el valor maximo
	private boolean bidsOverMV;
	// Precio maximo de compra
	private int maxPurchasePrice;
	// Tipo de transferencia del jugador
	private String transfersMode;
	// Cantidad de transferencias permitidas
	private String transfersAmount;
	// Numero de usuarios que han realizado ofertas a mostrar
	private int transfersShowBidders;
	// Informacion sobre las cesiones de jugadores
	private String loans;
	// Numero de jornadas minimas para la cesion
	private int loansMinRounds;
	// Numero de jornadas maximas para la cesion
	private int loansMaxRounds;

	// Ajustes de clausulas
	// Clausula
	private String clause;
	// Rango de clausulas
	private List<ClauseRangeDto> clauseRanges;
	// Numero de horas de inactividad para las clausulas por ronda
	private int clauseRoundDisabledHours;
	// Limite de clausulas realizadas por un usuario
	private String clauseExecutedLimit;
	// Limite de clausulas recibidas por un usuario
	private String clauseReceivedLimit;

	// Ajustes de primas
	// Bonus por puntos
	private int bonusPoint;
	// Bonus fijo
	private int bonusFixed;
	// Bonus por jugador en el XI ideal
	private int bonusIdealLineup;
	// Bonus por alineacion rentable
	private int bonusProfitableLineup;
	// Bonus por MVP de un partido
	private int bonusGameMVP;
	// Bonus por MVP de la jornada
	private int bonusRoundMVP;
	// Informacion sobre la posicion en las jornadas de bonificacion
	private List<BonusRoundPositionDto> bonusRoundPosition;
	// Indica si se permiten bonus negativos
	private boolean bonusAllowNegative;
	// Indica si los bonus se invierten
	private boolean bonusInverse;
	// Ratio de bonus
	private int bonusRatio;
	// Bonus por gol
	private int bonusGoal;
	// Bonus por porteria a cero
	private int bonusCleanSheet;

}
