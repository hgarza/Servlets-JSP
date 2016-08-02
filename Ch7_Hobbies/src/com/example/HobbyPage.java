package com.example;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;

public class HobbyPage extends HttpServlet {
	public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		ArrayList<String> nameList=new ArrayList<String>();
		nameList.add("Melchor");
		nameList.add("Gazpar");
		nameList.add("Baltazar");
		request.setAttribute("names", nameList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("YourHobby.jsp");
		dispatcher.forward(request, response);
		
	}

}