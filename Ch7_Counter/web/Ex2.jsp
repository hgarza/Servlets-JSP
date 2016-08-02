<%@ page import="java.util.*" %>
<html><body>
Test scriptlets...
<% ArrayList list = new ArrayList();
list.add(new String("foo"));
%>
<%= list.get(0) %>
</body></html>