import React from 'react';

export default function HeaderComponent () {
    return (
        <>
        <header id='header'>
            <div className="container">
                <div className="gap">
                    <div className="content">
                        <div className="container">
                            <div className="row1">
                                <div className="container">
                                    <ul>
                                        <li><a href="회원가입" title='회원가입'>회원가입</a></li>
                                        <li><i>|</i></li>
                                        <li><a href="로그인" title='로그인'>로그인</a></li>
                                        <li><i>|</i></li>
                                        <li><a href="고객센터" title='고객센터'>고객센터</a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                            <div className="row2">
                                <div className="container">
                                    <div className="left">
                                        <div>
                                            <img src="./img/logo.svg" alt="" />
                                            <span><a href="">마켓컬리</a></span>
                                            <span><i>|</i></span>
                                            <span><a href="">뷰티컬리</a></span>
                                        </div>
                                    </div>
                                    <div className="center">
                                        <div>
                                            <input type="text" name='' id='' placeholder='검색어를 입력하세요' />
                                            <a href=""><img src="./img/serch.svg" alt="" /></a>
                                        </div>
                                    </div>
                                    <div className="right">
                                        <span><img src="./img/map.svg" alt="" /></span>
                                        <span><img src="./img/heart.svg" alt="" /></span>
                                        <span><img src="./img/kart.svg" alt="" /></span>
                                    </div>
                                </div>
                            </div>
                            <div className="row3">
                                <di className="container">
                                    <div className="left">
                                        <a href=""><img src="./img/ham.svg" alt="" /><span>카테고리</span></a>
                                    </div>
                                    <div className="center">
                                        <ul>
                                            <li><a href="">신상품</a></li>
                                            <li><a href="">베스트</a></li>
                                            <li><a href="">알뜰쇼핑</a></li>
                                            <li><a href="">특가/혜택</a></li>
                                        </ul>
                                    </div>
                                    <div className="right">
                                            <a href="">샛별・택배<span>배송안내</span></a>
                                    </div>
                                </di>
                            </div>
                    </div>
                </div>
            </div>
        </header>
        </>
    );
};

