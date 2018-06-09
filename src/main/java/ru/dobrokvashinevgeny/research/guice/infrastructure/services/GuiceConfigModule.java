/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.guice.infrastructure.services;

import com.google.inject.AbstractModule;

/**
 * Класс GuiceConfigModule
 */
public class GuiceConfigModule extends AbstractModule {
	@Override
	protected void configure() {
		/*bindListener(Matchers.subclassesOf(ApplicationConfiguration.class), new TypeListener() {
			@Override
			public <I> void hear(TypeLiteral<I> typeLiteral, TypeEncounter<I> typeEncounter) {
				typeEncounter.register(new InjectionListener<I>() {
					@Override
					public void afterInjection(I injectee) {
						ApplicationConfiguration applicationConfiguration = (ApplicationConfiguration) injectee;
						applicationConfiguration.readConfiguration();
					}
				});
			}
		});*/
	}
}