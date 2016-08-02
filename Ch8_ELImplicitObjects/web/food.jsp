<html>
	<body>
		<h1>Ch 8 Person's food taste<h1>
		<%-- REQUEST PARAMETERS IN EL--%>
		Request param name is: ${param.name} <br />
		Request param empID is: ${param.empID} <br />
		Request param food is: ${param.food} <br />
		First food request param: ${paramValues.food[0]} <br />
		Second food request param: ${paramValues.food[1]} <br />
		Request param name: ${paramValues.name[0]} <br />
		
		<%-- Host header--%>
		Host is ([].operator): ${header["host"]} <br />
		Host is (.operator): ${header.host} <br />
		
		<%-- Request Method--%>
		Request method is : ${pageContext.request.method} <br />
		
		<%-- Cookie --%> 
		The cookie: ${cookie.username.value} <br />
		
		<%-- EL initParam for the context params --%>
		The email: ${initParam.mainEmail} 
	</body>
</html>