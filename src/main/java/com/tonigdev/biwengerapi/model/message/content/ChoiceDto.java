package com.tonigdev.biwengerapi.model.message.content;

import lombok.Data;

/*
 * Informacion sobre las opciones disponibles en una encuesta.
 */
@Data
public class ChoiceDto {
	// Nombre de la opcion
	private String title;
	// Votos que ha recibido la opcion por parte de los usuarios.
	private int votes;

}
