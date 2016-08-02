package com.example;
import javax.servlet.http.*;
import java.io.*;

public class Dog implements HttpSessionBindingListener, HttpSessionActivationListener,Serializable {
	private String breed;
	
	public Dog(){
	}
	
	public Dog(String breed){
		this.breed = breed;
	}
	
	// imagine more instance variables, including
	// some that are not Serializable
	// imagine constructor and other getter/setter methods
	public void setBreed(String breed){
		this.breed = breed;
	}
	
	public String getBreed(){
		return breed;
	}
	
	public void valueBound(HttpSessionBindingEvent event) {
		// code to run now that I know I’m in a session
		System.out.println("I'm in session");
	}

	public void valueUnbound(HttpSessionBindingEvent event) {
		// code to run now that I know I am no longer part of a session
		System.out.println("I'm out of the session");
	}

	public void sessionWillPassivate(HttpSessionEvent event) {
		// code to get my non-Serializable fields in a state
		// that can survive the move to a new VM
	}

	public void sessionDidActivate(HttpSessionEvent event) {
		// code to restore my fields... to redo whatever I undid
		// in sessionWillPassivate()
	}
}