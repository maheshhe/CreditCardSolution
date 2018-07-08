package com.tiff.ccengine.ccgenerator.util;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

import com.tiff.ccengine.creditcard.CreditCard;

public class Validator<T extends CreditCard> {

	final List<T> cardList;

	public Validator(List<T> cardList) {
		this.cardList = cardList;
	}

	public Callable<List<T>> getvalidator() {

		return () -> cardList.stream().filter(T::isValidCard).collect(Collectors.toList());

	}

}
