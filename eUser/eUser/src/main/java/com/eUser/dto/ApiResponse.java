package com.eUser.dto;

public class ApiResponse {

	private int status;
	private Object data;
	private Object error;
	
	public ApiResponse(int status, Object data, Object error) {
		super();
		this.status = status;
		this.data = data;
		this.error = error;
	}
	
	public ApiResponse() {
		super();
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Object getError() {
		return error;
	}

	public void setError(Object error) {
		this.error = error;
	}
	
}
