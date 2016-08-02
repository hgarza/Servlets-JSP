<html><body>
/* Hello
<%= request.getAttribute("name") %> */

<% Person p = (Person) request.getAttribute("person"); %>
Person is: <%= p.getName() %>
<br></br>
scripting / using expression
<br></br>
Person is:
<%= ((Person) request.getAttribute("person")).getName() %>
<br></br>

without scripting / standard actions
<br></br>
<jsp:useBean id="person" class="Person" scope="request" />
Person created by servlet: <jsp:getProperty name="person" property="name" />
</body></html>