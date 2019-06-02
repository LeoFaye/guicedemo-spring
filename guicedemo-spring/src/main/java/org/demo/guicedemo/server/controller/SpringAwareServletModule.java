package org.demo.guicedemo.server.controller;

import org.demo.guicedemo.server.persistence.SampleDao;
import org.springframework.context.ApplicationContext;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.servlet.ServletModule;

public class SpringAwareServletModule extends AbstractModule {
	
	private final ApplicationContext context;

	public SpringAwareServletModule(ApplicationContext context) {
		this.context = context;
	}

	@Override
	protected void configure() {
		install(new ServletModule());
	}
	
	@Provides SampleDao getSampleDao() {
		return context.getBean(SampleDao.class);
	}

	

}
