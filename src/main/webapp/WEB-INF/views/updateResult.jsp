<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>result</title>
</head>
<body>
<h2>更新完了</h2>

<p>{<fmt:message key ="before"/>}</p>
<p>
<fmt:message key ="id"/>:${beforeValue.getProductId()} <br>
<fmt:message key ="name"/>:${beforeValue.getProductName()} <br>
<fmt:message key ="price"/>:${beforeValue.getPrice()} <br>
</p>
<p>{<fmt:message key ="after"/>}</p>
<p>
<fmt:message key ="id"/>:${afterValue.getProductId()} <br>
<fmt:message key ="name"/>:${afterValue.getProductName()} <br>
<fmt:message key ="price"/>:${afterValue.getPrice()} <br>
</p>
<a href="updateback"><fmt:message key = "back"/></a>

</body>
</html>