import React from 'react';

export default function Sub2ComponentChild ({베스트}) {


    const commaPrice=(price)=>{
        let value = price.toString();

        const regExp = /(^\d+)(\d{3})/g;  

        while( regExp.test(value) ){
            return  value.replace(regExp, '$1,$2');
        }
        
    }


    const result = 베스트.map((item)=>{
        return(
            <li key={item.제품코드}>
                <a href="!#">
                    <div className="img-box">
                        <img src={`./images/sub2/${item.이미지}`} alt="" />
                        <span>
                            <img src="./images/sub2/icon_cart.svg" alt="" />
                        </span>
                    </div>
                    <div className="tit-box">
                        <ul>
                            <li>{item.배송구분}</li>
                            <li><strong>[{item.제조사}]</strong> <em>{item.제품명}</em></li>
                            <li>{item.제품특성}</li>
                            <li><span className='rate-price'>{item.할인율===0?``:`${Math.round(item.할인율*100)}%`}</span>{item.할인율 > 0 && (<span className='panme-price'>{commaPrice(item.정가*(1-item.할인율))}</span>) }</li>
                            <li>{ item.할인율===0? <span className='panme-price'>{commaPrice(item.정가)}</span> : <s>{commaPrice(item.정가)}</s> }</li>
                            <li>{item.판매처}</li>
                        </ul>    
                    </div>
                </a>
            </li> 
        )
    })


    return (
            <ul> 
                {result}
            </ul>   
    );
};