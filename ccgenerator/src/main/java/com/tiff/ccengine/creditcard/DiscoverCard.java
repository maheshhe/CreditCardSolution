package com.tiff.ccengine.creditcard;

public class DiscoverCard extends CreditCard {

	public DiscoverCard(String cardNumber) {
		super(CardType.DISCOVERCARD, cardNumber);
	}

	@Override
	public String toString() {
		return "Discover Card with number: " + this.getCardNumber();
	}

	@Override
	public boolean isValidCard() {

		return this.getCardNumber().startsWith("6");
	}
}
