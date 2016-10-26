package com.example.impls.command;

import org.apache.felix.service.command.CommandProcessor;

import com.example.api.Greeting;

import aQute.bnd.annotation.component.Component;
import aQute.bnd.annotation.component.Reference;

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
