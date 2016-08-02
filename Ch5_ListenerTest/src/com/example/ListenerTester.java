package com.example;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ListenerTester extends HttpServlet {
	public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Test context attributes set by listener<br>"); 
		out.println("<br>");
		//Now we get the Dog from the ServletContext. If the listener worked, the Dog will be there BEFORE this service method is called for the first time.
		//getAttribute() returns type Object! You need to cast the return!
		Dog dog = (Dog) getServletContext().getAttribute("dog");
		//If things didn’t work, this is where we’ll find out, we’ll get a big fat NullPointerException if we try to call getBreed() and there’s no Dog.
		out.println("Dog's breed is: " + dog.getBreed());
	}
}