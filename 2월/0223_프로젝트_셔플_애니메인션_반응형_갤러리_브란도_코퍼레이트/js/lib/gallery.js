(function($, window, document){

  const gallery = {
    init(){
      this.main();
    },
    main(){
      //Element 요소 선택자
      //선택자 중복을 피하기 위해서 반드시 해당 섹션 아이디(sectionGallery)를 앞에서 표기한다.
      const galleryBtn = $('#sectionGallery .gallery-btn');
      const imgBox = $('#sectionGallery .img-box'); //갤러리 박스
      const galleryBoxUl = $('#gallery-box ul');  //갤러리 박스
      const galleryBoxUlLi = $('#gallery-box ul li'); //갤러리 목록(이미지박스)

      let n = galleryBoxUlLi.length;  //li 개수 hide 개수 show 개수
      let cols = 4;  //기본 4칸
      let rows = Math.ceil(n / cols);   //8개/4칸 = 2줄
      let winW = $(window).innerWidth();
      let imgW = winW / cols;  //창너비 / 칸수
      let imgH = imgW * 0.75;   //이미지너비 * 0.75
      let galBoxH = imgH * rows;  //갤러리박스 전체 높이 
      let btnNumber = 0; //버튼클릭시 전달되는 버튼번호
      galleryFn();

      galleryBtn.removeClass('on');
      galleryBtn.eq(btnNumber).addClass('on');

      //1. 반응형
      //2. 갤러리 함수
      //3. 갤러리 버튼 클릭 이벤트 : 버튼마다 해당 이미지 리스트가 다르다 구성

      //1. 반응형 이벤트
      // $(window).scroll()  //스크롤이 발생할때
      $(window).resize(function(e){   //크기 변경시 이벤트 발생
        galleryFn();
      })

      //2. 갤러리 함수
      function galleryFn(){

        switch(btnNumber){
          case 0:
              n=8;
              break;
          case 1:
              n=5;
              break;
          case 2:
              n=6;
              break;
          case 3:
              n=4;
              break;
          case 4:
              n=7;
              break;
          default:
        }

        console.log('갤러리 리스트 갯수',n);

        if($(window).innerWidth() >= 1200){
          cols = 4;
        }
        else if($(window).innerWidth() >= 991){
          cols = 3;
        }
        else if($(window).innerWidth() >= 768){
          cols = 2;
        }
        else{
          cols = 1;
        }

        rows = Math.ceil(n / cols);   //8개(버튼에따라변경8,5,6,4,7)/4칸 = 2줄
        winW = $(window).innerWidth();
        imgW = winW / cols;  //창너비 / 칸수
        imgH = imgW * 0.75;   //이미지너비 * 0.75
        galBoxH = imgH * rows;  //갤러리박스 전체 높이
        
        // console.log(`n ${n}`);
        // console.log(`cols ${cols}`);
        // console.log(`rows ${rows}`);
        // console.log(`winW ${winW}`);
        // console.log(`imgW ${imgW}`);
        // console.log(`imgH ${imgH}`);
        // console.log(`galBoxH ${galBoxH}`);

        //갤러리박스 높이 지정
        galleryBoxUl.css({height : galBoxH})
        galleryBoxUlLi.css({width : imgW,height : imgH})

          

          //WEB - 5개

          //스위치 케이스
          if(btnNumber === 0){  //ALL
              //줌아웃(Zoom Out) 효과 
              imgBox.removeClass('addZoom');// 줌효과 모두 초기화 삭제

              
              let k=-1;
              for(let i=0; i<rows; i++){
                for(let j=0; j<cols; j++){
                  k++;
                  galleryBoxUlLi.eq(k).stop().animate({top :imgH*i, left :imgW*j}, 300);
                }  
              }
            

             //줌인(Zoom In) 효과 
          //    galleryBoxUlLi.eq(0).find('.img-box')
          //    imgBox.eq(0).addClass('addZoom');
             
             imgBox.addClass('addZoom');




          }
          else if(btnNumber === 1){ //WEB

              imgBox.removeClass('addZoom');

              switch(cols){
                  case 4:
                    galleryBoxUlLi.eq(2).stop().animate({top :imgH*0, left :imgW*0}, 300);
                    galleryBoxUlLi.eq(3).stop().animate({top :imgH*0, left :imgW*1}, 300);           
                    galleryBoxUlLi.eq(5).stop().animate({top :imgH*0, left :imgW*2}, 300);
                    galleryBoxUlLi.eq(6).stop().animate({top :imgH*0, left :imgW*3}, 300);

                    galleryBoxUlLi.eq(7).stop().animate({top :imgH*1, left :imgW*0}, 300);
                    break;
                  case 3:
                      galleryBoxUlLi.eq(2).stop().animate({top :imgH*0, left :imgW*0}, 300);
                      galleryBoxUlLi.eq(3).stop().animate({top :imgH*0, left :imgW*1}, 300);           
                      galleryBoxUlLi.eq(5).stop().animate({top :imgH*0, left :imgW*2}, 300);

                      galleryBoxUlLi.eq(6).stop().animate({top :imgH*1, left :imgW*0}, 300);  
                      galleryBoxUlLi.eq(7).stop().animate({top :imgH*1, left :imgW*1}, 300);
                    break;
                  case 2:
                      galleryBoxUlLi.eq(2).stop().animate({top :imgH*0, left :imgW*0}, 300);
                      galleryBoxUlLi.eq(3).stop().animate({top :imgH*0, left :imgW*1}, 300);

                      galleryBoxUlLi.eq(5).stop().animate({top :imgH*1, left :imgW*0}, 300);
                      galleryBoxUlLi.eq(6).stop().animate({top :imgH*1, left :imgW*1}, 300); 

                      galleryBoxUlLi.eq(7).stop().animate({top :imgH*2, left :imgW*0}, 300);
                    break;
                  default:
                      galleryBoxUlLi.eq(2).stop().animate({top :imgH*0, left :imgW*0}, 300);
                      galleryBoxUlLi.eq(3).stop().animate({top :imgH*1, left :imgW*0}, 300); 
                      galleryBoxUlLi.eq(5).stop().animate({top :imgH*2, left :imgW*0}, 300);
                      galleryBoxUlLi.eq(6).stop().animate({top :imgH*3, left :imgW*0}, 300); 
                      galleryBoxUlLi.eq(7).stop().animate({top :imgH*4, left :imgW*0}, 300);
                    break;
                }  

              // hide
              imgBox.eq(0).removeClass('addZoom');
              imgBox.eq(1).removeClass('addZoom');
              imgBox.eq(4).removeClass('addZoom');

              imgBox.eq(2).addClass('addZoom');
              imgBox.eq(3).addClass('addZoom');
              imgBox.eq(5).addClass('addZoom');
              imgBox.eq(6).addClass('addZoom');
              imgBox.eq(7).addClass('addZoom');

          }
          else if(btnNumber === 2){  //DESIGN 0 1 3 4 6 7
            
            imgBox.removeClass('addZoom');// 줌효과 모두 초기화 삭제
            
            switch(cols){
              case 4:
                galleryBoxUlLi.eq(0).stop().animate({top :imgH*0, left :imgW*0}, 300);
                galleryBoxUlLi.eq(1).stop().animate({top :imgH*0, left :imgW*1}, 300);
                galleryBoxUlLi.eq(3).stop().animate({top :imgH*0, left :imgW*2}, 300);
                galleryBoxUlLi.eq(4).stop().animate({top :imgH*0, left :imgW*3}, 300);
      
                galleryBoxUlLi.eq(6).stop().animate({top :imgH*1, left :imgW*0}, 300);
                galleryBoxUlLi.eq(7).stop().animate({top :imgH*1, left :imgW*1}, 300);
                break;
              case 3:
                galleryBoxUlLi.eq(0).stop().animate({top :imgH*0, left :imgW*0}, 300);
                galleryBoxUlLi.eq(1).stop().animate({top :imgH*0, left :imgW*1}, 300);
                galleryBoxUlLi.eq(3).stop().animate({top :imgH*0, left :imgW*2}, 300);

                galleryBoxUlLi.eq(4).stop().animate({top :imgH*1, left :imgW*0}, 300);        
                galleryBoxUlLi.eq(6).stop().animate({top :imgH*1, left :imgW*1}, 300);
                galleryBoxUlLi.eq(7).stop().animate({top :imgH*1, left :imgW*2}, 300);
                break;
              case 2:
                galleryBoxUlLi.eq(0).stop().animate({top :imgH*0, left :imgW*0}, 300);
                galleryBoxUlLi.eq(1).stop().animate({top :imgH*0, left :imgW*1}, 300);

                galleryBoxUlLi.eq(3).stop().animate({top :imgH*1, left :imgW*0}, 300);
                galleryBoxUlLi.eq(4).stop().animate({top :imgH*1, left :imgW*1}, 300);

                galleryBoxUlLi.eq(6).stop().animate({top :imgH*2, left :imgW*0}, 300);
                galleryBoxUlLi.eq(7).stop().animate({top :imgH*2, left :imgW*1}, 300);
                break;
              default:
                galleryBoxUlLi.eq(0).stop().animate({top :imgH*0, left :imgW*0}, 300);
                galleryBoxUlLi.eq(1).stop().animate({top :imgH*1, left :imgW*0}, 300);
                galleryBoxUlLi.eq(3).stop().animate({top :imgH*2, left :imgW*0}, 300);
                galleryBoxUlLi.eq(4).stop().animate({top :imgH*3, left :imgW*0}, 300);        
                galleryBoxUlLi.eq(6).stop().animate({top :imgH*4, left :imgW*0}, 300);
                galleryBoxUlLi.eq(7).stop().animate({top :imgH*5, left :imgW*0}, 300);
                break;
            }  

            imgBox.eq(2).removeClass('addZoom'); 
            imgBox.eq(5).removeClass('addZoom');

            imgBox.eq(0).addClass('addZoom');
            imgBox.eq(1).addClass('addZoom');

            imgBox.eq(3).addClass('addZoom');
            imgBox.eq(4).addClass('addZoom');

            imgBox.eq(6).addClass('addZoom');
            imgBox.eq(7).addClass('addZoom');

          }
          else if(btnNumber === 3){  //BRANDING
            
            imgBox.removeClass('addZoom');// 줌효과 모두 초기화 삭제
            
            switch(cols){
              case 4:
                galleryBoxUlLi.eq(0).stop().animate({top :imgH*0, left :imgW*0}, 300);
                galleryBoxUlLi.eq(2).stop().animate({top :imgH*0, left :imgW*1}, 300);    
                galleryBoxUlLi.eq(4).stop().animate({top :imgH*0, left :imgW*2}, 300);
                galleryBoxUlLi.eq(6).stop().animate({top :imgH*0, left :imgW*3}, 300);
                break;
              case 3:
                galleryBoxUlLi.eq(0).stop().animate({top :imgH*0, left :imgW*0}, 300);
                galleryBoxUlLi.eq(2).stop().animate({top :imgH*0, left :imgW*1}, 300);    
                galleryBoxUlLi.eq(4).stop().animate({top :imgH*0, left :imgW*2}, 300);

                galleryBoxUlLi.eq(6).stop().animate({top :imgH*1, left :imgW*0}, 300);
                break;
              case 2:
                galleryBoxUlLi.eq(0).stop().animate({top :imgH*0, left :imgW*0}, 300);
                galleryBoxUlLi.eq(2).stop().animate({top :imgH*0, left :imgW*1}, 300);  

                galleryBoxUlLi.eq(4).stop().animate({top :imgH*1, left :imgW*0}, 300);
                galleryBoxUlLi.eq(6).stop().animate({top :imgH*1, left :imgW*1}, 300);
                break;
              default:
                galleryBoxUlLi.eq(0).stop().animate({top :imgH*0, left :imgW*0}, 300);
                galleryBoxUlLi.eq(2).stop().animate({top :imgH*1, left :imgW*0}, 300);    
                galleryBoxUlLi.eq(4).stop().animate({top :imgH*2, left :imgW*0}, 300);
                galleryBoxUlLi.eq(6).stop().animate({top :imgH*3, left :imgW*0}, 300);
                break;
            }  
             //줌인(Zoom In) 효과 
          //    galleryBoxUlLi.eq(0).find('.img-box')
          //    imgBox.eq(0).addClass('addZoom');

            imgBox.eq(7).removeClass('addZoom');
            imgBox.eq(5).removeClass('addZoom'); 
            imgBox.eq(3).removeClass('addZoom');
            imgBox.eq(1).removeClass('addZoom');

            imgBox.eq(0).addClass('addZoom');
            imgBox.eq(2).addClass('addZoom');
            imgBox.eq(4).addClass('addZoom');
            imgBox.eq(6).addClass('addZoom');


          }
          else if(btnNumber === 4){  //ADVERTISING
        
            imgBox.removeClass('addZoom');// 줌효과 모두 초기화 삭제
            
            switch(cols){
              case 4:
                galleryBoxUlLi.eq(0).stop().animate({top :imgH*0, left :imgW*0}, 300);
                galleryBoxUlLi.eq(1).stop().animate({top :imgH*0, left :imgW*1}, 300);
                galleryBoxUlLi.eq(2).stop().animate({top :imgH*0, left :imgW*2}, 300);
                galleryBoxUlLi.eq(3).stop().animate({top :imgH*0, left :imgW*3}, 300);  

                galleryBoxUlLi.eq(4).stop().animate({top :imgH*1, left :imgW*0}, 300);
                galleryBoxUlLi.eq(5).stop().animate({top :imgH*1, left :imgW*1}, 300);
                galleryBoxUlLi.eq(7).stop().animate({top :imgH*1, left :imgW*2}, 300);
                break;
              case 3:
                galleryBoxUlLi.eq(0).stop().animate({top :imgH*0, left :imgW*0}, 300);
                galleryBoxUlLi.eq(1).stop().animate({top :imgH*0, left :imgW*1}, 300);
                galleryBoxUlLi.eq(2).stop().animate({top :imgH*0, left :imgW*2}, 300);

                galleryBoxUlLi.eq(3).stop().animate({top :imgH*1, left :imgW*0}, 300);  
                galleryBoxUlLi.eq(4).stop().animate({top :imgH*1, left :imgW*1}, 300);
                galleryBoxUlLi.eq(5).stop().animate({top :imgH*1, left :imgW*2}, 300);

                galleryBoxUlLi.eq(7).stop().animate({top :imgH*2, left :imgW*0}, 300);
                break;
              case 2:
                galleryBoxUlLi.eq(0).stop().animate({top :imgH*0, left :imgW*0}, 300);
                galleryBoxUlLi.eq(1).stop().animate({top :imgH*0, left :imgW*1}, 300);

                galleryBoxUlLi.eq(2).stop().animate({top :imgH*1, left :imgW*0}, 300);
                galleryBoxUlLi.eq(3).stop().animate({top :imgH*1, left :imgW*1}, 300);  

                galleryBoxUlLi.eq(4).stop().animate({top :imgH*2, left :imgW*0}, 300);
                galleryBoxUlLi.eq(5).stop().animate({top :imgH*2, left :imgW*1}, 300);

                galleryBoxUlLi.eq(7).stop().animate({top :imgH*3, left :imgW*0}, 300);
                break;
              default:
                galleryBoxUlLi.eq(0).stop().animate({top :imgH*0, left :imgW*0}, 300);
                galleryBoxUlLi.eq(1).stop().animate({top :imgH*1, left :imgW*0}, 300);
                galleryBoxUlLi.eq(2).stop().animate({top :imgH*2, left :imgW*0}, 300);
                galleryBoxUlLi.eq(3).stop().animate({top :imgH*3, left :imgW*0}, 300);  
                galleryBoxUlLi.eq(4).stop().animate({top :imgH*4, left :imgW*0}, 300);
                galleryBoxUlLi.eq(5).stop().animate({top :imgH*5, left :imgW*0}, 300);
                galleryBoxUlLi.eq(7).stop().animate({top :imgH*6, left :imgW*0}, 300);
                break;
            }  
             //줌인(Zoom In) 효과 
          //    galleryBoxUlLi.eq(0).find('.img-box')
          //    imgBox.eq(0).addClass('addZoom');

            imgBox.eq(6).removeClass('addZoom');
             
             imgBox.eq(0).addClass('addZoom');
             imgBox.eq(1).addClass('addZoom');
             imgBox.eq(2).addClass('addZoom');
             imgBox.eq(3).addClass('addZoom');
             imgBox.eq(4).addClass('addZoom');
             imgBox.eq(5).addClass('addZoom');
             imgBox.eq(7).addClass('addZoom');


          }



      }

      //3. 갤러리 버튼 클릭 이벤트
      galleryBtn.each(function(idx){
        $(this).on({
          click(e){
            e.preventDefault();
            galleryBtn.removeClass('on');
            $(this).addClass('on');
            btnNumber = idx;
            galleryFn();
          }
        })
      })

    }
  }
  gallery.init();

})(jQuery, window, document);