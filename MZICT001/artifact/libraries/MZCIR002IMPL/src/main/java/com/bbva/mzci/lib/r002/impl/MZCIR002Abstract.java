package com.bbva.mzci.lib.r002.impl;

import com.bbva.elara.configuration.manager.application.ApplicationConfigurationService;
import com.bbva.elara.library.AbstractLibrary;
import com.bbva.mzci.lib.r002.MZCIR002;

/**
 * This class automatically defines the libraries and utilities that it will use.
 */
public abstract class MZCIR002Abstract extends AbstractLibrary implements MZCIR002 {

	protected ApplicationConfigurationService applicationConfigurationService;


	/**
	* @param applicationConfigurationService the this.applicationConfigurationService to set
	*/
	public void setApplicationConfigurationService(ApplicationConfigurationService applicationConfigurationService) {
		this.applicationConfigurationService = applicationConfigurationService;
	}

}