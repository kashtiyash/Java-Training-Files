package com.exception;
import java.io.IOException;
import java.util.InputMismatchException;

import com.custom_exception.AgeOutOfRangeException;

class UserValidation{
	public static void validateUserAge(int age) throws Exception {
		if(age<18) {
//			Generate Exception explicitly -unchecked
			
//			ArrayIndexOutOfBoundsException obj1 = new ArrayIndexOutOfBoundsException();
//			InputMismatchException obj2 = new InputMismatchException();

//			Generate Exception explicitly - checked
//			IOException obj3= new IOException();
//			throw obj1;
//			throw obj2;
//			throw obj3; // throw keyword can not propagate checked exception  for that throws is used at function level
			
			AgeOutOfRangeException obj4 = new AgeOutOfRangeException("Age  must be greater than 18");
			throw obj4;
		}
		else {
			System.out.println("Welcome to Cybage!!");
		}
	}
}

public class ThrowAndThrowsExample {

	public static void main(String[] args) {
		try {
			UserValidation.validateUserAge(2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Rest of the code");
	}

}
