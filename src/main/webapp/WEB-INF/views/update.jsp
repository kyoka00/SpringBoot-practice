<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
</head>
<body>
<h1>更新する情報を入力してください</h1>
<p>${msg}</p>
<form:form action ="update" modelAttribute = "res" method="post">
	<fmt:message key="id"/>:
	<form:input path ="id"/>
	<form:errors path="id" cssStyle="color: red"/><br>
	
	<fmt:message key = "name"/>:
	<form:input type= "text" path ="name"/>
	<form:errors path="name" cssStyle="color: red"/><br>
	
	<fmt:message key = "price"/>:
	<form:input path ="price"/>
	<form:errors path="price" cssStyle="color: red"/><br>
	
	<form:button><fmt:message key = "btn_update"/></form:button>
</form:form>

</body>
</html>