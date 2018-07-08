package com.tiff.ccengine.ccgenerator.services;

import java.util.List;

import com.tiff.ccengine.creditcard.CardType;
import com.tiff.ccengine.creditcard.CreditCard;

public interface CCGeneratorService {
	
	public List<CreditCard> generateCreditCard(CardType cardType, int numberOfCards);
}
