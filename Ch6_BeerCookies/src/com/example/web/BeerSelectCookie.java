package com.example.web;
import com.example.model.BeerAdvice;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class BeerSelectCookie extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		//The cookie
		HttpSession session = request.getSession(false);
		String color="";
		color = request.getParameter("color");
		String body = "";
		String size = "";
		PrintWriter out = response.getWriter();
		if(session == null){
			//Get the first value: color.
			RequestDispatcher rd = request.getRequestDispatcher("result1.jsp");
			rd.forward(request, response);
			out.println(request.getParameter("color"));
			 
		} else {	
			if(request.getParameter("body") != null && request.getParameter("sizes") == null) {
				body = request.getParameter("body");
				out.println(request.getParameter("body"));
				RequestDispatcher rd = request.getRequestDispatcher("result2.jsp");
				rd.forward(request, response);
			} else if(request.getParameter("sizes") != null) {
				//Make BeerSelection object
				size = request.getParameter("sizes");
				//BeerAdvice ba = new BeerAdvice();
				//List<String> brands = ba.getBrands(color, body, size);
				request.setAttribute("advice", "INDIO!!!");
				RequestDispatcher rd = request.getRequestDispatcher("resultFinal.jsp");
				rd.forward(request, response);
			}
		}
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		//The cookie
		HttpSession session = request.getSession(false);
		String color="";
		color = request.getParameter("color");
		String body = "";
		String size = "";
		if(session == null){
			//Get the first value: color.
			RequestDispatcher rd = request.getRequestDispatcher("result1.jsp");
			rd.forward(request, response);
			 
		} else {	
			if(request.getParameter("body") != null && request.getParameter("sizes") == null) {
				body = request.getParameter("body");
				RequestDispatcher rd = request.getRequestDispatcher("result2.jsp");
				rd.forward(request, response);
			} else if(request.getParameter("sizes") != null) {
				//Make BeerSelection object
				size = request.getParameter("sizes");
				BeerAdvice ba = new BeerAdvice();
				List<String> brands = ba.getBrands(color, body, size);
				request.setAttribute("advice", brands);
				RequestDispatcher rd = request.getRequestDispatcher("resultFinal.jsp");
				rd.forward(request, response);
			}
		}
	}
}