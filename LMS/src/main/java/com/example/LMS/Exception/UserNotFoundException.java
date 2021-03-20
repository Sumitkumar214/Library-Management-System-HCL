package com.example.LMS.Exception;

public class UserNotFoundException extends RuntimeException  {
	
	public UserNotFoundException(String message) {
		super(message);
	}

}
