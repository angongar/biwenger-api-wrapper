package com.tonigdev.biwengerapi.model.message.content;

import lombok.Data;

/**
 * Informacion relacionada con el patrocinador de una liga
 */
@Data
public class SponsorDto {
	// Enlace al sitio web del patrocinador
	private String url;
	// Logo del patrocinador
	private String logo;
	// Ruta del logotipo relacionado con un campo especifico
	private String logoField;

}
