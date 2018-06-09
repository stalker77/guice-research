/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.guice.infrastructure;

import com.google.inject.Inject;
import ru.dobrokvashinevgeny.research.guice.infrastructure.configuration.ApplicationConfiguration;
import ru.dobrokvashinevgeny.research.guice.infrastructure.services.InfrastructureService;

/**
 * Класс Application
 */
public class Application {
	@Inject
	private ApplicationConfiguration applicationConfiguration;

	@Inject
	private InfrastructureService infrastructureService;

	public void run() {
		infrastructureService.run();
		System.out.println(applicationConfiguration.getStringConfigValue());
	}
}