package com.example.demo.exception;


public class ParamNotExistException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ParamNotExistException(String message) {
		super(message);
	}
}
