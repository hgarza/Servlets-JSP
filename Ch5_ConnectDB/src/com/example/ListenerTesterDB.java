package com.example;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class ListenerTesterDB extends HttpServlet {
	public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Test Connection to a DB"); 
		out.println("<br>");
		Connection c = null;
		Statement s = null;
		
		try{
			c = (Connection) getServletContext().getAttribute("connectionDB");
			out.println("Opened database successfully!");
			c.setAutoCommit(false);
			s = c.createStatement();
			ResultSet rs = s.executeQuery("SELECT * FROM COMPANY;");
			
			while(rs.next()){
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String address= rs.getString("address");
				float salary= rs.getFloat("salary");
				out.println("ID: "+ id + "\n"
						+ "NAME: "+ name + "\n"
						+ "AGE: "+ age + "\n"
						+ "ADDRESS: "+ address + "\n"
						+ "SALARY: "+ salary);
			}
			
			rs.close();
			s.close();
			c.close();
			
		
		
		}catch(Exception e){
			System.err.println( e.getClass().getName()+": "+ e.getMessage() );
			System.exit(0);
		}
		
	}
}