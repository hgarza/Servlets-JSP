package com.example;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class SessionTest extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException { 
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(); //sessionCreated() is executed
		BeerSessionCounter bsc = new BeerSessionCounter();
		out.println("Test sessions:<br>");
		out.println(bsc.getActiveSessions());
		session.invalidate();  //sessionDestroyed() is executed
	}
}