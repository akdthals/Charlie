// $(function(){ //제이쿼리 선언문 => $ 사인이 제이쿼리 라이브러리와 충돌성 있다.
//     console.log( $ );
// });


(function($){ //내부변수
    
    //객체 생성 : 변수의 중복을 피한다.
    const wedding = {
        init(){
            this.header();
            this.section1();
            this.section2();
            this.section3();
            
        },
        header(){
    
            //로딩시 바로가기 메뉴의 포지션 탑ㄱ밧을 가져오기
            console.log($('#section6').offset().top ); // top 값 공책에 적기 top,left
            console.log($('#section6').offset().left ); // left 값
        
    
            // 메인버튼 클릭 이벤트: 스무스 스크롤링 이벤트
            $('.main-btn').on({
                click(){
                  /*   attribute 어트리뷰트 속성 포로퍼티 */
                  /*   console.log($(this).attr('href') ) */
                    let pos=$(this).attr('href') ;
                    $('html,body').animate({scrollTop: $( $(this).attr('href') ).offset().top}, 600);
                }
            });
    
    
    
    
    
    
    
    
    
    
            //모바일 버튼 이벤트
            // 모바일 메뉴 햄버거 메뉴 클릭 이벤트  
            //클릭하면
            //이 버튼 안에 자식요소에서 line 클래스를 찾아서 find ('.line')
             // on 클래스 추가 (addClass('on'))
    
            
            // $('.mobile-btn').on({
            //     click(){
            //         // $(this).find('.line').addClass('on');
            //         // $(this).find('.line').removeClass('on');
            //         $(this).find('.line').toggleClass('on');
            //     }
            // });
    
    
            // $('.moblie-btn').on({
            //     click(){
            //         alert('자바')
            //     }
            // });
    
    
            // '7' == 7 true 등호2개는 같다고 나온다.
            // '7' === 7 false 등호3개는 다르다고 출력
    
            let t = false;  //토글 구현: 스위치 교환
            $('.mobile-btn').on({
                click(){
                    if(t===false){ //t가 false이면 true로 변환
                        t=true;
                        $(this).find('.line').addClass('on');
                    }
                    else{ //t가 true이면 false 로 변환
                        t=false;
                        $(this).find('.line').removeClass('on');
                    }
    
                }
            });
    
    
        },
        section1(){
            let cnt=0;

          function mainSlide(){
            $('.slide-wrap').stop().animate({left: `${-100*cnt}%`},1000,'easeOutCubic',function(){
                if(cnt===3)cnt=0;
                $('.slide-wrap').stop().animate({left: `${-100*cnt}%`},0);
            });

          }
          function NextCount(){
            cnt++;
            mainSlide();

          }
          function autoTimer(){
            setInterval(NextCount,3000);
          }
          autoTimer();
    
        },
        section2(){
           
        },
        section3(){
           
        }
       
    
    }
    
    
    wedding.init();
    
    })(jQuery); //즉시 실행 함수 IIFE
    
    
    // (function(){
    //     alert('즉시 실행 함수');
    // })();
    
    
    