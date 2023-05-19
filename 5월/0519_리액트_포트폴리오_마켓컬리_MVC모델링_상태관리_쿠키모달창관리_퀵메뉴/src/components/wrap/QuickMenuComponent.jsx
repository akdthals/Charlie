import React from 'react';
import './scss/quick_menu.scss';
import $ from 'jquery';
import deliveryInfo from'./img/quick_menu/deliveryInfo.png'



export default function QuickMenuComponent() {
    const [state, setState] = React.useState({
        isFixed : false
    });
    // 스크롤 이벤트 동작 시 스크롤탑 값이 섹션1의 탑값에 도달하면 
    // fixed로 구현 한다.
    React.useEffect(()=>{
       let sec1Top =  $('#section1').offset().top+50;
       let isFixed = false;

        $(window).scroll(function(){
          
            if($(window).scrollTop()>= sec1Top){
                isFixed = true;
            }
            else{
                isFixed = false;
            }
            setState({
                ...state,
                isFixed:isFixed
            })
        });
        
        
    },[])

    return (
        <div id='quickMenu' className={state.isFixed? ` on` : ''}>
            <ul>
                <li>
                    <a href="!#">
                        <img src={deliveryInfo} alt="" />
                    </a>
                </li>
                <li>
                    <span><a href="!#">등급별혜택</a></span>
                    <span><a href="!#">레시피</a></span>
                </li>
                <li>
                    <span><a href="!#">등급별혜택</a></span>
                    <h3>최근 본 상품</h3>
                    <ul>
                        <li></li>
                        <li></li>
                        <li></li>
                        <li></li>
                    </ul>
                    <span><a href="!#"><img src="./scss/quick_menu.scss/icon_arrow_up.svg" alt="" />레시피</a></span>
                </li>
            </ul>
            <h1>퀵메뉴</h1>                
        </div>
    );
};