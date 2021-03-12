<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="status">
		<input class="statusid" type="text" name="accStatusId" id="accStatusId" placeholder="User Name"/>
		<input type="submit" name="findStatus" id="findStatus" class="form-submit" value="find" />
	</form>
	<hr>
	<c:if test="${not empty statusName}">
		<div class="empDiv">${statusName}</div>
	</c:if>
</body>
</html>