<%@ page import="javax.servlet.http.HttpSession"%>
<html>
<head></head>
<body>
<h1>Beer Selection Page</h1>
<h2>You've selected <% 
HttpSession session = request.getSession();
String color = (String) session.getAttribute("color");
String body = (String) session.getAttribute("body");
outPrint("You have selected beer color: " + color + "<br>"+
		"You have selected beer body: " + body + "<br>");
%></h2>
<h2>Size</h2>
<form method="POST" action="BeerSelectCookie.do">
<select name="sizes" size="1">
<option value="12oz">12oz</option>
<option value="16oz">16oz</option>
<option value="22oz">22oz</option>
</select>
<br>
<center>
<input type="SUBMIT" value="Submit">
</center>
</form>
</body>
</html>