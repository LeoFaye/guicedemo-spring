package org.demo.guicedemo.server.greeting;

import javax.inject.Inject;

import org.demo.guicedemo.server.persistence.SampleDao;

import com.google.inject.Provider;

public class GreetingMessageProvider implements Provider<String> {

	private final RequestParams requestParams;
	private final SampleDao dao;
	
	@Inject
	public GreetingMessageProvider(RequestParams requestParams,
			SampleDao dao) {
		super();
		this.requestParams = requestParams;
		this.dao = dao;
	}
	
	@Override
	public String get() {
		dao.getPersonData(requestParams.getGreetingName());
		return "Hello " + requestParams.getGreetingName();
	}

}
