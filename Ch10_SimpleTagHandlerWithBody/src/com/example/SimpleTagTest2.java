package com.example;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.*;
import java.io.*;

public class SimpleTagTest2 extends SimpleTagSupport {
	public void doTag() throws JspException, IOException {
		getJspBody().invoke(null);
	}
}