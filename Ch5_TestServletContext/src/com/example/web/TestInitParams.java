package com.example.web;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class TestInitParams extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException { 
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("test CONTEXT init parameters<br>");
		
		java.util.Enumeration e = getServletConfig().getInitParameterNames();
		while(e.hasMoreElements()) {
			out.println("<br>param name = " + e.nextElement() + "<br>");
		} 
		out.println("main email is " + getServletContext().getInitParameter("mainEmail"));
		out.println("<br>");
		out.println("admin email is " + getServletContext().getInitParameter("adminEmail")); 
	} 
}
