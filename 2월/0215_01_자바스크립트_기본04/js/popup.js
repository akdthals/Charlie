
(function popup(){  //함수 안에서 아숑되는 변수 지역(Local) 변수
           
    //window.open('팝업.html','창이름','너비=500, 높이=600, X측좌표=0, Y측좌표=0');
    
    const windowName = 'popup_20230215';
    const windowName2 = 'popup_20230216';
    const popupWidth = 530;  //변수에 값을 대입하면서 선언시는 const 지정가능하다.
    const popupHeight = 570;
    const popupLeft = 0;
    const popupTop = 0;
    const popupLeft2 = 200;
    const popupTop2= 200;

   

    window.open('./popup.html',windowName,`width=${popupWidth},height=${popupHeight},left=${popupLeft},top=${popupTop}`)
    window.open('./popup2.html',windowName2,`width=${popupWidth},height=${popupHeight},left=${popupLeft2},top=${popupTop2}`)

 }); //즉시실행함수 곧바로 호출 안됨 () 있어야 가능
 //})(); //즉시실행함수 곧바로 호출 즉시표현함수식
 (function(){

 })();
 