package com.tiff.ccengine.ccgenerator.services.impl;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.tiff.ccengine.ccgenerator.services.CreditCardValidationException;
import com.tiff.ccengine.creditcard.CardType;
import com.tiff.ccengine.creditcard.CreditCard;

public class CCValidatorServiceImplTest {
	
	CCValidatorServiceImpl target = null;
	List<CreditCard> creditCardList = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		target = new CCValidatorServiceImpl();
		CCGeneratorServiceImpl ccGeneratorServiceImpl = new CCGeneratorServiceImpl();
		creditCardList = ccGeneratorServiceImpl.generateCreditCard(CardType.AMERICAN, 10);
	}

	@Test()
	public void testValidateAndGenerateExpiry() throws CreditCardValidationException {
		
		assertNotNull(target.validateAndGenerateExpiry(creditCardList));
	}
	@Test(expected = CreditCardValidationException.class)
	public void testNullList() throws CreditCardValidationException {
		
		assertNotNull(target.validateAndGenerateExpiry(null));
	}
	

}
