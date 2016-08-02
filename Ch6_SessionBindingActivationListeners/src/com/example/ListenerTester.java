package com.example;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ListenerTester extends HttpServlet {
	public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Test session attributes<br>"); 
		out.println("<br>");
		
		Dog dog = new Dog("Chihuahua");
		HttpSession session = request.getSession();
		session.setAttribute("dog", dog);
		Dog dog2 = (Dog) session.getAttribute("dog");
		out.println("Getting the dog "+ dog2.getBreed());
	}
}