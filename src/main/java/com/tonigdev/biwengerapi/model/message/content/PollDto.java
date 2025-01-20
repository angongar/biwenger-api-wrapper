package com.tonigdev.biwengerapi.model.message.content;

import java.util.List;

import com.tonigdev.biwengerapi.model.message.AuthorDto;

import lombok.Data;

/**
 * Informacion detallada de una encuesta
 */
@Data
public class PollDto {
	// Identificador unico de la encuesta
	private int id;
	// Fecha limite hasta la cual estara la encuesta activa
	private int until;
	// Indica si la encuesta ha expirado
	private boolean expired;
	// Lista de las preguntas de la encuesta
	private List<QuestionPollDto> questions;
	// Indica si esta permitido seleccionar multiples respuestas
	private boolean multiResponse;
	// Privacidad de las respuestas
	private String responsePrivacy;
	// Lista de usuarios que han contestado
	private List<AuthorDto> responses;

}
