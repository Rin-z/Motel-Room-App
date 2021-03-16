<%@page import="fpt.model.Post"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Account's Home
	<c:forEach var="post_item" items="${post}">
        <hr>
        <p>${post_item.postTitle}</p><br>
        <p>${post_item.description}</p><br>
        <p>account: ${post_item.accountId}</p><br>
        <p>room: ${post_item.roomId}</p><br>
    </c:forEach>
    <hr style="padding: 1px; background-color: red;">
    <c:forEach var="post_item" items="${post2}">
        <hr>
        <p>${post_item.postTitle}</p><br>
        <p>${post_item.description}</p><br>
        <p>account: ${post_item.accountId}</p><br>
        <p>room: ${post_item.roomId}</p><br>
    </c:forEach>
</body>
</html>