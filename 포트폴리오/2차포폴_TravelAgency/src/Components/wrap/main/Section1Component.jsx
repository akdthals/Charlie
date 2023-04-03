import React from 'react';
import $ from'jquery'

export default function Section1Component() {
    React.useEffect(()=>{
        
          
                let cnt=0;
                let setId = 0; // 메모리에 할당된 인덱스 번호를 저장한다.
    
                // 1. 메인슬라이드함수
                function mainSlide(){
                    $('.slide-wrap').stop().animate({left: `${-100*cnt}%`},1000,/* 'easeInExpo', */()=>{
                        if(cnt > 2)cnt=0; // 슬라이드 3개 0 1 2
                        if(cnt < 0)cnt=2;
                        $('.slide-wrap').stop().animate({left: `${-100*cnt}%`},0);
                    });
    
                    // 슬라이드박스 좌표 구하기
                    // console.log($('.slide-wrap').offset().left);
    
                    pageNation();
                }
                // 2-1. 다음카운트함수
                function nextCount(){
                    cnt++;
                    mainSlide();
                }
                // 2-2. 이전카운트함수
                function prevCount(){
                    cnt--;
                    mainSlide();
                }
    
                // 3. 자동타이머함수
                function autoTimer(){
                    setId = setInterval(nextCount, 4000);
                    console.log(setId);
                }
                autoTimer(); 
                let touchStart = 0;
                let touchEnd = 0;
                let mouseDown = false; // 마우스 다운 하면 true 아니면 false
                let dragStart = 0;
                let dragEnd = 0;
                let winWidth = $(window).innerWidth();
                let slideContainer = $('#section1 .slide-container').innerWidth();
    
                // 데스크탑
                $('#section1').on({
                    mousedown(e){
                        slideContainer = $('#section1 .slide-container').innerWidth();
                        
                        winWidth = $(window).innerWidth();
                        clearInterval(setId);
                        // console.log('마우스다운'); // 터치 끝
                        // console.log(event);
                        // console.log(event.clientX);
                        mouseDown=true; // 마우스 다운 알림
                        touchStart = e.clientX;
                        dragStart = e.clientX - $('.slide-wrap').offset().left-((winWidth-slideContainer)/2).right -((winWidth-slideContainer)/2);
                    },
                    mouseup(e){
                        // console.log('마우스업'); // 터치 끝
                        // console.log(event);
                        // console.log(event.clientX);
                        touchEnd = e.clientX;
                        // console.log(touchStart-touchEnd); //터치시작좌표-터치끝좌표
                        if(touchStart-touchEnd > 0){
                            if(!$('.slide-wrap').is(':animated')){
                                nextCount();
                            }
                            
                        }
                        if(touchStart-touchEnd < 0){
                            if(!$('.slide-wrap').is(':animated')){
                                prevCount();
                            }
                        }
                        mouseDown=false; // 마우스 다운 알림
                        autoTimer();
                    },
                    mousemove(e){ //마우스 방향에 따라다닌다.
                        if(mouseDown!==true)return;
    
                        console.log(e.clientX);
                        
                        // 마우스가 다운되면 그 때 부터 따라다녀라
                        // 마우스다운할 때 변수에 다운상태를 저장한다.
                        // 만약 마우스 다운이 다운상태가 아니면 마우스 무브는 취소해라
                        dragEnd = e.clientX;
                        $('.slide-wrap').css({left: dragEnd-dragStart});
                        
                    }
                    
                });
    
                // 모바일
                $('#section1').on({
                    touchstart(e){
                        winWidth = $(window).innerWidth();
                        clearInterval(setId);
                        // console.log('마우스다운'); // 터치 끝
                        // console.log(event);
                        // console.log(event.clientX);
                        mouseDown=true; // 마우스 다운 알림
                        touchStart = e.originalEvent.changedTouches[0].clientX;
                        dragStart = e.originalEvent.changedTouches[0].clientX - $('.slide-wrap').offset().left-winWidth;
                        console.log('손가락 터치시작',e.originalEvent.changedTouches[0].clientX);
                    },
                    touchend(e){
                        // console.log('마우스업'); // 터치 끝
                        // console.log(event);
                        // console.log(event.clientX);
                        touchEnd = e.originalEvent.changedTouches[0].clientX;
                        // console.log(touchStart-touchEnd); //터치시작좌표-터치끝좌표
                        if(touchStart-touchEnd > 0){
                            if(!$('.slide-wrap').is(':animated')){
                                nextCount();
                            }
                            
                        }
                        if(touchStart-touchEnd < 0){
                            if(!$('.slide-wrap').is(':animated')){
                                prevCount();
                            }
                        }
                        mouseDown=false; // 마우스 다운 알림
                        autoTimer(); 
                        console.log('손가락 터치끝');
                    },
                    touchmove(e){ //마우스 방향에 따라다닌다.
                        if(mouseDown!==true)return;
    
                        console.log(e.originalEvent.changedTouches[0].clientX);
                        
                        // 마우스가 다운되면 그 때 부터 따라다녀라
                        // 마우스다운할 때 변수에 다운상태를 저장한다.
                        // 만약 마우스 다운이 다운상태가 아니면 마우스 무브는 취소해라
                        dragEnd = e.originalEvent.changedTouches[0].clientX;
                        $('.slide-wrap').css({left: dragEnd-dragStart});
                        
                    }
                });
    
                function page(){
                    console.log( cnt>2 ? 0 : cnt );
                    $('.page-btn').removeClass('on');
                    $('.page-btn').eq(cnt>2 ? 0 : cnt).addClass('on');
                }
    
                $('.page-btn').each(function(idx){
                    $(this).on({
                        click(e){
                            e.preventDefault();
                            cnt=idx;
                            mainSlide();
                        }
                    });
                });
                
                
    
            
            
            function pageNation(){
            
                $('.page-btn').removeClass('on');       // 페이지버튼 모두 클래스 삭제
                $('.page-btn').eq( cnt>2 ? 0 : cnt ).addClass('on');  // 현재슬라이드 번호 클래스 추가
            }
            
            
            $('.page-btn').each(function(idx){
                $(this).on({
                    click(e){
                        e.preventDefault();
                        clearInterval(setId);
                        cnt = idx; // cnt 전역변수 값이 수정
                        mainSlide();
                        
                    }
                });
            });
            



    })
       
    
    return (
        <div id='section1'>
            <div className="container">
                <div className="slide-container">
                    <div className="slide-view">
                        <ul className="slide-wrap">
                            <li className='slide slide3'>
                                <div>
                                    <h1>Best Destinations  <br/>
                                    For Summer
                                    </h1>
                                    <h4>Starting From  <span>$1550</span></h4>
                                </div>
                            </li>
                            <li className='slide slide1'>
                                <div>
                                    <h1>Let's Discover The <br/>
                                        World Together
                                    </h1>
                                    <h4>Starting From <span>$2800</span></h4>
                                </div>
                            </li>
                            <li className='slide slide2'>
                                <div>
                                    <h1>Enjoy our  <br/>
                                    lovely vacation.
                                    </h1>
                                    <h4>Starting From  <span>$1950</span></h4>
                                </div>
                            </li>
                            <li className='slide slide3'>
                                <div>
                                    <h1>Best Destinations  <br/>
                                    For Summer
                                    </h1>
                                    <h4>Starting From  <span>$1550</span></h4>
                                </div>
                            </li>
                            <li className='slide slide1'>
                                <div>
                                    <h1>Let's Discover The <br/>
                                        World Together
                                    </h1>
                                    <h4>Starting From <span>$2800</span></h4>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
                <a href="!#" class="arrow-next-btn"><i></i></a>
                <a href="!#" class="arrow-prev-btn"><i></i></a>
            <div class="page-btn-box">
                    <span><a href="!#" class="page-btn blind on">페이지1</a></span>
                    <span><a href="!#" class="page-btn blind">페이지2</a></span>
                    <span><a href="!#" class="page-btn blind">페이지3</a></span>    
            </div>
            </div>
            
        </div>
        
    );
}



