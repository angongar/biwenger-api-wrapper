package com.tonigdev.biwengerapi.model.responses;

import lombok.Data;

@Data
public class ApiResponse<T> {
	
	private int status;
	private T data;

}
