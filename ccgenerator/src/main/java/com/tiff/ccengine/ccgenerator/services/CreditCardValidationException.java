package com.tiff.ccengine.ccgenerator.services;

public class CreditCardValidationException extends Exception {
	
	public CreditCardValidationException() {
		super("Credit Card Validation Exception");
	}
	
	public CreditCardValidationException(String msg) {
		super(msg);
	}
}
