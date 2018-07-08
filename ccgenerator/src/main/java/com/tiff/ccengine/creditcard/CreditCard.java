package com.tiff.ccengine.creditcard;

import java.util.Date;

public abstract class CreditCard {

	private CardType cardType;
	private String cardNumber;
	private Date expiryDate = new Date();
	
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public CreditCard (CardType cardType, String cardNumber) {
		this.cardNumber = cardNumber;
		this.cardType = cardType;
	}
	public CardType getCardType() {
		return cardType;
	}
	public void setCardType(CardType cardType) {
		this.cardType = cardType;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public abstract boolean isValidCard();
}
