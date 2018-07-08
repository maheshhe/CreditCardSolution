package com.tiff.ccengine.creditcard;

public class Visa extends CreditCard {
	
	public Visa( String cardNumber) {
		super(CardType.MASTERCARD, cardNumber);
	}

	@Override
	public String toString() {
		return "Visa Card with number: " + this.getCardNumber();
	}

	@Override
	public boolean isValidCard() {
		
		return this.getCardNumber().startsWith("4");
	}

}
