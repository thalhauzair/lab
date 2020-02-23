package com.ig.eis.myexception;

public class InvalidAgeException extends RuntimeException {

	String message;

	public InvalidAgeException() {
		message = "";
	}

	public InvalidAgeException(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "[" + this.getClass().getName() + ":" + message + "]";
	}

	public String getMessage() {
		return super.getMessage();
	}
}
