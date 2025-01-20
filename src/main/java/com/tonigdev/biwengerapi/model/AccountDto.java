package com.tonigdev.biwengerapi.model;

import java.util.List;

import com.tonigdev.biwengerapi.model.user.DeviceDto;

import lombok.Data;

/**
 * Informacion sobre la cuenta.
 */
@Data
public class AccountDto {
	// Identificador de la cuenta
	private int id;
	// Nombre de la cuenta
	private String name;
	// Email asociado a la cuenta
	private String email;
	// Numero de telefono de la cuenta
	private String phone;
	// Idioma de la cuenta
	private String locale;
	// Fecha de nacimiento del usuario de la cuenta
	private int birthday;
	// Estado de la cuenta
	private String status;
	// Creditos disponibles en la cuenta
	private int credits;
	// Fecha de creación de la cuenta
	private int created;
	// Indicador de si la cuenta está suscrita al boletín informativo
	private boolean newsletter;
	// Indicador de si hay mensajes no leidos en la cuenta
	private boolean unreadMessages;
	// Fecha del último acceso a la cuenta
	private int lastAccess;
	// Fuente de creacion de la cuenta
	private String source;
	// Lista de dispositivos asociados a la cuenta
	private List<DeviceDto> devices;

}
