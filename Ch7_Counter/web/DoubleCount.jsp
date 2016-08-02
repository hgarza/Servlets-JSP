<html>
<body>
<%! int doubleCount() {
count = count*2;
return count;
}
%>
<%! int count=1; %>
The page count is now:
<%= doubleCount() %>
</body>
</html>