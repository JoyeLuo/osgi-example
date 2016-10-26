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

package com.example.impls.command;

import org.apache.felix.service.command.CommandProcessor;

import com.example.api.Greeting;

import aQute.bnd.annotation.component.Component;
import aQute.bnd.annotation.component.Reference;

/**
 * @author Joye Luo
 */
@Component(properties={
	CommandProcessor.COMMAND_SCOPE+":String=example",
	CommandProcessor.COMMAND_FUNCTION+":String=greet"
},
provide=Object.class)
public class Command {
private Greeting greeting;

public void greet(String name){
	System.out.println("return:"+greeting.sayHello(name));
}

@Reference
public void setUserService(Greeting greeeting){
	this.greeting = greeeting;
}

}
