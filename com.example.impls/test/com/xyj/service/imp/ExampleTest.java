package com.xyj.service.imp;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.impls.GreetingImpl;

public class ExampleTest {

	@Test
	public void test() {
		String result = new GreetingImpl().sayHello("Bob");
		assertEquals("Hello Bob", result);
	}

}
