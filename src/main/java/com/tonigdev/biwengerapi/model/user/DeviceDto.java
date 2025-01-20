package com.tonigdev.biwengerapi.model.user;

import lombok.Data;

/**
 * Informacion sobre los dispositivos asociados a una cuenta.
 */
@Data
public class DeviceDto {
	
    // Tipo de dispositivo
    private String type;
    // Token del dispositivo
    private String token;
    // Fecha de la última vez que se utilizo la cuenta en este dispositivo
    private int updated;

}
