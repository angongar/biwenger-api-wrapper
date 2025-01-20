package com.tonigdev.biwengerapi.model.message;

import com.tonigdev.biwengerapi.model.MessageDto;
import com.tonigdev.biwengerapi.model.message.content.PollContentDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Informacion sobre los mensajes de encuestas.
 */
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class PollMessageDto extends MessageDto {
	// Informacion sobre el contenido de la encuesta.
	private PollContentDto content;

}
