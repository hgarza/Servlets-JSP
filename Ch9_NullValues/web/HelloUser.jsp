<html>
<body>
<%-- EL--%>
<b>Hello ${user}.</b>
<br />

<%-- JSP Expression 
<b>Hello <%= user %>.</b>
<br />
--%>
<%-- JSTL --%>
<b>Hello <c:out value='${user}' default='guest' />.</b>
<br />

<b>Hello <c:out value='${user}'>guest</c:out></b>
</body>
</html>