package com.example;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.*;
import java.io.*;

public class SimpleTagTest3 extends SimpleTagSupport {
	public void doTag() throws JspException, IOException {
		getJspContext().setAttribute("message", "Wear sunscreen."); 
		getJspBody().invoke(null);
	}
}