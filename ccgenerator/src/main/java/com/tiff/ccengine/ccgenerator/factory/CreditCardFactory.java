package com.tiff.ccengine.ccgenerator.factory;

import com.tiff.ccengine.creditcard.CardType;
import com.tiff.ccengine.creditcard.CreditCard;

public class CreditCardFactory {

	public static CreditCard getCreditCard(CardType cardType) {
		switch (cardType) {

		case AMERICAN: {
			return new AmericanExpressCCFactory().getInstance();
		}
		case DISCOVERCARD: {
			return new DiscoverCCFactory().getInstance();
		}
		case VISA: {
			return new VisaCardFactory().getInstance();
		}
		case MASTERCARD: {
			return new MasterCardFactory().getInstance();
		}
		default:
			return null;
		}
	}
}
