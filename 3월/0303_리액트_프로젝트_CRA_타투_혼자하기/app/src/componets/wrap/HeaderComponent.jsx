import React from 'react';

function HeaderComponent () {
    return (
        <header id="header">
            <div class="container">
                <div class="gap">
                    <div class="content">
                        <div class="logo">
                            <h1><a href="#wrap"><img src="./img/logo-tattoo.png" alt="" /></a></h1>
                        </div>
                        <div class="nav">
                            <ul>
                                <li><a href="#section2" class="main-btn">ABOUT</a></li>
                                <li><a href="#section3" class="main-btn">SERVICES</a></li>
                                <li><a href="#section4" class="main-btn">ARTISTS</a></li>
                                <li><a href="#section5" class="main-btn">PORTFOLIO</a></li>
                                <li><a href="#section6" class="main-btn">PACKAGE</a></li>
                                <li><a href="#section9" class="main-btn">BLOG</a></li>
                                <li><a href="#section10" class="main-btn">CONTACT</a></li>
                            </ul>
                        </div>
                    </div>
                    <div id="mobileNav">
                        <a href="!#" class="mobile-btn">
                            <i class="line line1"></i>
                            <i class="line line2"></i>
                            <i class="line line3"></i>
                        </a>
                    </div>
                </div>
            </div>
        </header>
    );
};

export default HeaderComponent;