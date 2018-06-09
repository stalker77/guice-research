/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.weld.infrastructure;

import ru.dobrokvashinevgeny.research.weld.infrastructure.configuration.ConfigurationPropertyWithName;
import ru.dobrokvashinevgeny.research.weld.infrastructure.services.InfrastructureService;

import javax.enterprise.context.*;
import javax.inject.Inject;
import java.io.*;

/**
 * Класс Application
 */
@SessionScoped
public class Application implements Serializable {
	@Inject @ConfigurationPropertyWithName(propertyName = "stringConfigValue")
	private String stringConfigValue;

	@Inject
	private InfrastructureService infrastructureService;

	public void run(PrintWriter printWriter) {
		infrastructureService.run(printWriter);
		printWriter.println(stringConfigValue);
	}
}