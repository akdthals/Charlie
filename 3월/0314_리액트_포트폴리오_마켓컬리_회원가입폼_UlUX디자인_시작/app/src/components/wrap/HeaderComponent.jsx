import React from 'react';
import {Link, Outlet} from 'react-router-dom'
import $ from 'jQuery';


export default function HeaderComponent () {

  React.useEffect(()=>{
    console.log( $ );
    // 헤더영역에 .row3 위에서 .row3 offset().top 포지션 스크롤탑값이 도달시 
    // .row2, .row3 에 on 클래스를 추가해라
    const row3Top = $('#header .row3').offset().top;

    $(window).scroll(function(){

      if($(window).scrollTop()>=row3Top){
        $('#header .row2, #header . row3').addClass ('on');
      }
      else{
        $('#header .row2, #header . row3').removeClass ('on');
      }


    });

  },[]);




  return (
    <>
      <header id="header">
        <div className="container">
          <div className="gap">
            <div className="content">
              <div className="row1">
                <div className="container">
                  <ul>
                    <li><Link to="/회원가입" title='회원가입'>회원가입</Link></li>
                    <li><i>|</i></li>
                    <li><Link to="/로그인" title='로그인'>로그인</Link></li>
                    <li><i>|</i></li>
                    <li><Link to="/고객센터" title='고객센터'>고객센터</Link></li>
                  </ul>
                </div>
              </div>
              <div className="row2 ">
                <div className="container">
                  <div className="left">
                    <h1>
                      <img src="./img/logo.svg" alt="" />
                      <span><Link to="/">마켓컬리</Link></span>
                      <span><i>|</i></span>
                      <span><Link to="/뷰티컬리">뷰티컬리</Link></span>
                    </h1>
                  </div>
                  <div className="center">
                    <div>
                      <input type="text" name='' id='' placeholder='검색어를 입력해주세요' />
                      <a href="!#"><img src="./img/search.svg" alt="" /></a>
                    </div>
                  </div>
                  <div className="right">
                    <span><Link to=''><img src="./img/map.svg" alt="" /></Link></span>
                    <span><Link to=''><img src="./img/heart.svg" alt="" /></Link></span>
                    <span><Link to=''><img src="./img/cart.svg" alt="" /></Link></span>
                  </div>
                </div>
              </div>
              <nav className="row3 ">
                <div className="container">
                  <div className="left">
                    <Link to="#"><img src="./img/ham.svg" alt="" /><span>카테고리</span></Link>
                  </div>
                  <div className="center">
                    <ul>
                      <li><Link to='#'>신상품</Link></li>
                      <li><Link to='#'>베스트</Link></li>
                      <li><Link to='#'>알뜰쇼핑</Link></li>
                      <li><Link to='#'>특가/혜택</Link></li>
                    </ul>
                  </div>
                  <div className="right">
                    <Link to="#"><span>샛별・택배</span>배송안내</Link>
                  </div>
                </div>
              </nav>
            </div>
          </div>
        </div>
      </header>
      {/* // 링크페이지 노출될 서브페이지 장소 */}
      <Outlet />
    </>
  );
};

