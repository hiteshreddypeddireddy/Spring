package com.vidvaan.exception;

public class StudentNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StudentNotFoundException() {
		super();
	}

	public StudentNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		System.out.println(message + ", " + cause + ", " + enableSuppression + ", " + writableStackTrace);
	}

	public StudentNotFoundException(String message, Throwable cause) {
		super(message, cause);
		System.out.println(message + ", " + cause);
	}

	public StudentNotFoundException(String message) {
		super(message);
		System.out.println(message);
	}

	public StudentNotFoundException(Throwable cause) {
		super(cause);
		System.out.println(cause);
	}

}
