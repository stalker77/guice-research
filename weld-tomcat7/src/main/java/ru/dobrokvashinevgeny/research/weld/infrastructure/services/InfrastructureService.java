/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.weld.infrastructure.services;


import ru.dobrokvashinevgeny.research.weld.infrastructure.configuration.ConfigurationPropertyWithName;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import java.io.*;

/**
 * Класс InfrastructureService
 */
@SessionScoped
public class InfrastructureService implements Serializable {
	@Inject @ConfigurationPropertyWithName(propertyName = "stringConfigValue")
	private String stringConfigValue;

	public void run(PrintWriter printWriter) {
		printWriter.println(stringConfigValue);
	}
}