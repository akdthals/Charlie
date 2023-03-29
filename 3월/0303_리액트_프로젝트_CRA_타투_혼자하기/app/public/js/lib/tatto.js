(function($, window, document){ // 내부변수



    const tatto = {
        init(){
            this.header();
            this.section1();
            // this.section8();

        },
        header(){



            let newScroll = $(window).scrollTop();  // 새로운 스크롤값
            let oldScroll = newScroll;              // 이전 스크롤값   

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


            }); // 스크롤값이 변경되면 동작
            


    
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


        },
        section1(){
            let cnt = 0;
            let setId = 0; // 메모리에 할당된 인덱 번호를 저장한다.

            // 1. 메인슬라이드함수 
            function mainSlide(){

                $('.slide-wrap').stop().animate({left: `${-100*cnt}%` }, 1000,'easeInOutExpo', function(){
                    if(cnt > 2) cnt=0;  // 슬라이드 3개 0 1 2 
                    if(cnt < 0) cnt=2;  // 첫번째 왼쪽으로 이동하면 마지막 슬라이드 
                    $('.slide-wrap').stop().animate({left: `${-100*cnt}%` }, 0); // 처음으로 리턴
                });


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
                // nextCount(); //즉시실행
                setId = setInterval(nextCount, 4000);  // 다음카운트함수 3초간격으로 호출하기

            }
            autoTimer(); // 로딩시 실행

            function stopTimer(){
                clearInterval(setId);
            }

            let touchStart = 0;
            let touchEnd = 0;
            let mouseDown = false; // 마우드 다운하면 true 아니면 false
            let dragStart = 0;
            let dragEnd = 0;
            let winWidth =  $(window).innerWidth();

            // 데스크탑
            $('#section1').on({
                mousedown(e){
                    winWidth =  $(window).innerWidth();
                    // clearInterval(setId);
                    clearInterval(setId);
                    stopTimer();
                    mouseDown=true; //마우스 다운 알림
                    touchStart = e.clientX;
                    dragStart = e.clientX - $('.slide-wrap').offset().left-winWidth;
                },
                mouseup(e){
                    touchEnd = e.clientX;                    
                    if( touchStart-touchEnd > 0 ){
                        if( !$('.slide-wrap').is(':animated') ){
                            nextCount();
                        }
                    }
                    if( touchStart-touchEnd < 0 ){
                        if( !$('.slide-wrap').is(':animated') ){
                            prevCount();
                        }
                    }
                    mouseDown=false; //마우스 드래그 끝났다 마우스 업이다.                    
                },
                mousemove(e){  //마우스 방향에 따라다닌다.
                    if(mouseDown!==true) return;

                    dragEnd = e.clientX;
                 

                    $('.slide-wrap').css({left: dragEnd-dragStart });
                }
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





        },
        // section8(){
        //     let cnt = 0;
        //     let setId = 0; // 메모리에 할당된 인덱 번호를 저장한다.

        //     // 1. 메인슬라이드함수 
        //     function mainSlide(){

        //         $('.slide-wrap').stop().animate({left: `${-100*cnt}%` }, 1000,'easeInOutExpo', function(){
        //             if(cnt > 2) cnt=0;  // 슬라이드 3개 0 1 2 
        //             if(cnt < 0) cnt=2;  // 첫번째 왼쪽으로 이동하면 마지막 슬라이드 
        //             $('.slide-wrap').stop().animate({left: `${-100*cnt}%` }, 0); // 처음으로 리턴
        //         });


        //         pageNation();

        //     }

        //     // 2-1. 다음카운트함수
        //     function nextCount(){
                
        //         cnt++;
        //         // console.log(cnt);
        //         mainSlide();
        //     }
        //     // 2-2. 이전카운트함수
        //     function prevCount(){
        //         cnt--;
        //         mainSlide();
        //     }

        //     // 3. 자동타이머함수
        //     function autoTimer(){
        //         // nextCount(); //즉시실행
        //         setId = setInterval(nextCount, 4000);  // 다음카운트함수 3초간격으로 호출하기
        //         // console.log( setId ); // 메모리 할당된 인덱번호 확인하기
        //     }
        //     autoTimer(); // 로딩시 실행

        //     $('.arrow-next-btn').on({
                
        //         mouseenter(){
        //             clearInterval(setId);                    
        //         },
        //         mouseleave(){
        //             autoTimer();
        //         },
        //         click(e){
        //             e.preventDefault();
        //             // 슬라이드 랩퍼 박스가 애니메이션이 진행 중 아니면 다음슬라이드 호출
        //             if( !$('#section8.slide-wrap').is(':animated') ){
        //                 nextCount(); // 다음 슬라이드
        //             }
                        
        //         }
        //     });
            
        //     $('.arrow-prev-btn').on({
        //         mouseenter(){
        //             clearInterval(setId);                    
        //         },
        //         mouseleave(){
        //             autoTimer();
        //         },
        //         click(){
        //             // 슬라이드 랩퍼 박스가 애니메이션이 진행 중 아니면 이전슬라이드 호출
        //             if( !$('.slide-wrap').is(':animated') ){
        //                 prevCount(); // 이전 슬라이드
        //             }
        //         }
        //     });

        //     let touchStart = 0;
        //     let touchEnd = 0;
        //     let mouseDown = false; // 마우드 다운하면 true 아니면 false
        //     let dragStart = 0;
        //     let dragEnd = 0;
        //     let winWidth =  $(window).innerWidth();

        //     // 데스크탑
        //     $('#section8').on({
        //         mousedown(e){
        //             winWidth =  $(window).innerWidth();
        //             clearInterval(setId);
        //             mouseDown=true; //마우스 다운 알림
        //             touchStart = e.clientX;
        //             dragStart = e.clientX - $('.slide-wrap').offset().left-winWidth;
        //         },
        //         mouseup(e){
        //             touchEnd = e.clientX;                    
        //             if( touchStart-touchEnd > 0 ){
        //                 if( !$('.slide-wrap').is(':animated') ){
        //                     nextCount();
        //                 }
        //             }
        //             if( touchStart-touchEnd < 0 ){
        //                 if( !$('.slide-wrap').is(':animated') ){
        //                     prevCount();
        //                 }
        //             }
        //             mouseDown=false; //마우스 드래그 끝났다 마우스 업이다.                    
        //         },
        //         mousemove(e){  //마우스 방향에 따라다닌다.
        //             if(mouseDown!==true) return;

        //             dragEnd = e.clientX;
        //             console.log( dragEnd-dragStart );

        //             $('.slide-wrap').css({left: dragEnd-dragStart });
        //         }
        //     });


        //     // 6. 태블릿, 모바일 손가락으로 터치
        //     $('#section8').on({
        //         touchstart(e){ //mousedown
        //             winWidth =  $(window).innerWidth();
        //             clearInterval(setId);
        //             mouseDown=true; //마우스 다운 알림
        //             console.log(  e );
        //             touchStart = e.originalEvent.changedTouches[0].clientX;
        //             dragStart = e.originalEvent.changedTouches[0].clientX - $('.slide-wrap').offset().left-winWidth;
        //         },
        //         touchend(e){ //mouseup
        //             touchEnd = e.originalEvent.changedTouches[0].clientX;                    
        //             if( touchStart-touchEnd > 0 ){
        //                 if( !$('.slide-wrap').is(':animated') ){
        //                     nextCount();
        //                 }
        //             }
        //             if( touchStart-touchEnd < 0 ){
        //                 if( !$('.slide-wrap').is(':animated') ){
        //                     prevCount();
        //                 }
        //             }
        //             mouseDown=false; //마우스 드래그 끝났다 마우스 업이다.    
        //         },
        //         touchmove(e){  //mousemove
        //             if(mouseDown!==true) return;
  
        //             dragEnd = e.originalEvent.changedTouches[0].clientX;

        //             $('.slide-wrap').css({left: dragEnd-dragStart });
        //         }
        //     });


        //     // 7. 페이지 네이션 함수 ==> 메인슬라이드 함수
        //     function pageNation(){
        //         // console.log( cnt===3 ? 0 : cnt );
        //         // console.log( cnt>2 ? 0 : cnt );
        //         $('.page-btn').removeClass('on');       // 페이지버튼 모두 클래스 삭제
        //         $('.page-btn').eq( cnt>2 ? 0 : cnt ).addClass('on');  // 현재슬라이드 번호 클래스 추가
        //     }
            
            
        //     $('.page-btn').each(function(idx){
        //         $(this).on({
        //             click(e){
        //                 e.preventDefault();
        //                 clearInterval(setId);
        //                 cnt = idx; // cnt 전역변수 값이 수정
        //                 mainSlide();
        //             }
        //         });
        //     });


        // }
        
        
    }

    tatto.init(); 

})(jQuery, window, document);  



