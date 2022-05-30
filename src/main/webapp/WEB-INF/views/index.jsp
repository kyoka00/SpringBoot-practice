<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
</head>
<body>
<form:form action ="productResult" modelAttribute = "res">
	<form:input path ="userName"/>
	<form:select path = "id">
	< <form:options items="${productList}" itemLabel="productName" itemValue="productId" />
	</form:select>
	<form:button>送信</form:button>
</form:form>
</body>
</html>