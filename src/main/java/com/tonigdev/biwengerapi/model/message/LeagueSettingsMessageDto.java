package com.tonigdev.biwengerapi.model.message;

import com.tonigdev.biwengerapi.model.MessageDto;
import com.tonigdev.biwengerapi.model.message.content.LeagueSettingsContentDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Informacion sobre los mensajes de configurtacion especificos de una liga.
 */
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class LeagueSettingsMessageDto extends MessageDto {
	// Informacion sobre el contenido del mensaje de configuracion.
	private LeagueSettingsContentDto content;
}