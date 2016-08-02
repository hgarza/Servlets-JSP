package com.example;
import javax.servlet.*;
import java.sql.Connection;
import java.sql.DriverManager;

//1. Implement javax.servlet.ServletContextListener.
public class MyServletContextListenerDB implements ServletContextListener {
	public void contextInitialized(ServletContextEvent event) {
		//2. Ask the event for the ServletContext.
		ServletContext sc = event.getServletContext();
		//3. Use the context to get the init parameter user...
		String user = sc.getInitParameter("user");
		//and the password
		String pwd = sc.getInitParameter("password");
		//4. Make the connection object
		Connection c = null;
		try{
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", user, pwd); 
			
		}catch(Exception e){
			e.printStackTrace();
			System.err.println(e.getClass().getName()+": "+e.getMessage());
			System.exit(0);
		}
		//5. Use the context to set an attribute (a name/object pair) that is the Dog. Now other parts of the app will be able to get
		//the value of the attribute (the Dog).
		sc.setAttribute("connectionDB", c);
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