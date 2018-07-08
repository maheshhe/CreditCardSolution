package com.tiff.ccengine.ccgenerator.services.impl;

import java.util.ArrayList;
import java.util.List;

import com.tiff.ccengine.ccgenerator.factory.CreditCardFactory;
import com.tiff.ccengine.ccgenerator.services.CCGeneratorService;
import com.tiff.ccengine.creditcard.CardType;
import com.tiff.ccengine.creditcard.CreditCard;

public class CCGeneratorServiceImpl implements CCGeneratorService {

	@Override
	public List<CreditCard> generateCreditCard(CardType cardType, int numberOfCards) {
		List<CreditCard> creditCardList = null;
		if (validateInput(numberOfCards)) {
			creditCardList = new ArrayList<>();
			for (int i = 0; i < numberOfCards; i++) {
				creditCardList.add(CreditCardFactory.getCreditCard(cardType));
			}
		}
		return creditCardList;
	}

	private boolean validateInput(int numberOfCards) {
		boolean isValid = true;
		if (numberOfCards < 1)
			isValid = false;

		return isValid;
	}

}
