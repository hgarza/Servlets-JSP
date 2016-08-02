package com.example;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.*;
import java.io.*;

public class SimpleTagTest1 extends SimpleTagSupport {
	public void doTag() throws JspException, IOException {
		getJspContext().getOut().print("This is the lamest use of a custom tag");
	}
}