package com.tonigdev.biwengerapi.model.user;

import lombok.Data;

/**
 * Informacion sobre la ubicacion de un dispositivo.
 */
@Data
public class LocationDto {
	
    // País de la ubicacion
    private String country;
    // Región de la ubicacion
    private String region;
    // Ciudad de la ubicacion
    private String city;

}
