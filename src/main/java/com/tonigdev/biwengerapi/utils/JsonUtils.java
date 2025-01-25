package com.tonigdev.biwengerapi.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

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
	/**
	 * Convierte el json recibido en el tipo de objeto que se le pasa
	 * @param <T>
	 * @param json
	 * @param type
	 * @return Devuelve el objeto.
	 */

	public static <T> T convertToObject(String json, Class<T> type) {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			return objectMapper.readValue(json, type);
		} catch (JsonProcessingException e) {
			System.out.println("Se ha producido un error convirtiendo el Json en el objeto: " + e.getMessage());
			return null;
		}
	}
	
	public static <T> T convertResponseToObject(String json, JavaType type) {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			return objectMapper.readValue(json, type);
		} catch (JsonProcessingException e) {
			System.out.println("Se ha producido un error convirtiendo el Json en el objeto: " + e.getMessage());
			return null;
		}
	}
	
	
    public static JavaType getParametricType(Class<?> rawType, Class<?>... parameterTypes) {
        return TypeFactory.defaultInstance().constructParametricType(rawType, parameterTypes);
    }

}
