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
<h1>検索条件を入力してください</h1>
<p>${msg}</p>
<form:form action ="productResult" modelAttribute = "res">
	<label>product_name</label>
	<form:input type= "text" path ="name"/><br>
	<label>price:</label>
	<form:input path ="price" type ="number"/><br>
	<form:button name ="search">検索</form:button>
	<form:button name = "register">登録</form:button>
</form:form>
</body>
</html>