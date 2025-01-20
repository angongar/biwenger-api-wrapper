package com.tonigdev.biwengerapi.model.message.content;

import java.util.List;

import lombok.Data;

/**
 * Representa las preguntas de una encuesta
 */
@Data
public class QuestionPollDto {
	// Titulo de la pregunta
	private String title;
	// Lista de opciones disponibles
	private List<ChoiceDto> choices;

}