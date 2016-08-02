package com.example;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.*;
import java.io.*;

public class SimpleTagTest4 extends SimpleTagSupport {
	String[] movies = {"Monsoon Wedding", "Saved!", "Fahrenheit 9/11"};
	public void doTag() throws JspException, IOException {
		for(int i = 0; i < movies.length; i++) {
			getJspContext().setAttribute("movie", movies[i]); getJspBody().invoke(null);
		}
	}
}