package com.tonigdev.biwengerapi.model.message;

import java.util.List;

import com.tonigdev.biwengerapi.model.MessageDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Informacion de los mensajes de inscripcion de usuarios.
 */
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class UserJoinMessageDto extends MessageDto{
	//Lista de informacion sobre el contenido del mensaje de inscripcion de usuarios.
	private List<AuthorDto> content;

}
