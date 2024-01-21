package com.custom_exception;

public class IncorrectNationalityException extends Exception {
	public IncorrectNationalityException() {
		super();
	}

	public IncorrectNationalityException(String str) {
		super(str);
	}

}
