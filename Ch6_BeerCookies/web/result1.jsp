<%@ page import="javax.servlet.http.HttpSession"%>
<html>
<head></head>
<body>
<h1>Beer Selection Page</h1>
<h2>You've selected <% 
HttpSession session = request.getSession();
String color = (String) session.getAttribute("color");
out.Print("You have selected beer color: " + color);
%></h2>
<h2>Body</h2>
<form method="POST" action="BeerSelectCookie.do">
<select name="body" size="1">
<option value="light">light</option>
<option value="medium">medium</option>
<option value="heavy">heavy</option>
</select>
<br>
<center>
<input type="SUBMIT" value="Submit">
</center>
</form>
</body>
</html>