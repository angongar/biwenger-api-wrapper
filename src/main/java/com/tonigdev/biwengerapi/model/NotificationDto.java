package com.tonigdev.biwengerapi.model;

import lombok.Data;

/**
 * Informacion sobre las notificaciones de la cuenta de usuario.
 */
@Data
public class NotificationDto {

	// Tipo de notificacion
	private String type;
	// Titulo de la notificacion
	private String title;
	// Campaña asociada a la notificacion
	private String campaign;
	// Imagen de portada de la notificacion
	private String coverImg;
	// Identificador unico de la notificacion
	private int id;
	// Cuerpo de la notificacion
	private String body;
	// Fecha de la notificacion
	private int date;

}
