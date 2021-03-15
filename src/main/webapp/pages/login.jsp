<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form</title>
    <link rel="stylesheet" href="resources/content/css/FPT.css">
    
</head>
<body>
	  <div style="position: fixed; top:2px; right: 5px;font-size:20px;">
			<c:if test="${error == 'none' }">
				<div>Thong tin dang nhap sai</div>
			</c:if>
			<c:if test="${error == 'empty_text' }">
				<div>Chua dien thong tin</div>
			</c:if>
		</div>	
		
       <div class="logo p-0 fr2">
              <span class="find">F</span><span class="room">R</span>
       </div>
       <section id="log-regSection">
              <div class="form-dn-dk ">
					
                     <div class="form-dn">
                            <h1>Đăng nhập</h1>
                            <form method="post" action="login">
                                   <!-- <h3>Tên đăng nhập</h3> -->
                                   <div class="contain">
                                          <input type="text" name="txtusername" id="input " class="hello" placeholder="Tên đăng nhập..." value="${username }">
                                          <p class="line"></p>
                                   </div>
                                   <!-- <h3>Mật khẩu</h3> -->
                                   <div class="contain">
                                          <input type="text"  name="txtpassword" id="input" class="email" placeholder="Mật khẩu..." value="${password }">
                                          <p class="line"></p>
                                   </div>
                                   <button type="submit" class="btn-dk">Đăng nhập</button>
                            </form>
                            <a href="#" class="form-reg" id="dn->dk">Tạo tài khoản mới</a>
                     </div>

                     <div class="form-dk" id="form-dk">
                            <h1>Đăng ký</h1>
                            <form action="" class="">
                                   
                                   <!-- <h3>Email</h3> -->
                                   <div class="contain ">
                                          <input type="text" id="input " class="tendn" placeholder="Tên đăng nhập...">
                                          <p class="line"></p>
                                   </div>
                                   <!-- <h3>Mật khẩu</h3> -->
                                   <div class="contain">
                                          <input type="text" id="input" class="matkhau" placeholder="Mật khẩu...">
                                          <p class="line"></p>
                                   </div>
                                   <!-- <h3>Họ và tên</h3> -->
                                   <div class="contain">
                                          <input type="text" id="input" class="ten " placeholder="Họ và tên...">
                                          <p class="line"></p>
                                   </div>
                                   <!-- <h3>Địa chỉ</h3> -->
                                   <div class="contain">
                                          <input type="text" id="input" class="diachi" placeholder="Địa chỉ...">
                                          <p class="line"></p>
                                   </div>
                                   <!-- <h3>Số điện thoại</h3> -->
                                   <div class="contain">
                                          <input type="text" id="input" class="sodt" placeholder="Số điện thoại...">
                                          <p class="line"></p>
                                   </div>
                                   <button type="submit" class="btn-dk">Đăng ký</button>
                                   <a href="#" class="form-log" id="dk->dn">Bạn đã có tài khoản ?</a>
                            </form>
                     </div>
                    
              </div>
              
              </div>
              <div class="bg-left" id="bg-left"></div>
       </section>
</body>
<script src="resources/content/js/FPT-dangnhap-dangky.js"></script>

</html>