<html><body>
Welcome to our page! <br />
<% if (request.getParameter("userName") == null) { %>
<jsp:forward page="HandleIt.jsp" />
<% } %>
Hello ${param.userName}
</body></html>