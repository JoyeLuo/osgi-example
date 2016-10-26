/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.client;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.example.api.Greeting;

/**
 * @author Joye Luo
 * @author Andy Wu
 */
public class ClientActivator implements BundleActivator {
	@Override
	public void start(BundleContext context) throws Exception {

		final ServiceReference<Greeting> sr = context.getServiceReference(Greeting.class);
		if (sr != null) {
			final Greeting m = context.getService(sr);
			System.out.println(m.sayHello("from client"));
		}
	}

	@Override
	public void stop(BundleContext context) throws Exception {

	}

}
