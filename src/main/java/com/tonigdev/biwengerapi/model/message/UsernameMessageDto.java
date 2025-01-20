package com.tonigdev.biwengerapi.model.message;

import java.util.List;

import com.tonigdev.biwengerapi.model.MessageDto;
import com.tonigdev.biwengerapi.model.message.content.UsernameContentDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Informacion de los mensajes relacionados con los cambios de nombre de los usuarios.
 */
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class UsernameMessageDto extends MessageDto {
	// Listado de contenido sobre los mensajes relacionados con los cambios de nombre de los usuarios.
	private List<UsernameContentDto> content;

}
