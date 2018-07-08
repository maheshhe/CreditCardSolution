package com.tiff.ccengine.ccgenerator.factory;

import com.tiff.ccengine.ccgenerator.util.NumberGenerationUtil;
import com.tiff.ccengine.creditcard.Visa;

public class VisaCardFactory {
	private static String ccNumberStart = "4";
	public Visa getInstance() {
		return new Visa(ccNumberStart.concat(NumberGenerationUtil.generateRandomDigitString(15)));
	}
}
