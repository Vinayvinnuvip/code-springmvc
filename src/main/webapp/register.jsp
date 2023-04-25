<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="save" modelAttribute="std">
id:<form:input path="id"/>
name:<form:input path="name"/>
age:<form:input path="age"/>
<form:button>register</form:button>
</form:form>

</body>
</html>