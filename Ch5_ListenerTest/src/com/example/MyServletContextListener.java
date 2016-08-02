package com.example;
import javax.servlet.*;

//1. Implement javax.servlet.ServletContextListener.
public class MyServletContextListener implements ServletContextListener {
	public void contextInitialized(ServletContextEvent event) {
		//2. Ask the event for the ServletContext.
		ServletContext sc = event.getServletContext();
		//3. Use the context to get the init parameter.
		String dogBreed = sc.getInitParameter("breed");
		//4. Make the dog object.
		Dog d = new Dog(dogBreed);
		//5. Use the context to set an attribute (a name/object pair) that is the Dog. Now other parts of the app will be able to get
		//the value of the attribute (the Dog).
		sc.setAttribute("dog", d);
	}
	public void contextDestroyed(ServletContextEvent event) {
		// nothing to do here
		/**
		* We don’t need anything here. The Dog
		* doesn’t need to be cleaned up... when the
		* context goes away, it means the whole
		* app is going down, including the Dog.
		**/
	}
}