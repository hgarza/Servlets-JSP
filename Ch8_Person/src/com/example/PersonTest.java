package com.example;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class PersonTest extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException {
		String name = request.getParameter("username");
		//request.setAttribute("name", name);
		
		Person p = new Person();
		p.setName(name);
		request.setAttribute("person", p);
		RequestDispatcher view = request.getRequestDispatcher("personresult.jsp");
		view.forward(request, response);
		
		
	}
}