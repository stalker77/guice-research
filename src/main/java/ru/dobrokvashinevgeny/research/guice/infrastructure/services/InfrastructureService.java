/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.guice.infrastructure.services;

import com.google.inject.Inject;
import ru.dobrokvashinevgeny.research.guice.infrastructure.configuration.ApplicationConfiguration;

/**
 * Класс InfrastructureService
 */
public class InfrastructureService {
	@Inject
	private ApplicationConfiguration applicationConfiguration;

	public void run() {
		System.out.println(applicationConfiguration.getStringConfigValue());
	}
}