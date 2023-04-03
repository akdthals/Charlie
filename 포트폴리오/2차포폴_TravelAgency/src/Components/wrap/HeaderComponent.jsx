import React from 'react';
import $ from 'jquery'

export default function HeaderComponent () {
    React.useEffect(()=>{
        let newScroll = $(window).scrollTop();  
        let oldScroll = newScroll;               

        $(window).scroll(function(e){
            
            newScroll = $(window).scrollTop();

               if(newScroll-oldScroll > 0 ){
                    $('#header').addClass('on');
                    $('#header').removeClass('off');
               }
               if(newScroll-oldScroll < 0){
                    $('#header').addClass('off');
                    $('#header').removeClass('on');
               }
                

            oldScroll = newScroll;

        }); 
        

        $('.main-btn').on({
            click(){
                let pos = $(this).attr('href');
                
                $('html,body').animate({ scrollTop: $( pos ).offset().top }, 500);
            }
        });

 
        $('.mobile-btn').on({
            click(){
                $(this).find('.line').toggleClass('on');
            }
        }); 
    })

    return (
        <header id='header'>
            <div className="container">
                <div className="gap">
                    <div className="content">
                        <div className="left-box">
                            <a href="!#"><img src="./img/logo-white.png" alt="" /></a> 
                        </div>
                        <div className="right-box">
                            <ul>
                                <li><a href="#section1">HOME</a></li>
                                <li><a href="#section3">ABOUT</a></li>
                                <li><a href="#section5">PACKAGES</a></li>
                                <li><a href="#section8">SPECIAL OFFERS</a></li>
                                <li><a href="#section9">BLOG</a></li>
                                <li><a href="#section11">CONTACT</a></li>
                                <li><a href="https://hcode.themezaa.com/home-main/">DEMOS</a></li>
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

}
    


