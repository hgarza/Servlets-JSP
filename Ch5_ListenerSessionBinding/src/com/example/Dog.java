package com.example;

import javax.servlet.http.*;

public class Dog implements HttpSessionBindingListener {
	private String breed;
	public Dog(String breed) {
		this.breed = breed;
	}
	public String getBreed() {
		return breed;
	}
	
	public void valueBound(HttpSessionBindingEvent event) {
		// code to run now that I know I’m in a session
		System.out.println("I've been added");
	}
	public void valueUnbound(HttpSessionBindingEvent event) {
		// code to run now that I know I am no longer part of a session
	}

}