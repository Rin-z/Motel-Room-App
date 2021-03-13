<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<body>
	<div class="container-fluid mt-3">
		<div class="text-lg-center h4 mb-3">Lists AccountInfo</div>
		<div class="col-8 m-auto">
			<table class="table table-light">
				<thead>
					<tr>
						<th>ID</th>
						<th>Acount</th>
						<th>Gender</th>
						<th>Date of birth</th>
						<th>Email</th>
						<th>Phone</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${listOfAccountInfo }" var="e">
						<tr>
							<td>${e.accountInfoId }</td>
							<td>${e.name }</td>
							<td>${e.gender == 1 ? 'Male' : 'Female' }</td>
							<td>${e.birthday}</td>
							<td>${e.email }</td>
							<td>${e.phone }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>