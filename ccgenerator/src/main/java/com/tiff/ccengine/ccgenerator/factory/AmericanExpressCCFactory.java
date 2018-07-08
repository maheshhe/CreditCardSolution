package com.tiff.ccengine.ccgenerator.factory;

import com.tiff.ccengine.ccgenerator.util.NumberGenerationUtil;
import com.tiff.ccengine.creditcard.AmericanExpress;

public class AmericanExpressCCFactory {

	private static String ccNumberStart = "37";

	public AmericanExpress getInstance() {
		return new AmericanExpress(ccNumberStart.concat(NumberGenerationUtil.generateRandomDigitString(14)));
	}
}
