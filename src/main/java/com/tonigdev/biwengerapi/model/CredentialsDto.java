package com.tonigdev.biwengerapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Informacion sobre las credenciales de un usuario.
 */
@Data @AllArgsConstructor
public class CredentialsDto {

	// Email
	private String email;
	// Password
	private String password;

}
