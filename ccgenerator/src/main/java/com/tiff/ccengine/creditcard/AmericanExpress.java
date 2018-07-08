package com.tiff.ccengine.creditcard;

public class AmericanExpress extends CreditCard {
	
	public AmericanExpress( String cardNumber) {
		super(CardType.AMERICAN, cardNumber);
	}

	@Override
	public String toString() {
		return "Amex Card with number: " + this.getCardNumber();
	}
	
	@Override
	public boolean isValidCard() {
		
		return this.getCardNumber().startsWith("37");
	}

}
