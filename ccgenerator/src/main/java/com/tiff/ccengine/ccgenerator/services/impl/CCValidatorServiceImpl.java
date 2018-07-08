package com.tiff.ccengine.ccgenerator.services.impl;

import java.util.Date;
import java.util.List;

import com.tiff.ccengine.ccgenerator.services.CCValidatorService;
import com.tiff.ccengine.ccgenerator.services.CreditCardValidationException;
import com.tiff.ccengine.ccgenerator.util.CCValidatorEngine;
import com.tiff.ccengine.creditcard.CreditCard;

public class CCValidatorServiceImpl implements CCValidatorService {

	CCValidatorEngine ccValidatorEngine;
	
	@Override
	public <T extends CreditCard> List<T> validateAndGenerateExpiry(List<T> creditCardList) throws CreditCardValidationException {
		
		List<T> newCardList = CCValidatorEngine.validate(creditCardList);
		for(T creditCard: newCardList) {
			creditCard.setExpiryDate(new Date());
		}
		return newCardList;
	}
}
