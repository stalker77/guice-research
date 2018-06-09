/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.guice.infrastructure.presentation;

import com.google.inject.*;
import ru.dobrokvashinevgeny.research.guice.infrastructure.Application;
import ru.dobrokvashinevgeny.research.guice.infrastructure.services.GuiceConfigModule;

/**
 * Класс MainEntryPoint
 */
public class MainEntryPoint {
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new GuiceConfigModule());

		Application application = injector.getInstance(Application.class);
		application.run();
	}
}