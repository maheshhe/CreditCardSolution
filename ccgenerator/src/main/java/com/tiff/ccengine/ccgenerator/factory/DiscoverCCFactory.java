package com.tiff.ccengine.ccgenerator.factory;

import com.tiff.ccengine.ccgenerator.util.NumberGenerationUtil;
import com.tiff.ccengine.creditcard.DiscoverCard;

public class DiscoverCCFactory {
	private static String ccNumberStart = "6";
	
	public DiscoverCard getInstance() {
		return new DiscoverCard(ccNumberStart.concat(NumberGenerationUtil.generateRandomDigitString(15)));
	}
}
