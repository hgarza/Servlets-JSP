package com.example;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class SessionTest extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException { 
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(); //sessionCreated() is executed
		
		session.setAttribute("number", "one"); //attributeAdded() is executed
		session.setAttribute("number", "two"); //attributeReplaced() is executed
		session.removeAttribute("number");
		out.println("Test session attribute:<br>"); //attributeRemoved() is executed
		
		session.invalidate();  //sessionDestroyed() is executed
	}
}