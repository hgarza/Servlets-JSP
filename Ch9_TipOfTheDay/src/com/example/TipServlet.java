package com.example;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class TipServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException { 
		Tip t = new Tip();
		
		request.setAttribute("pageContent", t);
		RequestDispatcher rd = request.getRequestDispatcher("TipByDay.jsp");
		rd.forward(request, response);
	} 
}
