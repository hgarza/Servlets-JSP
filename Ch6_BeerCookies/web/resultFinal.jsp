<%@ page import="java.util.*, javax.servlet.http.HttpSession" %>
<html>
	<body>
		<h1 align="center">Beer Recommendations</h1>
		<p>
			<%
				HttpSession session = request.getSession();
				String = (String)session.getAttribute("advice");
					out.print("<br>try: " + it.next());
				
			%>
		</p>
	</body>
</html>