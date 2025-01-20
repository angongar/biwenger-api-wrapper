package com.tonigdev.biwengerapi.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils {
	
	/**
	 * Convierte en Json cualquier objeto.
	 * @param obj
	 * @return el json del objeto.
	 */
	public static String convertToJson(Object obj) {
		String res = "";
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
			res = objectMapper.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			System.out.println("Se ha producido un error convirtiendo el objeto en Json: " + e.getMessage());
			return null;
		}
		
		return res;
	}

}
