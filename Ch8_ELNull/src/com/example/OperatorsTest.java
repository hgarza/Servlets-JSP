package com.example;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class OperatorsTest extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException {
		
		java.util.ArrayList<String> list = new java.util.ArrayList<String>();
		list.add("true");
		list.add("false");
		list.add("2");
		list.add("10");
		request.setAttribute("bar", list);
		RequestDispatcher view = request.getRequestDispatcher("operators.jsp");
		view.forward(request, response);		
	}
}