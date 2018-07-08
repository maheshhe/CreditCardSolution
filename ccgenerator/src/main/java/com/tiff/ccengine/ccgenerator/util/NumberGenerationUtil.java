package com.tiff.ccengine.ccgenerator.util;

import java.util.Random;

public class NumberGenerationUtil {

	public static String generateRandomDigitString(int numOfDigits) {
		StringBuilder numberString = new StringBuilder();
		Random rand = new Random();
		for (int i = 0; i < numOfDigits; i++) {
			// Generate random integers in range 0 to 9
			numberString.append(Integer.toString(rand.nextInt(10)));
		}
		return numberString.toString();
	}

}
