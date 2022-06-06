<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form:form action ="login" modelAttribute="loginform" method= "post">
<p>${msg}</p>
<label>ログインID：</label>
<form:input path="loginId"/><br>
<label>パスワード：</label>
<form:password path="password"/><br>
<form:button>送信</form:button>
</form:form>
<a href ="back">戻る</a>

</body>
</html>