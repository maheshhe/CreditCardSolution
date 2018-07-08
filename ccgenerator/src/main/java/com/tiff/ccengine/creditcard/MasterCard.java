package com.tiff.ccengine.creditcard;

public class MasterCard extends CreditCard {
	
	public MasterCard(String cardNumber) {
		super(CardType.MASTERCARD, cardNumber);
	}

	@Override
	public String toString() {
		return "Master Card with number: " + this.getCardNumber();
	}
	
	@Override
	public boolean isValidCard() {
		return this.getCardNumber().startsWith("5");
	}
}
