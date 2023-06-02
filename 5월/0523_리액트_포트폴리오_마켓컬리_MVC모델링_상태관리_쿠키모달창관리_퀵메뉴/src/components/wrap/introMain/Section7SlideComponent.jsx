import React from 'react';

export default function Section7SlideComponent ({상품, n}) {

    const slideWrap= React.useRef();

    const [cnt, setCnt] = React.useState(0)


    React.useEffect(()=>{
        slideWrap.current.style.transform = `all 0.6s ease-in-out`;
        slideWrap.current.style.left = `${-100*cnt}%`;
        if(cnt>(n/4-2)){
            setCnt((n/4-2))
            slideWrap.current.style.left = `${-100*((n/4-2))}%`;
        }
        else if(cnt>(n/4-2)){
            setCnt((0))
            slideWrap.current.style.left = `0%`;
        }
    },[cnt])

    const onClickNext = (e)=>{
        e.preventDefault();
        setCnt(cnt+1);
    }

    const onClickPrev = (e)=>{
        e.preventDefault();
        setCnt(cnt-1);
    }

    // 판매가격, 정가 콤머형식 함수
    const commaPrice=(price)=>{
        let value = price.toString();
        const regExp = /(^\d+)(\d{3})/g;
        while( regExp.test(value) ){
            return  value.replace(regExp, '$1,$2');
        }        
    }

    

    return (
        <>
        
        <div className="slide-container">
            <div className="slide-view">
                <ul ref={slideWrap} className="slide-wrap">
                    
                    {                    
                        상품.map((item)=>{
                            return(
                                <li className="slide slide0" key={item.제품코드}>
                                    <div className="col-gap">
                                        <a href="!#">
                                            <div className="img-box">
                                                <img src={`./images/intro/${item.이미지}`} alt="" />
                                                <span>
                                                    <img src="./images/sub1/icon_cart.svg" alt="" />
                                                </span>
                                            </div>
                                            <div className="tex-box">
                                                <ul>                                                        
                                                    <li>{item.배송구분}</li>
                                                    <li><strong>[item.제조사]</strong> <em>{item.제품명}</em></li>
                                                    <li>{}</li>
                                                    <li><span className='rate-price'>{item.할인율===0?``:`${Math.round(item.할인율*100)}%`}</span>{item.할인율 > 0 && (<span className='panme-price'>{commaPrice(42900*(1-item.할인율))}</span>) }</li>
                                                    <li>{ item.할인율===0? <span className='panme-price'>{commaPrice(item.정가)}</span> : <s>{commaPrice(item.정가)}</s> }</li>
                                                    <li>{ item.판매처 }</li>
                                                </ul> 
                                            </div>
                                        </a>
                                    </div>
                                </li>
                                
                            )
                        })

                    }
                    
                
                </ul>
            </div>
        </div>
        <div className="container">
         <div className="gap">
             <div className="title">
                 <h2>이 상품 어때요?</h2>
             </div>
             <div className="content">

             

             </div>
         </div>
     </div>
     <a href="!#" onClick={onClickNext} className='left-arrorw-btn'><img src="./images/intro/icon_left_arrow_white.svg" alt="" /></a>
     <a href="!#" onClick={onClickPrev} className='right-arrorw-btn'><img src="./images/intro/icon_left_arrow_white.svg" alt="" /></a>

     </>
    );
};

 