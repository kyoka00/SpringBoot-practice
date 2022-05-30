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
<p>結果画面</p>
<p>${fn:escapeXml(userName)}さんが下記の商品を選択しました</p>
<p>商品: ${fn:escapeXml(product.getProductName())}</p>
<p>金額: ${fn:escapeXml(product.getPrice())}</p>
</body>
</html>