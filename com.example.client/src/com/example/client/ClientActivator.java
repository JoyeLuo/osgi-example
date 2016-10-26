package com.example.client;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.example.api.Greeting;

public class ClientActivator implements BundleActivator {
	@Override
	public void start(BundleContext context) throws Exception {

		final ServiceReference<Greeting> sr = context.getServiceReference(Greeting.class);
		final Greeting m = context.getService(sr);
		System.out.println(m.sayHello("from activator"));
	}

	@Override
	public void stop(BundleContext context) throws Exception {

	}

}
