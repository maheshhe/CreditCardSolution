package com.tiff.ccengine.ccgenerator.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

import com.tiff.ccengine.ccgenerator.services.CreditCardValidationException;
import com.tiff.ccengine.creditcard.CardType;
import com.tiff.ccengine.creditcard.CreditCard;

public class CCValidatorEngine {
	private static Map<CardType, ExecutorService> serviceMap = new HashMap<>();

	static {
		serviceMap.put(CardType.AMERICAN, Executors.newSingleThreadExecutor());
		serviceMap.put(CardType.VISA, Executors.newSingleThreadExecutor());
		serviceMap.put(CardType.DISCOVERCARD, Executors.newSingleThreadExecutor());
		serviceMap.put(CardType.MASTERCARD, Executors.newSingleThreadExecutor());
	}

	public static ExecutorService getExecutorService(CardType cardType) {
		return serviceMap.get(cardType);
	}

	public static <T extends CreditCard> List<T> validate(List<T> cardList) throws CreditCardValidationException {
		
		if(cardList != null && !cardList.isEmpty()) {
		ExecutorService service = getExecutorService(cardList.get(0).getCardType());

		Callable<List<T>> validator = () -> cardList.stream().filter(T::isValidCard).collect(Collectors.toList());
			try {
				return service.submit(validator).get();
			} catch (InterruptedException | ExecutionException e) {
				throw new CreditCardValidationException();
			}
		}else {
			throw new CreditCardValidationException("Empty Credit card list");
		}
	}
}
