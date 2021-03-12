<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>

<head>
	<title>LOGIN</title>
	<link rel="shortcut icon" type="image/png" href="resources/content/favicon/favicon.ico" />
	<link rel="stylesheet" href="resources/content/fonts/material-icon/css/material-design-iconic-font.min.css">
	<link rel="stylesheet" href="resources/content/bootstrap/bootstrap.min.css">
	<link rel="stylesheet" href="resources/content/login-signup/login-signup.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<style>
.field-icon {
  float: right;
  margin-left: -25px;
  margin-top: -25px;
  position: relative;
  z-index: 2;
}

</style>
<body style="overflow: hidden;">
	<section class="sign-in" style="margin-top: 2%;">
		<div class="container">
			<div class="signin-content">
				<div class="signin-image">
					<figure>
						<img src="resources/content/image/image-other/signin-image.jpg" alt="sing up image">
					</figure>
					<a href="signup" class="signup-image-link">Create an account</a>
				</div>

				<div class="signin-form">
					<h2 class="form-title">Login</h2>
					<form method="POST" class="register-form" id="login-form" action="login">
						<c:if test="${not empty message}">
							<div class="alert alert-danger">${message}</div>
						</c:if>
						<div class="alert alert-danger" id="messageLogin" style="display: none;">
						</div>
						<div class="form-group" style="position: relative">
							<label for="username"><i class="zmdi zmdi-account material-icons-name"></i></label>
							<input type="text" name="username" id="username" placeholder="User Name"
								autocomplete="off" />
							<div class="valid-feedback"></div>
							<div class="invalid-feedback"></div>
						</div>
						<div class="form-group">
							<label for="password"><i class="zmdi zmdi-lock"></i></label>
							<input type="password" name="password" id="password" placeholder="Password"
								autocomplete="off" />
							<span toggle="#password" class="fa fa-fw fa-eye field-icon toggle-password"></span>
							<div class="valid-feedback"></div>
							<div class="invalid-feedback"></div>
						</div>
						<div class="form-group form-button">
							<input type="submit" name="signin" id="signin" class="form-submit" value="Log in" />
						</div>
					</form>
					<div class="social-login">
						<span class="social-label">Or login with</span>
						<ul class="socials">
							<li><a href="#"><i class="display-flex-center zmdi zmdi-facebook"></i></a></li>
							<li><a href="#"><i class="display-flex-center zmdi zmdi-twitter"></i></a></li>
							<li><a href="#"><i class="display-flex-center zmdi zmdi-google"></i></a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
<script type="text/javascript" src="resources/content/js/jquery.min.js"></script>
<script src="resources/content/js/validateLogin.js"></script>

</html>