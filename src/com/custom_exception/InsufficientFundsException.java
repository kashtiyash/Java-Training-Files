package com.custom_exception;

public class InsufficientFundsException extends Exception{

	public InsufficientFundsException() {
		super();
	}
	public InsufficientFundsException(String str) {
		super(str);
	}
}
