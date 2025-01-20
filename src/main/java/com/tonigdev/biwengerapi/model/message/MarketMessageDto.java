package com.tonigdev.biwengerapi.model.message;

import java.util.List;

import com.tonigdev.biwengerapi.model.MessageDto;
import com.tonigdev.biwengerapi.model.message.content.MarketContentDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Informacion sobre los mensajes del mercado.
 */
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class MarketMessageDto extends MessageDto {
	// Lista del contenido del mensaje relacionado con el mercado.
	private List<MarketContentDto> content;

}
