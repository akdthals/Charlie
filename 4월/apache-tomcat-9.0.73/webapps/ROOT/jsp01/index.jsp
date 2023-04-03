<%@ 
    page
    language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    
%>



<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>웨딩 | BRANDO</title>
    
    <link rel="shortcut icon" href="./img/wedding-img4.png">
    <link rel="apple-touch-icon" sizes="192x192" href="./img/wedding-img4.png">

    <!-- 오픈소스 -->
    <!-- 폰트어썸 4 아이콘 -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <!-- 오픈소스 -->

    <!-- 유저 스타일 -->
    <link rel="stylesheet" href="./css/style.css">
    <link rel="stylesheet" href="./css/response.css">

    <!-- 오픈소스 -->
    <script src="./js/lib/jquery-2.2.4.min.js"></script>
    <script src="./js/lib/jquery.easing.1.3.js"></script>
    
    <!-- 사용자 작성 -->
    <script src="./js/wedding.js" defer></script>


</head>
<body>
<div id="wrap">
    <ul id="skip">
        <li><a href="#header">헤더바로가기</a></li>
        <li><a href="#main">메인바로가기</a></li>
        <li><a href="#footer">하단바로가기</a></li>
    </ul>
    <header id="header">
        <div class="container">
            <div class="gap">
                <div class="left">
                    <ul>
                        <li><a href="#section2" class="main-btn" title="THE COUPLE">THE COUPLE</a></li>
                        <li><a href="#section4" class="main-btn" title="EVENT & PARTIES">EVENT & PARTIES</a></li>
                        <li><a href="#section5" class="main-btn" title="GALLERY">GALLERY</a></li>
                    </ul>
                </div>
                <div class="center">
                    <a href="#wrap" title="HOME"></a>
                </div>
                <div class="right">
                    <ul>
                        <li><a href="#section6"  class="main-btn" title="ATTENDING">ATTENDING</a></li>
                        <li><a href="#section9"  class="main-btn" title="OUR BLOG">OUR BLOG</a></li>
                        <li><a href="#section10" class="main-btn" title="LOCATION">LOCATION</a></li>
                    </ul>
                </div>
                <div id="mobileNav">
                    <a href="#" class="mobile-btn">
                        <i class="line line1"></i>
                        <i class="line line2"></i>
                        <i class="line line3"></i>
                    </a>
                </div>
            </div>
        </div>
    </header>
    <main id="main">
        <section id="section1">
            <div class="container">

                <div class="slide-container">
                    <div class="slide-view">
                        <ul class="slide-wrap">
                            <li class="slide slide1"></li>
                            <li class="slide slide2"></li>
                            <li class="slide slide3"></li>
                        </ul>
                    </div>
                </div>

                <div class="title">
                    <div>
                        <img src="./img/wedding-img4.png" alt="">
                        <hr>
                        <h2>WE ARE GETTING MARRIED</h2>                        
                        <h3>SEPTEMBER 20TH, 2015</h3>                            
                    </div>
                </div>


                <!-- 좌우화살버튼 -->
                <a href="#" class="arrow-next-btn"><i></i></a>
                <a href="#" class="arrow-prev-btn"><i></i></a>

                <!-- 인디게이트 버튼 || 페이지네이션 버튼 -->
                <div class="page-btn-box">
                    <span><a href="#" class="page-btn blind on">페이지1</a></span>
                    <span><a href="#" class="page-btn blind">페이지2</a></span>
                    <span><a href="#" class="page-btn blind">페이지3</a></span>    
                </div>

            </div>
        </section>
        <section id="section2">
            <div class="container">
                <div class="gap">
                    <div class="title">
                        <h2>THE COUPLE</h2>
                    </div>
                    <div class="content">
                        <div class="left">
                            <div class="content-box">
                                <ul>
                                    <li class="left-image">
                                        <div class="gap">
                                            <div class="img-box">
                                                <figure>
                                                    <img src="./img/wedding-img5.jpg" alt="">
                                                </figure>
                                            </div>
                                        </div>
                                    </li>
                                    <li class="left-text">
                                        <div class="gap">
                                            <div class="text-box">
                                                <ul>
                                                    <li><h2><i class="fa fa-quote-left"></i></h2></li>
                                                    <li><h3>WE ARE SHAPED AND FASHIONED BY WHAT WE LOVE.</h3></li>
                                                    <li><h4>I AM LAILA</h4></li>
                                                    <li><p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the standard dummy text. Lorem Ipsum is simply dummy text.</p></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </li>
                                </ul>
                            </div>
                            <div class="icon-box">
                                <div class="left">
                                    <a href="#"><i class="fa fa-facebook-f"></i></a>
                                    <a href="#"><i class="fa fa-twitter"></i></a>
                                    <a href="#"><i class="fa fa-dribbble"></i></a>
                                    <a href="#"><i class="fa fa-linkedin"></i></a>
                                </div>
                                <div class="right">

                                </div>
                            </div>
                        </div>
                        <div class="right">
                            <div class="content-box">
                                <ul>
                                    <li class="left-image">
                                        <div class="gap">
                                            <div class="img-box">
                                                <figure>
                                                    <img src="./img/wedding-img6.jpg" alt="">
                                                </figure>
                                            </div>
                                        </div>
                                    </li>
                                    <li class="left-text">
                                        <div class="gap">
                                            <div class="text-box">
                                                <ul>
                                                    <li><h2><i class="fa fa-quote-left"></i></h2></li>
                                                    <li><h3>WE ARE SHAPED AND FASHIONED BY WHAT WE LOVE.</h3></li>
                                                    <li><h4>I AM LAILA</h4></li>
                                                    <li><p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the standard dummy text. Lorem Ipsum is simply dummy text.</p></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </li>
                                </ul>
                            </div>
                            <div class="icon-box">
                                <div class="left">
                                    <a href="#"><i class="fa fa-facebook-f"></i></a>
                                    <a href="#"><i class="fa fa-twitter"></i></a>
                                    <a href="#"><i class="fa fa-dribbble"></i></a>
                                    <a href="#"><i class="fa fa-linkedin"></i></a>
                                </div>
                                <div class="right">

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <section id="section3">
            <div class="container">
                <div class="gap">
                    <div class="title">
                        <h2>EAGERLY WAITING FOR OUR WEDDING DATE</h2>
                    </div>
                </div>
            </div>
        </section>
        <section id="section4">
            <div class="container">
                <div class="gap">
                    <div class="title">
                        <h2>EVENT & PARTIES</h2>
                    </div>
                    <div class="content">
                        <ul>
                            <li>
                                <div class="col-gap">
                                    <div class="box">
                                        <div class="gap">
                                            <!-- <h2><i class="fa fa-ambulance"></i></h2> -->
                                            <!-- <h2><i class="material-icons">access_alarm</i></h2> -->
                                            <h2><i class="icon-wine"></i></h2>
                                            <h3>COCKTAIL PARTY</h3>
                                            <hr>
                                            <p>SEPTEMBER 19TH, 2015</p>
                                            <h4>12:00 PM – 16:00 PM</h4>
                                        </div>
                                    </div>
                                </div>
                            </li>
                            <li>
                                <div class="col-gap">
                                    <div class="box">
                                        <div class="gap">
                                            <!-- <h2><i class="fa fa-apple"></i></h2> -->
                                            <!-- <h2><i class="fas fa-air-freshener"></i></h2> -->
                                            <h2><i class="icon-heart"></i></h2>
                                            <h3>WEDDING CEREMONY</h3>
                                            <hr>
                                            <p>SEPTEMBER 19TH, 2015</p>
                                            <h4>12:00 PM – 16:00 PM</h4>
                                        </div>
                                    </div>
                                </div>
                            </li>
                            <li>
                                <div class="col-gap">
                                    <div class="box">
                                        <div class="gap">
                                            <!-- <h2><i class="glyphicon glyphicon-apple"></i></h2> -->
                                            <h2><i class="icon-gift"></i></h2>
                                            <h3>WEDDING PARTY</h3>
                                            <hr>
                                            <p>SEPTEMBER 19TH, 2015</p>
                                            <h4>18:00 PM – 07:00 AM</h4>
                                        </div>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </section>
        <section id="section5">
            <div class="container">
                <div class="gap">
                    <div class="title"><h2>PHOTO GALLERY</h2></div>
                    <div class="content">
                        <div class="gallery-box">
                            <ul>
                                <li>
                                    <div class="col-gap">
                                        <a href="#">
                                            <figure>
                                                <img src="./img/wedding-img8.jpg" alt="">
                                            </figure>                                            
                                        </a>
                                    </div>
                                </li>
                                <li>
                                    <div class="col-gap">
                                        <a href="#">
                                            <figure>
                                                <img src="./img/wedding-img9.jpg" alt="">
                                            </figure>                                            
                                        </a>
                                    </div>
                                </li>
                                <li>
                                    <div class="col-gap">
                                        <a href="#">
                                            <figure>
                                                <img src="./img/wedding-img10.jpg" alt="">
                                            </figure>                                            
                                        </a>
                                    </div>
                                </li>
                                <li>
                                    <div class="col-gap">
                                        <a href="#">
                                            <figure>
                                                <img src="./img/wedding-img11.jpg" alt="">
                                            </figure>                                            
                                        </a>
                                    </div>
                                </li>
                                <li>
                                    <div class="col-gap">
                                        <a href="#">
                                            <figure>
                                                <img src="./img/wedding-img12.jpg" alt="">
                                            </figure>                                            
                                        </a>
                                    </div>
                                </li>
                                <li>
                                    <div class="col-gap">
                                        <a href="#">
                                            <figure>
                                                <img src="./img/wedding-img13.jpg" alt="">
                                            </figure>                                            
                                        </a>
                                    </div>
                                </li>
                                <li>
                                    <div class="col-gap">
                                        <a href="#">
                                            <figure>
                                                <img src="./img/wedding-img14.jpg" alt="">
                                            </figure>                                            
                                        </a>
                                    </div>
                                </li>
                                <li>
                                    <div class="col-gap">
                                        <a href="#">
                                            <figure>
                                                <img src="./img/wedding-img15.jpg" alt="">
                                            </figure>                                            
                                        </a>
                                    </div>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <section id="section6">
            <div class="container">
                <div class="gap">
                    <div class="content">
                        <ul>
                            <li>
                                <div class="col-gap">
                                    <div class="content-box left">
                                        <h2>
                                            BE PRESENT AT THE WEDDING TO GIVE YOUR BLESSINGS & LOVE.
                                        </h2>
                                    </div>
                                </div>
                            </li>
                            <li>
                                <div class="col-gap">
                                    <div class="content-box right">
                                        <div class="content-wrap">
                                            <h2 class="content-head">ARE YOU ATTENDING?</h2>
                                            <form name="message_form" id="messageForm" method="post" action="./message.php">
                                                <ul>
                                                    <li><input type="text" name="irum" id="irum" placeholder="YURE NAME"></li>
                                                    <li><input type="email" name="email" id="email" placeholder="YURE EMAIL"></li>
                                                    <li>
                                                        <div>
                                                            <select name="select1" id="select1">
                                                                <option value="" selected>NUMBER OF GUESTS</option>
                                                                <option value="01">01</option>
                                                                <option value="02">02</option>
                                                                <option value="03">03</option>
                                                                <option value="04">04</option>
                                                                <option value="05">05</option>
                                                            </select>
                                                        </div>
                                                        <div>
                                                            <select name="select2" id="select2">
                                                                <option value="ALL EVENTS" selected>ALL EVENTS</option>
                                                                <option value="Cocktail Party">Cocktail Party</option>
                                                                <option value="Wedding Ceremony">Wedding Ceremony</option>
                                                                <option value="Wedding Party">Wedding Party</option>
                                                            </select>
                                                        </div>
                                                    </li>
                                                    <li>
                                                        <textarea name="message" id="message" placeholder="YURE MESSAGE"></textarea>
                                                    </li>
                                                    <li>
                                                        <button type="submit" class="submit-btn">Send Message</button>   
                                                    </li>
                                                </ul>
                                            </form>
                                            <div class="content-foot foot1">Your message was sent successfully. Thanks.</div>
                                            <div class="content-foot foot2">Validation errors occurred. Please confirm the fields and submit it again.</div>
                                        </div>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </section>
        <section id="section7">
            <div class="container">
                <div class="gap">
                    <div class="title">
                        <h2>GIFT REGISTRY</h2>
                    </div>
                    <div class="content">
                        <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry’s standard dummy text ever since the 1500s. Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry’s standard dummy text ever since the 1500s.</p>
                        <span>
                            <a href="#"><img src="./img/wedding-img18.jpg" alt=""></a>
                            <a href="#"><img src="./img/wedding-img19.jpg" alt=""></a>
                            <a href="#"><img src="./img/wedding-img20.jpg" alt=""></a>
                            <a href="#"><img src="./img/wedding-img21.jpg" alt=""></a>
                        </span>
                    </div>
                </div>
            </div>
        </section>
        <section id="section8">
            <div class="container">
                <div class="gap">
                    <div class="title">
                        <h2>OUR STORY</h2>
                    </div>
                    <div class="content">
                        <div class="slide-container">
                            <div class="slide-view">
                                <ul class="slide-wrap">
                                    <li class="slide slide1">
                                        <div class="col-gap">
                                            <div class="top-box">
                                                <img src="./img/wedding-img8.jpg" alt="">
                                                <span>
                                                    <em>30 March 2016</em>
                                                </span>
                                            </div>
                                            <div class="bottom-box">
                                                <h3>01</h3>
                                                <div>
                                                    <h4>Our First Dating</h4>
                                                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry....</p>
                                                    <i></i>
                                                </div>
                                            </div>
                                        </div>
                                    </li>
                                    <li class="slide slide1">
                                        <div class="col-gap">
                                            <div class="top-box">
                                                <img src="./img/wedding-img9.jpg" alt="">
                                                <span>
                                                    <em>30 March 2016</em>
                                                </span>
                                            </div>
                                            <div class="bottom-box">
                                                <h3>02</h3>
                                                <div>
                                                    <h4>Our First Dating</h4>
                                                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry....</p>
                                                    <i></i>
                                                </div>
                                            </div>
                                        </div>
                                    </li>
                                    <li class="slide slide1">
                                        <div class="col-gap">
                                            <div class="top-box">
                                                <img src="./img/wedding-img10.jpg" alt="">
                                                <span>
                                                    <em>30 March 2016</em>
                                                </span>
                                            </div>
                                            <div class="bottom-box">
                                                <h3>03</h3>
                                                <div>
                                                    <h4>Our First Dating</h4>
                                                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry....</p>
                                                    <i></i>
                                                </div>
                                            </div>
                                        </div>
                                    </li>
                                    <li class="slide slide1">
                                        <div class="col-gap">
                                            <div class="top-box">
                                                <img src="./img/wedding-img11.jpg" alt="">
                                                <span>
                                                    <em>30 March 2016</em>
                                                </span>
                                            </div>
                                            <div class="bottom-box">
                                                <h3>04</h3>
                                                <div>
                                                    <h4>Our First Dating</h4>
                                                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry....</p>
                                                    <i></i>
                                                </div>
                                            </div>
                                        </div>
                                    </li>
                                    <li class="slide slide1">
                                        <div class="col-gap">
                                            <div class="top-box">
                                                <img src="./img/wedding-img12.jpg" alt="">
                                                <span>
                                                    <em>30 March 2016</em>
                                                </span>
                                            </div>
                                            <div class="bottom-box">
                                                <h3>05</h3>
                                                <div>
                                                    <h4>Our First Dating</h4>
                                                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry....</p>
                                                    <i></i>
                                                </div>
                                            </div>
                                        </div>
                                    </li>                                    
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <section id="section9">
            <div class="container">
                <div class="gap">
                    <div class="title">
                        <h2>RECENT BLOG</h2>
                    </div>
                    <div class="content">
                        <ul>
                            <li>
                                <div class="col-gap">
                                    <div class="img-box">
                                        <img src="./img/wedding-img22.jpg" alt="">
                                    </div>
                                    <div class="txt-box">
                                        <ul>
                                            <li><a href="#">WEDDING</a></li>
                                            <li><h3><a href="#">WEDDINGS ARE IMPORTANT BECAUSE THEY CELEBRATE LIFE AND POSSIBILITY.</a></h3></li>
                                            <li><p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum is...</p></li>
                                            <li><hr></li>
                                            <li><a href="#">JUNE 30, 2016</a> / POSTED BY <a href="#">HARESH</a></li>
                                        </ul>
                                    </div>
                                </div>
                            </li>
                            <li>
                                <div class="col-gap">
                                    <div class="img-box">
                                        <img src="./img/wedding-img23.jpg" alt="">
                                    </div>
                                    <div class="txt-box">
                                        <ul>
                                            <li><a href="#">WEDDING</a></li>
                                            <li><h3><a href="#">A WOMAN WITH A FINE PROSPECT OF HAPPINESS BEHIND HER.</a></h3></li>
                                            <li><p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum is...</p></li>
                                            <li><hr></li>
                                            <li><a href="#">JUNE 30, 2016</a> / POSTED BY <a href="#">HARESH</a></li>
                                        </ul>
                                    </div>
                                </div>
                            </li>
                            <li>
                                <div class="col-gap">
                                    <div class="img-box">
                                        <img src="./img/wedding-img24.jpg" alt="">
                                    </div>
                                    <div class="txt-box">
                                        <ul>
                                            <li><a href="#">WEDDING</a></li>
                                            <li><h3><a href="#">I WAS MARRIED BY A JUDGE. I SHOULD HAVE ASKED FOR A JURY.</a></h3></li>
                                            <li><p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum is...</p></li>
                                            <li><hr></li>
                                            <li><a href="#">JUNE 30, 2016</a> / POSTED BY <a href="#">HARESH</a></li>
                                        </ul>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </section>
        <section id="section10">
            <div class="container">
                <div class="gap">
                    <div class="title">
                        <h2>LOCATION</h2>
                    </div>
                    <div class="content">
                        <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry’s standard dummy text ever since the 1500s. Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry’s standard dummy text ever since the 1500s.</p>
                    </div>
                </div>
            </div>
        </section>
        <section id="section11">
            <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3158.230064012958!2d126.75852181564994!3d37.667301526107906!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x357c855df4876fe3%3A0xecb41ce28340f76!2z6rOg7JaR7IucIOyjvOyXvTHrj5kgMTQwOCDqsJXshKDrp4jsnYTrkZDsgrAxNOuLqOyngOyVhO2MjO2KuA!5e0!3m2!1sko!2skr!4v1675237256606!5m2!1sko!2skr" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
        </section>
    </main>
    <footer id="footer">
        <div class="container">
            <div class="gap">
                <div class="content">
                    <div class="foot-row1">
                        <a href="#"><i class="fa fa-facebook"></i></a>
                        <a href="#"><i class="fa fa-twitter"></i></a>
                        <a href="#"><i class="fa fa-dribbble"></i></a>
                        <a href="#"><i class="fa fa-youtube-play"></i></a>
                        <a href="#"><i class="fa fa-linkedin"></i></a>
                    </div>

                    <div class="foot-row2">
                        <p>&copy; 2022 BRANDO IS PROUDLY POWERED BY THEMEZAA.</p>
                    </div>    
                </div>
            </div>
        </div>
    </footer>
<!-- 
    팝업창
    퀵메뉴
    고탑버튼
    기타 
-->
    <div class="gotop">
        <a href="#wrap"><i class="fa fa-angle-up"></i></a>
    </div>

</div>     

</body>
</html>