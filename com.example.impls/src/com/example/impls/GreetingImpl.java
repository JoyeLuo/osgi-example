package com.example.impls;

import org.osgi.service.component.annotations.*;

import com.example.api.Greeting;

@Component
public class GreetingImpl implements Greeting {
	@Override
	public String sayHello(String name) {
		return "Hello " +name;
	}
}
