function WrapComponent(){
    return(
        <div id="wrap">
            <HeaderComponent/>
            <MainComponent/>
            <FooterComponent/>
            <GotopComponent/>
        </div>
    )
}

    function HeaderComponent(){
        return(
            <header id="header">
                <div className="container">
                    <div className="gap">
                        <div className="content">
                            <div className="logo">
                                <h1><a href="#wrap"><img src="./img/logo-tattoo.png" alt="" /></a></h1>
                            </div>
                            <div className="nav">
                                <ul>
                                    <li><a href="#section2" className="main-btn">ABOUT</a></li>
                                    <li><a href="#section3" className="main-btn">SERVICES</a></li>
                                    <li><a href="#section4" className="main-btn">ARTISTS</a></li>
                                    <li><a href="#section5" className="main-btn">PORTFOLIO</a></li>
                                    <li><a href="#section6" className="main-btn">PACKAGE</a></li>
                                    <li><a href="#section9" className="main-btn">BLOG</a></li>
                                    <li><a href="#section10" className="main-btn">CONTACT</a></li>
                                </ul>
                            </div>
                        </div>
                        <div id="mobileNav">
                            <a href="#" className="mobile-btn">
                                <i className="line line1"></i>
                                <i className="line line2"></i>
                                <i className="line line3"></i>
                            </a>
                        </div>
                    </div>
                </div>
            </header>
        )
    }
    function MainComponent(){
        return(
            <main id="main">
                <Section1Component/>
                <Section2Component/>
                <Section3Component/>
                <Section4Component/>
                <Section5Component/>
                <Section6Component/>
                <Section7Component/>
                <Section8Component/>
                <Section9Component/>
                <Section10Component/>
            </main>
        )
    }

        function Section1Component(){
            return(
                <section id="section1">
                    <div className="container">
                        <div className="slide-container">
                            <div className="slide-view">
                                <ul className="slide-wrap">
                                    <li className="slide slide3">
                                        <div className="title">
                                            <div className="gap">
                                                <div className="content">
                                                    <img src="./img/tattoo-img-7.png" alt="" className="img1" />
                                                    <h3>The most talented artists create<br />the highest quality art.</h3>
                                                    <img src="./img/tattoo-img-2.png" alt="" className="img2" />
                                                </div>
                                            </div>
                                        </div>
                                    </li>
                                    <li className="slide slide1">
                                        <div className="title">
                                            <div className="gap">
                                                <div className="content">
                                                    <img src="./img/tattoo-img-1.png" alt="" className="img1" />
                                                    <h3>The most talented artists create<br />the highest quality art.</h3>
                                                    <img src="./img/tattoo-img-2.png" alt="" className="img2" />
                                                </div>
                                            </div>
                                        </div>
                                    </li>
                                    <li className="slide slide2">
                                        <div className="title">
                                            <div className="gap">
                                                <div className="content">
                                                    <img src="./img/tattoo-img-6.png" alt="" className="img1" />
                                                    <h3>The most talented artists create<br />the highest quality art.</h3>
                                                    <img src="./img/tattoo-img-2.png" alt="" className="img2" />
                                                </div>
                                            </div>
                                        </div>
                                    </li>
                                    <li className="slide slide3">
                                        <div className="title">
                                            <div className="gap">
                                                <div className="content">
                                                    <img src="./img/tattoo-img-7.png" alt="" className="img1" />
                                                    <h3>The most talented artists create<br />the highest quality art.</h3>
                                                    <img src="./img/tattoo-img-2.png" alt="" className="img2" />
                                                </div>
                                            </div>
                                        </div>
                                    </li>
                                    <li className="slide slide1">
                                        <div className="title">
                                            <div className="gap">
                                                <div className="content">
                                                    <img src="./img/tattoo-img-1.png" alt="" className="img1" />
                                                    <h3>The most talented artists create<br />the highest quality art.</h3>
                                                    <img src="./img/tattoo-img-2.png" alt="" className="img2" />
                                                </div>
                                            </div>
                                        </div>
                                    </li>
                                </ul>
                            </div>
                        </div>


                        {/* {<!-- 인디게이트 버튼 || 페이지네이션 버튼 --> -->} */}
                        <div className="page-btn-box">
                            <span><a href="#" className="page-btn blind on">페이지1</a></span>
                            <span><a href="#" className="page-btn blind">페이지2</a></span>
                            <span><a href="#" className="page-btn blind">페이지3</a></span>
                        </div>
                    </div>
                </section>
            )
        }
        function Section2Component(){
            return(
                <section id="section2">
                    <div className="container">
                        <div className="gap">
                            <div className="title">
                                <figure>

                                    <h5>WE LOVE TO TATTOO.</h5>
                                    <h1>WE ARE br/ANDO</h1>
                                </figure>
                            </div>
                            <div className="content">
                                <div className="left-box">
                                    <div className="col-gap">
                                        <ul className="row-1">
                                            <li><h2>DESIGNING SINCE '99</h2></li>
                                            <li><p>Lorem Ipsum is simply dummy text of the<br /> printing and typesetting industry.</p></li>
                                            <i></i>
                                        </ul>
                                        <ul className="row-1">
                                            <li><h2>AWARD WINNING TATTOO ARTISTS</h2></li>
                                            <li><p>Lorem Ipsum is simply dummy text of the<br /> printing and typesetting industry.</p></li>
                                            <i></i>
                                        </ul>
                                        <ul className="row-1">
                                            <li><h2>SPECIALIZED IN TRIBAL</h2></li>
                                            <li><p>Lorem Ipsum is simply dummy text of the<br /> printing and typesetting industry.</p></li>
                                        </ul>
                                    </div>
                                </div>
                                <div className="center-box">
                                    <div className="col-gap">
                                        <img src="./img/tattoo-img-8.jpg" alt="" />
                                    </div>
                                </div>
                                <div className="right-box">
                                    <div className="col-gap">
                                        <img src="./img/tattoo-img-9.jpg" alt="" />
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
            )
        }
        function Section3Component(){
            return(
                <section id="section3">
                    <div className="container">
                        <div className="gap">
                            <div className="content">
                                <div className="left">
                                    <div className="col-gap">
                                        <img src="./img/tattoo-img-10.jpg" alt="" />
                                    </div>
                                </div>
                                <div className="center">
                                    <div className="col-gap2">
                                        <div className="top-box">
                                            <h4>A CURATED GALLERY OF</h4>
                                            <h1>TATTOO ART</h1>
                                        </div>
                                        <div className="bottom-box">
                                            <h3>IN THIS br/ANDO, WE HAVE INVITED<br /> ARTISTS TO REVEAL THEIR TALENT, FOR<br /> AN ODE
                                                TO CREATIVITY.</h3>
                                            <h5>Lorem Ipsum is simply dummy text of the<br /> printing and typesetting industry. Lorem<br />
                                                Ipsum has been the industry’s standard<br /> dummy text ever since the 1500s.
                                                Lorem <br />Ipsum is simply dummy text of the printing<br /> and typesetting industry.</h5>
                                            <button type="submit" className="submit-btn">Enter The Gallary</button>
                                        </div>
                                    </div>
                                </div>
                                <div className="right">
                                    <img src="./img/tattoo-img-11.jpg" alt="" />
                                </div>
                            </div>

                        </div>


                    </div>
                </section>
            )
        }
        function Section4Component(){
            return(
                <section id="section4">
                    <div className="container">
                        <div className="gap">
                            <div className="title">

                                <h5>WE LOVE TO TATTOO.</h5>
                                <h1>OUR ARTISTS</h1>
                            </div>
                            <div className="content">
                                <ul>
                                    <li>
                                        <div className="col-gap">
                                            <figure>
                                                <img src="./img/tattoo-img-12.jpg" alt="" />
                                                <figcaption>
                                                    <em>FEDERICO FERRONI</em>
                                                </figcaption>
                                            </figure>


                                            <div className="text">
                                                <ul>

                                                    <li><h2>FEDERICO FERRONI</h2></li>
                                                    <li><h5>7 YEARS OF EXP. IN TATTOO DESIGN</h5></li>
                                                    <li><p>Lorem Ipsum is simply dummy text of the printing and<br /> typesetting industry. Lorem Ipsum has been the<br />industry’s standard dummy text ever since the 1500s.<br /> Lorem Ipsum is simply dummy text.</p></li>
                                                    <li><h4><i>fa-solid fa-envelope right</i></h4></li>
                                                    <li><h3>Email me: no-reply@domain.com</h3></li>
                                                    <li> <button type="submit" className="submit-btn">BOOK NOW</button>
                                                        <button type="submit" className="submit-btn">Portfolio</button>  </li>
                                                </ul>
                                            </div>
                                        </div>
                                    </li>
                                    <li>
                                        <div className="col-gap">
                                            <figure>
                                                <img src="./img/tattoo-img-13.jpg" alt="" />
                                                <figcaption>
                                                    <em>GILL MONTIE</em>
                                                </figcaption>
                                            </figure>


                                            <div className="text">
                                                <ul>

                                                    <li><h2>GILL MONTIE</h2></li>
                                                    <li><h5>7 YEARS OF EXP. IN TATTOO DESIGN</h5></li>
                                                    <li><p>Lorem Ipsum is simply dummy text of the printing and<br /> typesetting industry. Lorem Ipsum has been the<br />industry’s standard dummy text ever since the 1500s.<br /> Lorem Ipsum is simply dummy text.</p></li>
                                                    <li><h4><i>fa-solid fa-envelope right</i></h4></li>
                                                    <li><h3>Email me: no-reply@domain.com</h3></li>
                                                    <li> <button type="submit" className="submit-btn">BOOK NOW</button>
                                                        <button type="submit" className="submit-btn">Portfolio</button>  </li>
                                                </ul>
                                            </div>
                                        </div>
                                    </li>
                                    <li>
                                        <div className="col-gap">
                                            <figure>
                                                <img src="./img/tattoo-img-14.jpg" alt="" />
                                                <figcaption>
                                                    <em>JACCI GRESHAM</em>
                                                </figcaption>
                                            </figure>


                                            <div className="text">
                                                <ul>

                                                    <li><h2>JACCI GRESHAM</h2></li>
                                                    <li><h5>7 YEARS OF EXP. IN TATTOO DESIGN</h5></li>
                                                    <li><p>Lorem Ipsum is simply dummy text of the printing and<br /> typesetting industry. Lorem Ipsum has been the<br />industry’s standard dummy text ever since the 1500s.<br /> Lorem Ipsum is simply dummy text.</p></li>
                                                    <li><h4><i>fa-solid fa-envelope right</i></h4></li>
                                                    <li><h3>Email me: no-reply@domain.com</h3></li>
                                                    <li> <button type="submit" className="submit-btn">BOOK NOW</button>
                                                        <button type="submit" className="submit-btn">Portfolio</button>  </li>
                                                </ul>
                                            </div>
                                        </div>
                                    </li>
                                    <li>
                                        <div className="col-gap">
                                            <figure>
                                                <img src="./img/tattoo-img-15.jpg" alt="" />
                                                <figcaption>
                                                    <em>DUIS AUTEM</em>
                                                </figcaption>
                                            </figure>


                                            <div className="text">
                                                <ul>

                                                    <li><h2>DUIS AUTEM</h2></li>
                                                    <li><h5>7 YEARS OF EXP. IN TATTOO DESIGN</h5></li>
                                                    <li><p>Lorem Ipsum is simply dummy text of the printing and<br /> typesetting industry. Lorem Ipsum has been the<br />industry’s standard dummy text ever since the 1500s.<br /> Lorem Ipsum is simply dummy text.</p></li>
                                                    <li><h4><i>fa-solid fa-envelope right</i></h4></li>
                                                    <li><h3>Email me: no-reply@domain.com</h3></li>
                                                    <li> <button type="submit" className="submit-btn">BOOK NOW</button>
                                                        <button type="submit" className="submit-btn">Portfolio</button>  </li>
                                                </ul>
                                            </div>
                                        </div>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </section>
            )
        }
        function Section5Component(){
            return(
                <section id="section5">
                    <div className="container">
                        <div className="gap">
                            <div className="title">
                                <h5>WE LOVE TO TATTOO.</h5>
                                <h1>OUR ARTISTS</h1>
                                <div className="content">
                                    <ul>
                                        <li>
                                            <div className="col-gap">
                                                <figure className="img-box">
                                                    <img src="./img/tattoo-img-16.jpg" alt="" />
                                                </figure>
                                            </div>
                                        </li>
                                        <li>
                                            <col-gap>
                                                <figure className="img-box">
                                                    <img src="./img/tattoo-img-17.jpg" alt="" />
                                                </figure>
                                            </col-gap>
                                        </li>
                                        <li>
                                            <col-gap>
                                                <figure className="img-box">
                                                    <img src="./img/tattoo-img-18.jpg" alt="" />
                                                </figure>
                                            </col-gap>
                                        </li>
                                        <li>
                                            <col-gap>
                                                <figure className="img-box">
                                                    <img src="./img/tattoo-img-19.jpg" alt="" />
                                                </figure>
                                            </col-gap>
                                        </li>
                                        <li>
                                            <col-gap>
                                                <figure className="img-box">
                                                    <img src="./img/tattoo-img-20.jpg" alt="" />
                                                </figure>
                                            </col-gap>
                                        </li>
                                        <li>
                                            <col-gap>
                                                <figure className="img-box">
                                                    <img src="./img/tattoo-img-21.jpg" alt="" />
                                                </figure>
                                            </col-gap>
                                        </li>
                                        <li>
                                            <col-gap>
                                                <figure className="img-box">
                                                    <img src="./img/tattoo-img-22.jpg" alt="" />
                                                </figure>
                                            </col-gap>
                                        </li>
                                        <li>
                                            <col-gap>
                                                <figure className="img-box">
                                                    <img src="./img/tattoo-img-23.jpg" alt="" />
                                                </figure>
                                            </col-gap>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
            )
        }
        function Section6Component(){
            return(
                <section id="section6">
                    <div className="container">
                        <div className="gap">
                            <div className="title">
                                <h5>WE LOVE CREATIVE TATTOO</h5>
                                <h1>TATTOO PACKAGE</h1>
                                <div className="content">
                                    <ul>
                                        <li>
                                            <div className="col-gap">
                                                <div className="content-box">
                                                    <div className="top">
                                                        <ul>
                                                            <li>
                                                                <h2>$99</h2>
                                                            </li>
                                                            <li>
                                                                <h4>STANDARD</h4>
                                                            </li>
                                                        </ul>
                                                    </div>
                                                    <div className="middle">
                                                        <ul>
                                                            <li><h5>Angel tattoos</h5></li>
                                                            <li><h5>Animal Tattoos</h5></li>
                                                            <li><h5>Bird Tattoos</h5></li>
                                                            <li><h5>Butterfly Tattoos</h5></li>
                                                            <li><h5>Celtic Tattoos</h5></li>
                                                            <li><h5>Maori Tattoos</h5></li>
                                                        </ul>
                                                    </div>
                                                    <div className="bottom">
                                                        <button type="submit" className="submit-btn">BOOK NOW!</button>
                                                    </div>
                                                </div>
                                            </div>

                                        </li>
                                        <li>
                                            <div className="col-gap">
                                                <div className="content-box">
                                                    <div className="top">
                                                        <ul>
                                                            <li>
                                                                <h2>$125</h2>
                                                            </li>
                                                            <li>
                                                                <h4>SUPER</h4>
                                                            </li>
                                                        </ul>
                                                    </div>
                                                    <div className="middle">
                                                        <ul>
                                                            <li><h5>Angel tattoos</h5></li>
                                                            <li><h5>Animal Tattoos</h5></li>
                                                            <li><h5>Bird Tattoos</h5></li>
                                                            <li><h5>Butterfly Tattoos</h5></li>
                                                            <li><h5>Celtic Tattoos</h5></li>
                                                            <li><h5>Maori Tattoos</h5></li>
                                                        </ul>
                                                    </div>
                                                    <div className="bottom">
                                                        <button type="submit" className="submit-btn">BOOK NOW!</button>
                                                    </div>
                                                </div>
                                            </div>

                                        </li>
                                        <li>
                                            <div className="col-gap">
                                                <div className="content-box">
                                                    <div className="top">
                                                        <ul>
                                                            <li>
                                                                <h2>$120</h2>
                                                            </li>
                                                            <li>
                                                                <h4>DELUXE</h4>
                                                            </li>
                                                        </ul>
                                                    </div>
                                                    <div className="middle">
                                                        <ul>
                                                            <li><h5>Angel tattoos</h5></li>
                                                            <li><h5>Animal Tattoos</h5></li>
                                                            <li><h5>Bird Tattoos</h5></li>
                                                            <li><h5>Butterfly Tattoos</h5></li>
                                                            <li><h5>Celtic Tattoos</h5></li>
                                                            <li><h5>Maori Tattoos</h5></li>
                                                        </ul>
                                                    </div>
                                                    <div className="bottom">
                                                        <button type="submit" className="submit-btn">BOOK NOW!</button>
                                                    </div>
                                                </div>
                                            </div>

                                        </li>
                                        <li>
                                            <div className="col-gap">
                                                <div className="content-box">
                                                    <div className="top">
                                                        <ul>
                                                            <li>
                                                                <h2>$150</h2>
                                                            </li>
                                                            <li>
                                                                <h4>PREMIER</h4>
                                                            </li>
                                                        </ul>
                                                    </div>
                                                    <div className="middle">
                                                        <ul>
                                                            <li><h5>Angel tattoos</h5></li>
                                                            <li><h5>Animal Tattoos</h5></li>
                                                            <li><h5>Bird Tattoos</h5></li>
                                                            <li><h5>Butterfly Tattoos</h5></li>
                                                            <li><h5>Celtic Tattoos</h5></li>
                                                            <li><h5>Maori Tattoos</h5></li>
                                                        </ul>
                                                    </div>
                                                    <div className="bottom">
                                                        <button type="submit" className="submit-btn">BOOK NOW!</button>
                                                    </div>
                                                </div>
                                            </div>

                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
            )
        }
        function Section7Component(){
            return(
                <section id="section7">
                    <div className="container">
                        <div className="gap">
                            <div className="title">
                                <div className="content">
                                    <ul>
                                        <li>
                                            <div className="col-gap">
                                                <div className="content-box left">
                                                    <h2>DON’T MISS THE LAST SEATS HERE</h2>
                                                    <h3>GREAT SPEAKERS WITH GREAT TOPICS</h3>
                                                    <i></i>
                                                </div>
                                            </div>
                                        </li>
                                        <li>
                                            <div className="col-gap">
                                                <div className="content-box right">
                                                    <div className="content-wrap">
                                                        <h2 className="content-head">BOOK NOW</h2>
                                                        <form name="message_form" id="messageForm" method="post" action="./message.php">
                                                            <ul>
                                                                <li><input type="text" name="irum" id="irum" placeholder="YURE NAME" /></li>
                                                                <li><input type="email" name="email" id="email" placeholder="YURE EMAIL" /></li>
                                                                <li>
                                                                    <textarea name="message" id="message" placeholder="YURE MESSAGE"></textarea>
                                                                </li>
                                                                <li>
                                                                    <button type="submit" className="submit-btn">SUBMIT</button>
                                                                </li>
                                                            </ul>
                                                        </form>
                                                        <div className="content-foot foot1">Your message was sent successfully. Thanks.</div>
                                                        <div className="content-foot foot2">Validation errors occurred. Please confirm the fields and submit it again.</div>
                                                    </div>
                                                </div>
                                            </div>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
            )
        }
        function Section8Component(){
            return(
                <section id="section8">
                    <div className="container">
                        <ul className="content">
                            <li>
                                <div className="left">
                                    <ul>
                                        <li>
                                            <figure>
                                                <img src="./img/restaurant-img39.jpg" alt="" />
                                            </figure>
                                        </li>
                                        <h2><i className="fa fa-quote-left"></i></h2>
                                    </ul>
                                </div>
                                <div className="right">
                                    <ul>
                                        <li>
                                            <i className="fa fa-star"></i>
                                            <i className="fa fa-star"></i>
                                            <i className="fa fa-star"></i>
                                            <i className="fa fa-star"></i>
                                            <i className="fa fa-star"></i>
                                        </li>
                                        <li>
                                            <span>Alexander Harvard</span>
                                        </li>
                                        <li>
                                            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry’s standard dummy text. Lorem Ipsum is simply dummy text.</p>
                                        </li>
                                        <li>
                                            <i></i>
                                        </li>
                                    </ul>
                                </div>
                            </li>
                        </ul>
                    </div>
                </section>
            )
        }
        function Section9Component(){
            return(
                <section id="section9">
                    <div className="container">
                        <div className="gap">
                            <div className="title">

                                {/* { <!-- <img src="./img/tattoo-icon-bg.jpg" alt=""/> -->} */}
                                <h2>LATEST BLOG</h2>
                            </div>
                            <div className="content">
                                <ul>
                                    <li>
                                        <div className="col-gap">
                                            <div className="img-box">
                                                <img src="./img/tattoo-img-25.jpg" alt="" />
                                            </div>
                                            <div className="txt-box">
                                                <ul>
                                                    <li><a href="#">TATOO</a></li>
                                                    <li><h3><a href="#">A BEAUTIFUL WOMAN SHOULD br/EAK HER<br /> MIRROR EARLY.</a></h3></li>
                                                    <li><p>Lorem Ipsum is simply dummy text of the printing and<br /> typesetting industry. Lorem Ipsum is simply dummy text of<br /> the printing and typesetting industry. Lorem...</p></li>
                                                    <li><hr /></li>
                                                    <li><a href="#">MAY 2, 2016 </a>/ POSTED <a>BY HARESH</a></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </li>
                                    <li>
                                        <div className="col-gap">
                                            <div className="img-box">
                                                <img src="./img/tattoo-img-26.jpg" alt="" />
                                            </div>
                                            <div className="txt-box">
                                                <ul>
                                                    <li><a href="#">TATOO</a></li>
                                                    <li><h3><a href="#">THE TIME TO RELAX IS WHEN YOU DON’T<br /> HAVE TIME FOR IT.</a></h3></li>
                                                    <li><p>Lorem Ipsum is simply dummy text of the printing and<br /> typesetting industry. Lorem Ipsum is simply dummy text of<br /> the printing and typesetting industry. Lorem...</p></li>
                                                    <li><hr /></li>
                                                    <li><a href="#">MAY 2, 2016 </a>/ POSTED <a>BY HARESH</a></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </li>
                                    <li>
                                        <div className="col-gap">
                                            <div className="img-box">
                                                <img src="./img/tattoo-img-27.jpg" alt="" />
                                            </div>
                                            <div className="txt-box">
                                                <ul>
                                                    <li><a href="#">TATOO</a></li>
                                                    <li><h3><a href="#">YOUR MIND WILL ANSWER MOST<br /> QUESTIONS IF YOU LEARN TO RELAX.</a></h3></li>
                                                    <li><p>Lorem Ipsum is simply dummy text of the printing and<br /> typesetting industry. Lorem Ipsum is simply dummy text of<br /> the printing and typesetting industry. Lorem...</p></li>
                                                    <li><hr /></li>
                                                    <li><a href="#">MAY 2, 2016 </a>/ POSTED <a>BY HARESH</a></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </section>
            )   
        }
        function Section10Component(){
            return(
                <section id="section10">

                </section>
            )
        }
    function FooterComponent(){
        return(
            <footer id="footer">
                <div className="container">
                    <div className="gap">
                        <div className="content">
                            <div className="foot">
                                <a href="#"><i className="fa fa-facebook"></i></a>
                                <a href="#"><i className="fa fa-twitter"></i></a>
                                <a href="#"><i className="fa fa-dribbble"></i></a>
                                <a href="#"><i className="fa fa-youtube-play"></i></a>
                                <a href="#"><i className="fa fa-linkedin"></i></a>
                            </div>


                            <div className="foot-row2">
                                <p>&copy; 2022 br/ANDO IS PROUDLY POWERED BY THEMEZAA.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </footer>
        )
    }
    function GotopComponent(){
        return(
            <div className="gotop">
                <a href="#wrap"><i className="fa fa-angle-up"></i></a>
            </div>
      
        )
    }
ReactDOM.render(
    <WrapComponent/>,
    document.getElementById('root')
);