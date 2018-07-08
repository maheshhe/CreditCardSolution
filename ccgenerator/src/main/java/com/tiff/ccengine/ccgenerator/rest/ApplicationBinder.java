package com.tiff.ccengine.ccgenerator.rest;

import org.glassfish.hk2.utilities.binding.AbstractBinder;

import com.tiff.ccengine.ccgenerator.services.CCGeneratorService;
import com.tiff.ccengine.ccgenerator.services.CCValidatorService;
import com.tiff.ccengine.ccgenerator.services.impl.CCGeneratorServiceImpl;
import com.tiff.ccengine.ccgenerator.services.impl.CCValidatorServiceImpl;
import com.tiff.ccengine.ccgenerator.util.CCValidatorEngine;

public class ApplicationBinder extends AbstractBinder {

	@Override
	protected void configure() {
		bind(CCGeneratorServiceImpl.class).to(CCGeneratorService.class);
		bind(CCManagementImpl.class).to(CCManagement.class);
		bind(CCValidatorServiceImpl.class).to(CCValidatorService.class);
		bind(CCValidatorEngine.class).to(CCValidatorEngine.class);
	}

}
