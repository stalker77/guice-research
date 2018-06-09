/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.guice.infrastructure.configuration;

import com.google.inject.*;

/**
 * Класс ApplicationConfiguration
 */
@Singleton
public class ApplicationConfiguration {
	private String stringConfigValue;

	private boolean booleanConfigValue;

	public ApplicationConfiguration() {
		System.out.println("ApplicationConfiguration created");
	}

	@Inject
	public void readConfiguration() {
		System.out.println("readConfiguration()");
		stringConfigValue = String.valueOf(System.nanoTime());
	}

	/**
	 * Возвращает
	 *
	 * @return
	 */
	public String getStringConfigValue() {
		return stringConfigValue;
	}

	/**
	 * Возвращает
	 *
	 * @return
	 */
	public boolean isBooleanConfigValue() {
		return booleanConfigValue;
	}
}