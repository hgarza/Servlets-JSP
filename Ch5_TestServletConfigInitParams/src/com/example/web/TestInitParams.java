package com.example.web;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class TestInitParams extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException { 
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("test init parameters<br>");
		
		java.util.Enumeration e = getServletConfig().getInitParameterNames();
		while(e.hasMoreElements()) {
			out.println("<br>param name = " + e.nextElement() + "<br>");
		} 
		out.println("main email is " + getServletConfig().getInitParameter("mainEmail"));
		out.println("<br>");
		out.println("admin email is " + getServletConfig().getInitParameter("adminEmail")); 
	} 
}
