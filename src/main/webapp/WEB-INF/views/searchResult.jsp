<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>result</title>
</head>
<body>
<h2>検索結果</h2>
<table border="1">
<tr>
<th><fmt:message key = "id"/></th>
<th><fmt:message key = "name"/></th>
<th><fmt:message key = "price"/></th>
</tr>
<c:forEach var="product" items="${product}">
<tr>
<td>${fn:escapeXml(product.getProductId())}</td>
<td>${fn:escapeXml(product.getProductName())}</td>
<td>${fn:escapeXml(product.getPrice())}</td>
</tr>
</c:forEach>
</table>
<a href="back"><fmt:message key = "back"/></a>
</body>
</html>