package com.tiff.ccengine.ccgenerator.services;

import java.util.List;

import com.tiff.ccengine.creditcard.CreditCard;

public interface CCValidatorService {
	
	public <T extends CreditCard> List<T> validateAndGenerateExpiry(List<T> creditCardList) throws CreditCardValidationException;

}
