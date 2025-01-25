package com.tonigdev.biwengerapi.utils;

public class HeadersUtils {
	/**
	 * Recibe el token y devuelve la authorization del header del tipo Bearer.
	 * @param token
	 * @return Devuelve la authorization del tipo Bearer.
	 */
	public static String convertToBearerToken(String token) {
		return "Bearer " + token;
	}
}
