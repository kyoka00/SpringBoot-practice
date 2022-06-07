<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
</head>
<body>
<h1>検索条件を入力してください</h1>
<p>${msg}</p>
<form:form action ="productResult" modelAttribute = "res">
	<fmt:message key = "name"/>
	<form:input type= "text" path ="name"/>
	<form:errors path="name" cssStyle="color: red"/><br>
	<fmt:message key = "price"/>
	<form:input path ="price"/>
	<form:errors path="price" cssStyle="color: red"/><br>
	<form:button name ="search"><fmt:message key = "btn_insert"/></form:button>
	<form:button name = "register"><fmt:message key = "btn_register"/></form:button>
</form:form>
</body>
</html>