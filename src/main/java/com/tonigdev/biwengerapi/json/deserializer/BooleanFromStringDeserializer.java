package com.tonigdev.biwengerapi.json.deserializer;

import java.io.IOException;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

/**
 * Clase utilizada para convertir valores booleanos al deserializar un JSON
 */
public class BooleanFromStringDeserializer extends JsonDeserializer<Boolean> {
	
	@Override
	public Boolean deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JacksonException {
		// Comprueba que la cadena no esta vacia.
		// - Si la cadena esta vacia devuelve false.
		// - Si la cadena no esta vacia, lo convierte en un valor booleano.
		String value = p.getText().trim();
		if (value.isEmpty()) {
			return false;
		}
		return Boolean.parseBoolean(value);
	}
	
}
