package com.example;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class PersonTest extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException {
		
		com.example.Person p = new com.example.Person();
		p.setName("Leelu");
		
		com.example.Dog d = new com.example.Dog();
		d.setName("Clyde");
		
		com.example.Toy t1 = new com.example.Toy();
		t1.setName("stick");
		
		com.example.Toy t2 = new com.example.Toy();
		t2.setName("neighbor's cat");
		
		com.example.Toy t3 = new com.example.Toy();
		t3.setName("Barbie doll head");
		
		d.setToys(new com.example.Toy[]{t1, t2, t3});
		
		p.setDog(d);
		
		request.setAttribute("person", p);
		RequestDispatcher view = request.getRequestDispatcher("person.jsp");
		view.forward(request, response);		
	}
}