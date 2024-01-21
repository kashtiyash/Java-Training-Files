package com.custom_exception;

public class AgeOutOfRangeException extends Exception {

	public AgeOutOfRangeException() {
		super();		
	}
	public AgeOutOfRangeException(String str) {
		super(str);
	}
}
