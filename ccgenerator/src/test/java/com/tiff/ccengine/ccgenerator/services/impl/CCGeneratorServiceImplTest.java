package com.tiff.ccengine.ccgenerator.services.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.tiff.ccengine.creditcard.CardType;

public class CCGeneratorServiceImplTest {

	CCGeneratorServiceImpl target = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		target = new  CCGeneratorServiceImpl();
	}

	@Test
	public void testGenerateCreditCard() {
		target = new  CCGeneratorServiceImpl();
		//zero number of cards request 
		assertNull(target.generateCreditCard(CardType.VISA, 0));
		
		//-ve number of cards request 
		assertNull(target.generateCreditCard(CardType.VISA, -1));
		
		// Check if requested number of cards generated
		
		assertEquals(10,target.generateCreditCard(CardType.VISA, 10).size());
		assertEquals(10,target.generateCreditCard(CardType.AMERICAN, 10).size());
		assertEquals(10,target.generateCreditCard(CardType.MASTERCARD, 10).size());
		assertEquals(10,target.generateCreditCard(CardType.DISCOVERCARD, 10).size());
	}

}
