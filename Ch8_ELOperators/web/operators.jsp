<html><body>
<h1>Ch 8 Operators<h1>
${num > 3} <br/>
${integer le 12} <br/>
${requestScope["integer"] ne 4 and 6 le num || false} <br/>
${list[0] || list["1"] and true} <br/>
${num > integer} <br/>
${num == integer-1} <br/>
<jsp:useBean class="com.example.Dog" id="myDog" >
<jsp:setProperty name="myDog" property="name" value="${list[1]}" />
</jsp:useBean>
${myDog.name and true} <br/>
${42 div 0} <br/>
</body></html>