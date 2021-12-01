package com.infy.SIMActivation.DTO;

public class ErrorMessage {
	private int ErrorCode;
	private String message;
	public int getErrorCode() {
		return ErrorCode;
	}
	public void setErrorCode(int errorCode) {
		ErrorCode = errorCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "ErrorMessage [ErrorCode=" + ErrorCode + ", message=" + message + "]";
	}
	
}
