/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.weld.infrastructure.configuration;

import javax.annotation.PostConstruct;
import javax.enterprise.context.*;
import javax.enterprise.inject.Produces;

/**
 * Класс ConfigurationPropertyProducer
 */
@ApplicationScoped
public class ConfigurationPropertyProducer {
	private String stringConfigValue;

	private boolean booleanConfigValue;

	@Produces
	@ConfigurationPropertyWithName(propertyName = "stringConfigValue")
	public String getStringConfigValue() {
		return stringConfigValue;
	}

	@Produces
	@ConfigurationPropertyWithName(propertyName = "booleanConfigValue")
	public boolean getBooleanConfigValue() {
		return booleanConfigValue;
	}

	@PostConstruct
	private void loadCurrentApplicationConfiguration() {
		stringConfigValue = String.valueOf(System.nanoTime());

		booleanConfigValue = true;
	}
}