package org.demo.guicedemo.server.greeting;

import javax.inject.Inject;

import org.demo.guicedemo.MyApplet;

import com.google.inject.servlet.RequestScoped;

@RequestScoped
public class GreetingHandler {

	private final MyApplet applet;
	private final WebDestination destination;
	private final RequestParams params;
	
	@Inject
	public GreetingHandler(
			MyApplet applet, 
			WebDestination destination, 
			RequestParams params) {
		super();
		this.applet = applet;
		this.destination = destination;
		this.params = params;
	}

	public String getByName(String name) {
		params.setGreetingName(name);
		applet.run();
		return destination.getResult();
	}
	
	
}
