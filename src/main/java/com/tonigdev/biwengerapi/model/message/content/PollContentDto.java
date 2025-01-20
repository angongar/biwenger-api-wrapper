package com.tonigdev.biwengerapi.model.message.content;

import lombok.Data;

/**
 * Informacion relacionada con una encuesta.
 */
@Data
public class PollContentDto {
	// Detalles de la encuesta
	private PollDto poll;

}