<html><body>
<h1>Ch 8 EL handles Null<h1>
<%-- bar exists but doesn't have any foo property and foo doesn't exists --%>
${foo}
${foo[bar]}
${bar[foo]}
${foo.bar}
${7 + foo}
${7 / foo}
${7 - foo}
${7 % foo}
${7 < foo} 
${7 == foo}
${foo == foo}
${7 != foo}
${true and foo}
${true or foo}
${not foo}
</body></html>