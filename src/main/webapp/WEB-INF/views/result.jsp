<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>result</title>
</head>
<body>
<h2>検索画面</h2>
<p>${msg}</p>
<p>product_id: ${fn:escapeXml(product.getProductId())}</p>
<p>product_name: ${fn:escapeXml(product.getProductName())}</p>
<p>price: ${fn:escapeXml(product.getPrice())}</p>
</body>
</html>