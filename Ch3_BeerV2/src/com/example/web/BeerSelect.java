package com.example.web;
import com.example.model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
//Example with two params.
public class BeerSelect extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String param1 = request.getParameter("color");
		String param2 = request.getParameter("body");
		BeerExpert be = new BeerExpert();
		List result = be.getBrands(param1, param2);
		
		//response.setContentType("text/html");
		//PrintWriter out = response.getWriter();
		//out.println("Beer Selection Advice<br>");
		//Iterator it = result.iterator();
		//while(it.hasNext()) {
		//out.print("<br>try: " + it.next());
		
		//The request object lets you set attributes (name/value pair, where the value can be any object) that any other servlet 
		//or JSP that gets the request can use. That means any servlet or JSP to which the request is forwarded using a RequestDispatcher.
		request.setAttribute("styles", result);
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		//Use the request dispatcher to ask the Container to crank up the JSP, sending it the request and response.
		view.forward(request, response);
		
	}
}