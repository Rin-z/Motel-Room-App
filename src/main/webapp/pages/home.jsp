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
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <title>Trang chủ</title>
    <link rel="stylesheet" href="resources/content/css/home.css">
    
</head>

<body>
    

    <section id="headerSection" class="d-grid flex-row">
        <nav>
            <div class="container-fluid bgnav">
            </div>
            <div class="container-fluid  navbar1 ">
                <small class="welcome">Chào mừng đến với FR</small>
                <div class="container infoNav d-flex flex-row  ">
                    <div class="email ">
                        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
                            class="bi bi-envelope-open" viewBox="0 0 16 16">
                            <path
                                d="M8.47 1.318a1 1 0 0 0-.94 0l-6 3.2A1 1 0 0 0 1 5.4v.818l5.724 3.465L8 8.917l1.276.766L15 6.218V5.4a1 1 0 0 0-.53-.882l-6-3.2zM15 7.388l-4.754 2.877L15 13.117v-5.73zm-.035 6.874L8 10.083l-6.965 4.18A1 1 0 0 0 2 15h12a1 1 0 0 0 .965-.738zM1 13.117l4.754-2.852L1 7.387v5.73zM7.059.435a2 2 0 0 1 1.882 0l6 3.2A2 2 0 0 1 16 5.4V14a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2V5.4a2 2 0 0 1 1.059-1.765l6-3.2z" />
                        </svg>
                    </div>
                    <div class="phone ">
                        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
                            class="bi bi-phone" viewBox="0 0 16 16">
                            <path
                                d="M11 1a1 1 0 0 1 1 1v12a1 1 0 0 1-1 1H5a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1h6zM5 0a2 2 0 0 0-2 2v12a2 2 0 0 0 2 2h6a2 2 0 0 0 2-2V2a2 2 0 0 0-2-2H5z" />
                            <path d="M8 14a1 1 0 1 0 0-2 1 1 0 0 0 0 2z" />
                        </svg>
                    </div>
                    <div class="facebook">
                        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
                            class="bi bi-facebook" viewBox="0 0 16 16">
                            <path
                                d="M16 8.049c0-4.446-3.582-8.05-8-8.05C3.58 0-.002 3.603-.002 8.05c0 4.017 2.926 7.347 6.75 7.951v-5.625h-2.03V8.05H6.75V6.275c0-2.017 1.195-3.131 3.022-3.131.876 0 1.791.157 1.791.157v1.98h-1.009c-.993 0-1.303.621-1.303 1.258v1.51h2.218l-.354 2.326H9.25V16c3.824-.604 6.75-3.934 6.75-7.951z" />
                        </svg>
                    </div>
                </div>
            </div>
        </nav>
        <div class="container-fluid navbar2   " id="navbar2">
            <div class="logo p-0">
                <span class="find">F</span><span class="room">R</span>
            </div>
            <div class=" logo1 ">
                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-list"
                    viewBox="0 0 16 16">
                    <path fill-rule="evenodd"
                        d="M2.5 11.5A.5.5 0 0 1 3 11h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4A.5.5 0 0 1 3 7h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4A.5.5 0 0 1 3 3h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5z" />
                </svg>
            </div>
            <div class="container home-log-reg d-flex justify-content-end  ">
                <div class="home "><a href="#">Trang chủ</a></div>
                <div class="login"><a href="login">Đăng nhập</a></div>
                <div class="register"><a href="#" >Đăng ký</a></div>
            </div>
        </div>
        <div class="container-fluid navbar3  " id="navbar3">
            <div class="logo p-0">
                <span class="find">F</span><span class="room">R</span>
            </div>

            <div class="container home-log-reg d-flex justify-content-end  ">
                <div class="home "><a class="text-light" href="#">Trang chủ</a></div>
                <div class="login"><a class="text-light" href="#">Đăng nhập</a></div>
                <div class="register"><a class="text-light" href="#">Đăng
                        ký</a></div>
            </div>
        </div>
        <div class="location">
            <div class="container px-5 py-5 font-weight-bold text-uppercase book-form ">
                <h2>Đặt ngay hôm nay</h2>
                <small>Tiện lợi và nhanh chóng</small>
                <p class="title-tinh">Chọn Tỉnh / Thành phố</p>
                <div class="drop-btn-TT ">
                    <button class="btn btn-tinh" id="btn-tinh">Tỉnh / Thành phố ...</button>
                    <div class="dropdown-TT " id="dropdown-TT">
                        <!-- <a href="#home" onclick="myFunction('home')">Home</a>
                        <a href="#news">News</a>
                        <a href="#contact">Contact</a>
                        <a href="#about">About</a>
                        <a href="#support">Support</a>
                        <a href="#blog">Blog</a>
                        <a href="#tools">Tools</a>
                        <a href="#base">Base</a>
                        <a href="#custom">Custom</a>
                        <a href="#more">More</a>
                        <a href="#logo">Logo</a>
                        <a href="#friends">Friends</a>
                        <a href="#partners">Partners</a>
                        <a href="#people">People</a>
                        <a href="#work">Work</a> -->
                    </div>
                </div>

                <p class="title-huyen">Chọn Quận / Huyện</p>
                <div class="drop-btn-QH">
                    <button class="btn btn-huyen " id="btn-huyen">Quận / Huyện ...</button>
                    <div class="dropdown-QH " id ="dropdown-QH">
                        <!-- <a href="#home" onclick="myFunction('home')">Home</a>
                        <a href="#news">News</a>
                        <a href="#contact">Contact</a>
                        <a href="#about">About</a>
                        <a href="#support">Support</a>
                        <a href="#blog">Blog</a>
                        <a href="#tools">Tools</a>
                        <a href="#base">Base</a>
                        <a href="#custom">Custom</a>
                        <a href="#more">More</a>
                        <a href="#logo">Logo</a>
                        <a href="#friends">Friends</a>
                        <a href="#partners">Partners</a>
                        <a href="#people">People</a>
                        <a href="#work">Work</a> -->
                    </div>
                </div>
                <button class="btn search-btn">Tìm kiếm</button>
            </div>
            <div class="bg-form"></div>


        </div>
    </section>
    <section id="bodySection"  onclick="bodySectionClick()">
        <h2 class="header2 "><span class="find2 ">F</Span>ind<span class="room2">R</span>oom</h2>
        <p class="title2 text-center">Tìm kiếm phòng theo yêu cầu của bạn</p>
        <ol class="contain   d-flex p-0  justify-content-between   ">
            <li class="content1  text-center">
                <button class="btn  btn-gia  "onclick="dropCardContain()">Giá cả</button>
                <div class="drop-gia ">
                    <a href="#home">Home</a>
                    <a href="#news">News</a>
                    <a href="#contact">Contact</a>
                    <a href="#about">About</a>
                </div>
            </li>
            <li class="content2  text-center ">
                <button class="btn btn-loai   " onclick="dropCardContain()">Loại hình</button>
                <div class="drop-loai  ">
                    <a href="#home">Home</a>
                    <a href="#news">News</a>
                    <a href="#contact">Contact</a>
                    <a href="#about">About</a>
                </div>
            </li>
            <li class="content3  text-center">
                <button class="btn btn-tinhtrang  "onclick="dropCardContain()">Tình trạng</button>
                <div class="drop-tinhtrang  ">
                    <a href="#home">Home</a>
                    <a href="#news">News</a>
                    <a href="#contact">Contact</a>
                    <a href="#about">About</a>
                </div>
            </li>
        </ol>
        <div id="card-container" class="card-container container-fluid py-3 ">
            <div class="container-fluid item  ">
                <div class="img-contain">
                    <img src="img/1.jpg" alt="">
                </div>
                <div class="text-contain ">
                    <h1>Đà Nẵng</h1>
                    <p>Lorem ipsum dolor sit adipisicing elit.</p>
                    <h1 class="price">1.000.000VNĐ / tháng</h1>
                </div>
            </div>
            <div class="container-fluid item ">
                <div class="img-contain">
                    <img src="img/2.jpg" alt="">
                </div>
                <div class="text-contain">
                    <h1>Huế</h1>
                    <p>Lorem ipsum dolor sit adipisicing elit.</p>
                    <h1 class="price">1.500.000VNĐ / tháng</h1>
                </div>
            </div>
            <div class="container-fluid item ">
                <div class="img-contain">
                    <img src="img/3.jpg" alt="">
                </div>
                <div class="text-contain">
                    <h1>Sài Gòn</h1>
                    <p>Lorem ipsum dolor sit adipisicing elit.</p>
                    <h1 class="price">3.000.000VNĐ / tháng</h1>
                </div>
            </div>
            <div class="container-fluid item ">
                <div class="img-contain">
                    <img src="img/4.jpg" alt="">
                </div>
                <div class="text-contain">
                    <h1>Hà Nội</h1>
                    <p>Lorem ipsum dolor sit adipisicing elit.</p>
                    <h1 class="price">2.500.000VNĐ / tháng</h1>
                </div>
            </div>
            <div class="container-fluid item ">
                <div class="img-contain">
                    <img src="img/5.jpg" alt="">
                </div>
                <div class="text-contain">
                    <h1>Hà Tĩnh</h1>
                    <p>Lorem ipsum dolor sit adipisicing elit.</p>
                    <h1 class="price">1.200.000VNĐ / tháng</h1>
                </div>
            </div>
            <div class="container-fluid item ">
                <div class="img-contain">
                    <img src="img/6.jpg" alt="">
                </div>
                <div class="text-contain">
                    <h1>Vũng Tàu</h1>
                    <p>Lorem ipsum dolor sit adipisicing elit.</p>
                    <h1 class="price">2.300.000VNĐ / tháng</h1>
                </div>
            </div>

        </div>

    </section>


</body>
<script src="resources/content/js/FPT-trangchu.js"></script>
</html>