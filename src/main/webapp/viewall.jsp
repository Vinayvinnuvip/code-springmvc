<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>
<td>Name</td>
<td>Id</td>
<td>Age</td>
<td>Edit</td>
<td>Delete</td>
</tr>
<c:forEach var="s" items="${l}"  >
<tr>
<td>${s.getName()}</td>
<td>${s.getId()}</td>
<td>${s.getAge()}</td>
<td><a href="updateget?id=${s.getId()}">edit</a></td>
<td><a href="delete?id=${s.getId()}">delete</a></td>
</tr>
</c:forEach>

</table>
</body>
</html>