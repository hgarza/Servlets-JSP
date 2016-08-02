package com.example;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ProtectCAS2 extends HttpServlet {
	public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("test context attributes<br>");
		
			getServletContext().setAttribute("foo", "33");
			getServletContext().setAttribute("bar", "63");
			out.println(getServletContext().getAttribute("foo"));
			out.println(getServletContext().getAttribute("bar"));
		
	}
}