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
<h1>削除対象のproduct_idを入力してください</h1>
<p>${msg}</p>
<form:form action ="delete" modelAttribute = "deleteForm" method ="get">
	<label><fmt:message key="id"/></label>
	<form:input path ="id"/><br>
	<form:button><fmt:message key = "btn_delete"/></form:button>
</form:form>
</body>
</html>