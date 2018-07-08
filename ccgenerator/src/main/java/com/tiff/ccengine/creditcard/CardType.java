package com.tiff.ccengine.creditcard;

public enum CardType {
	
	AMERICAN ("Amex"),
	VISA("Visa"),
	MASTERCARD("Mastercard"),
	DISCOVERCARD("Discover");
	
	private String cardName;
	
	private CardType(String cardName){
		this.cardName = cardName;
	}
	
	public String getCardTypeName() {
		return this.cardName;
	}
	
	public static CardType getCardType(String cardTypeName) {
		for(CardType cardType: CardType.values()) {
			if(cardTypeName.equalsIgnoreCase(cardType.getCardTypeName())){
				return cardType;
			}
		}
		return null;
	}
}
