package com.example;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class CookieTest extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException {
		response.setContentType("text/html");
		String name = request.getParameter("username");
		Cookie cookie = new Cookie("username", name);
		cookie.setMaxAge(30*60);
		response.addCookie(cookie);
		RequestDispatcher view = request.getRequestDispatcher("cookieresult.jsp");
		view.forward(request, response);
	}
}