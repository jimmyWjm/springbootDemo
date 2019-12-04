package com.example.demo.exception;

public class NotFoundException extends GlobalException
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotFoundException(String message, int code)
    {
        super(message, code);
    }
}
