package com.tonigdev.biwengerapi.model.message;

import com.tonigdev.biwengerapi.model.MessageDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Informacion sobre mensajes del tablon del tipo texto.
 */
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class TextMessageDto extends MessageDto{

	// Titulo del mensaje
	private String title;
	// Contenido del mensaje de texto
	private String content;
}
