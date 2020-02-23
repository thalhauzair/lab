package com.ig.eis.myexception;

public class BlankNameException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	String message;

	public BlankNameException() {
		message = "";
	}

	public BlankNameException(String message) {
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
