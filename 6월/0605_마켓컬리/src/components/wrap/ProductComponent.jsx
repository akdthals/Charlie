import React from 'react';
import viewProductImg from './img/product/0a54f6a4-4f5a-4202-8f6d-045d2a1709de.jpg'
import iconHeart from './img/product/icon_heart.svg'
import iconBell from './img/product/icon_bell.svg'
import './scss/product.scss'


export default function ProductComponent  ({key}) {


    const [cnt, setCnt] = React.useState(1)

    const [state, setState] = React.usetState({
        상품: {}
    })

    const {상품} = state;

    // 개수 증가 함수
    const onClickAdd=(e)=>{
        e.preventDefault();
        setCnt(cnt+1)
    }

    // 개수 감소
    const onClickSub=(e)=>{
        e.preventDefault();
        if(cnt<=1){
            return;
        }
        else{
            setCnt(cnt-1)
        }
        
    }

    React.useEffect(()=>{
        // 상품정보 가져오기
        if(localStorage.getItem('MJ_KURLY_VIEW_PRODUCT')!==null) {
           let result = JSON.parse(localStorage.getItem('MJ_KURLY_VIEW_PRODUCT'))
            setState({
                ...state,
                상품: result[0]
            })
        }
    },[])

    return (
        <div id='Product'>

            <div className="container">
                <section id="section1">
                    <div className="content">
                        <div className="left">
                            <div className="img-box">
                                <img src={viewProductImg} alt="" />
                            </div>
                        </div>
                        <div className="right">
                            <div className="top">
                                <ul>
                                    <li><h4>{상품.배송구분}</h4></li>
                                    <li><h2>{`[${상품.제조사}]${상품.제품명}`}</h2></li>
                                    <li><p>{상품.제품특성}</p></li>
                                    <li><span>{Math.round(상품.할인율*100)}%</span>&nbsp;&nbsp;&nbsp;<strong>{(상품.정가*(1-상품.할인율)).toLocaleString('ko-KR')}</strong></li>
                                    <li><em>{상품.정가}</em></li>
                                    <li><h5>로그인후, 할인 및 적립 혜택이 제공 됩니다.</h5></li>
                                    <li><a href="!#">컬러카드 - 최대 <strong>472원</strong> 적립 + 첫 결제 3만원 할인</a></li>
                                </ul>
                            </div>
                            <div className="middle">
                                <ul>
                                    <li>
                                        <div className="col1">
                                            배송
                                        </div>
                                        <div className="col2">
                                            <strong>샛별배송</strong><br />
                                            23시 전 주문 시 내일 아침 7시 전 도착(대구·부산·울산 샛별배송 운영시간 별도 확인)
                                        </div>
                                    </li>
                                    <li>
                                        <div className="col1">
                                            판매자
                                        </div>
                                        <div className="col2">
                                            {상품.판매처}
                                        </div>
                                    </li>
                                    <li>
                                        <div className="col1">
                                            포장타입
                                        </div>
                                        <div className="col2">
                                        상온 (종이포장) <br />
                                        택배배송은 에코 포장이 스티로폼으로 대체됩니다.
                                        </div>
                                    </li>
                                    <li>
                                        <div className="col1">
                                            판매단위
                                        </div>
                                        <div className="col2">
                                            1통
                                        </div>
                                    </li>
                                    <li>
                                    <div className="col1">
                                            <strong>원산지</strong>
                                        </div>
                                        <div className="col2">
                                            <strong>상품설명/상세정보 참조</strong>
                                        </div>
                                    </li>
                                    <li>
                                        <div className="col1">
                                            알레르기정보
                                        </div>
                                        <div className="col2">
                                            - 땅콩 함유
                                        </div>
                                    </li>
                                    <li>
                                        <div className="col1">
                                        유통기한(또는 소비기한)정보
                                        </div>
                                        <div className="col2">
                                        수령일 포함 최소 125일 남은 제품을 보내드립니다. 
                                        </div>
                                    </li>
                                    <li>
                                    <div className="col1">
                                        상품선택
                                        </div>
                                        <div className="col2">
                                        {상품.제품명} <br />
                                        적립제외상품
                                        </div>
                                    </li>
                                    <li>
                                        <div className="col1">
                                            &nbsp;
                                        </div>
                                        <div className="col2">
                                            <div className="count-number-price">
                                                <div className="col2-left">
                                                    <button onClick={onClickSub}>-</button>
                                                    <span>{cnt}</span>
                                                    <button onClick={onClickAdd}>+</button>
                                                </div>
                                                <div className="col2-right">
                                                    <em>{(상품.정가).toLocaleString('ko-KR')}원</em>
                                                    <strong>{(상품.정가*(1-상품.할인율)).toLocaleString('ko-KR')}원</strong>
                                                </div>
                                            </div>
                                        </div>
                                    </li>
                                </ul>
                            </div>
                            <div className="bottom">
                                <div className="total-calc">
                                    <h2>총 상품금액 : <strong>{(cnt*(상품.정가*(1-상품.할인율))).toLocaleString('ko-KR')}</strong><em>원</em></h2>
                                    <p><em>적립</em> 로그인 후, 할인 및 적립 혜택 제공</p>
                                </div>
                                <div className="cart-btn-box">
                                    <button><img src={iconHeart} alt="" /></button>
                                    <button><img src={iconBell} alt="" /></button>
                                    <button>장바구니담기</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
                <section id="section2">
                    <div className="content">

                    </div>
                </section>
                <section id="section3">
                    <div className="content">

                    </div>
                </section>
                <section id="section4">
                    <div className="content">

                    </div>
                </section>
                <section id="section5">
                    <div className="content">

                    </div>
                </section>
                <section id="section6">
                    <div className="content">

                    </div>
                </section>
                <section id="section7">
                    <div className="content">

                    </div>
                </section>
                <section id="section8">
                    <div className="content">

                    </div>
                </section>
                <section id="section9">
                    <div className="content">

                    </div>
                </section>
                <section id="section10">
                    <div className="content">

                    </div>
                </section>
                <section id="section11">
                    <div className="content">

                    </div>
                </section>
                <section id="section12">
                    <div className="content">

                    </div>
                </section>
                <section id="section13">
                    <div className="content">

                    </div>
                </section>
            </div>
        </div>
    );
};

