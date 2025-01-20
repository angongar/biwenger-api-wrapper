package com.tonigdev.biwengerapi.model.message;

import java.util.List;

import com.tonigdev.biwengerapi.model.MessageDto;
import com.tonigdev.biwengerapi.model.message.content.PlayerMovementContentDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Informacion sobre mensajes relacionados con movimientos de jugadores.
 */
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class PlayerMovementMessageDto extends MessageDto {
	// Listado de contenido del mensaje relacionado con el movimiento de jugadores.
	private List<PlayerMovementContentDto> content;

}
