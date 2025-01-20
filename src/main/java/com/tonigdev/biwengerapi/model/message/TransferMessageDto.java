package com.tonigdev.biwengerapi.model.message;

import java.util.List;

import com.tonigdev.biwengerapi.model.MessageDto;
import com.tonigdev.biwengerapi.model.message.content.TransferContentDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Informacion de mensajes relacionados con transferencias de jugadores.
 */
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class TransferMessageDto extends MessageDto {
	// Lista de contenido del mensaje relacionado con la transferencia de jugadores.
	private List<TransferContentDto> content;

}
