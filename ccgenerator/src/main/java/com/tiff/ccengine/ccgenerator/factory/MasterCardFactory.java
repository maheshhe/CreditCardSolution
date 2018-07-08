package com.tiff.ccengine.ccgenerator.factory;

import com.tiff.ccengine.ccgenerator.util.NumberGenerationUtil;
import com.tiff.ccengine.creditcard.MasterCard;

public class MasterCardFactory {
	private static String ccNumberStart = "5";
	
	public MasterCard getInstance() {
		return new MasterCard(ccNumberStart.concat(NumberGenerationUtil.generateRandomDigitString(15)));
	}
}
