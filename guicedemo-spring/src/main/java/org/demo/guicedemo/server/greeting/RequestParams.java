package org.demo.guicedemo.server.greeting;

import com.google.inject.servlet.RequestScoped;

@RequestScoped
public class RequestParams {

	private String greetingName;

	public String getGreetingName() {
		return greetingName;
	}

	public void setGreetingName(String greetingName) {
		this.greetingName = greetingName;
	}
}
