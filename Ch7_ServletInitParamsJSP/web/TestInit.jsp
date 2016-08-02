<html>
<body>
<h1>Ch7 Init params in a jsp</h1>
<%!
	public void jspInit() {
		ServletConfig sConfig = getServletConfig();
		String emailAddr = sConfig.getInitParameter("email");
		ServletContext ctx = getServletContext();
		ctx.setAttribute("mail", emailAddr);
	}
%>

<%= "Application-scoped attribute: "%>
<%= application.getAttribute("mail") %>
</body>
</html>