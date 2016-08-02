<%-- JSP comment --%>
<!-- HTML comment -->
<html>
<body>
<br />
<%--Setting a page-scoped attribute --%>
<% Float one = new Float(42.5); %>
<% pageContext.setAttribute("foo", one); %>

<%-- Getting a page-scoped attribute--%>
<%= "Page-scoped attribute: "%>
<%= pageContext.getAttribute("foo") %>
<br />
<%-- Using the pageContext to set a session-scoped attribute --%>
<% Float two = new Float(22.4); %>
<% pageContext.setAttribute("foo", two, PageContext.SESSION_SCOPE); %>

<%-- Using the pageContext to get a session-scoped attribute --%>
<%= "Session-scoped attribute: "%>
<%= pageContext.getAttribute("foo", PageContext.SESSION_SCOPE) %>
<br />
<%-- Which is identical to: --%>
<%= "Session-scoped attribute: "%>
<%= session.getAttribute("foo") %>
<br />

<%-- Using the pageContext to set an application-scoped attribute --%>
<% application.setAttribute("mail", "hola@hola.com"); %>

<%-- Using pageContext to get an application-scoped attribute --%>
<%= "Application-scoped attribute: "%>
<%= pageContext.getAttribute("mail", PageContext.APPLICATION_SCOPE) %>
<br />
<%-- Within a JSP, the code above is identical to: --%>
<%= "Application-scoped attribute: "%>
<%= application.getAttribute("mail") %>
<br />

<%-- Using the pageContext to find an attribute when you don't know the scope --%>
<%-- first request scope, then session, then finally application scope --%>
<%= "Find the value of attribute foo: "%>
<%= pageContext.findAttribute("foo") %>
<br />
</body>
</html>