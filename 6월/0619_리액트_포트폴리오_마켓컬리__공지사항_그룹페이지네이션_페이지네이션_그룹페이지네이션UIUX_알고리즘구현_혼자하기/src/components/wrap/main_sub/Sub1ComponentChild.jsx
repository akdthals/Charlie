import React from 'react';

export default function Sub1ComponentChild ({신상품, setViewProduct}) {

    // 정가, 판매가 금액에 콤머 형식 정규표현식 구현하기
    const commaPrice=(price)=>{
        let value = price.toString();
        const regExp = /(^\d+)(\d{3})/g;
        while( regExp.test(value) ){
            return  value.replace(regExp, '$1,$2');
        }        
    }

    const onClickProductList=(e, item)=>{
        e.preventDefault();
        let obj = {            
            제품코드: item.제품코드,
            보관방법: item.보관방법,
            이미지: `http://localhost:3000/images/intro/${item.이미지}`,
            배송구분: item.배송구분,
            제조사: item.제조사,
            제품명: item.제품명,
            제품특성: item.제품특성,
            정가: item.정가,
            할인율: item.할인율,
            판매처: item.판매처,            
            저장일시: new Date().getTime()
        }
        setViewProduct(obj);  // 최상위 컴포넌트에게 전달
        window.location.pathname = '/product';
    }
    React.useEffect(()=>{

    },[]);
    const [list] = React.useState(6);  // 한화면에 보여질 목록개수
    const [pageNumber, setPageNumber] = React.useState(1); // 페이지번호
    const [groupPage] = React.useState(3); // 페이지번호 그룹 1 (1(1~5) 2(6~10) 3(11~15) 4(15~20))
    const [cnt, setCnt] = React.useState(1); // 페이지번호

    const [startNum, setStartNum] = React.useState(); // 시작 그룹 번호
    const [endNum, setEndNum] = React.useState(); // 마지막 그룹 번호

    // 페이지번호 클릭 이벤트
    const onClickPageNum=(e, num)=>{
        e.preventDefault();
        setPageNumber(num);
    }

    // 그룹 페이지 다음 클릭 이벤트
    const onClickNextGroup=(e)=>{
        e.preventDefault();
        setCnt(cnt+1);
    }

    // 그룹 페이지 이전 클릭 이벤트
    const onClickPrevGroup=(e)=>{
        e.preventDefault();
        setCnt(cnt-1);
    }

    // 그룹 시작번호 설정 => cnt 또는 groupPage 값 변경이 있거나 설정되었다면 시작번호 설정 실행
    React.useEffect(()=>{
        setStartNum((cnt-1) * groupPage)
    },[cnt, groupPage])


    // 그룹 마지막 번호 설정
    React.useEffect(()=>{
        setEndNum(startNum + groupPage)
    },[startNum, groupPage])


    // 그룹 시작 페이지 설정 => 그룹 페이지 이동 시 그룹의 첫 페이지 설정
    React.useEffect(()=>{
        setPageNumber(startNum+1)
    },[endNum, startNum])






    return (
        <>
            <ul>
                {

                    신상품.map((item, idx)=>{
                        if( Math.ceil((idx+1)/list) === pageNumber ){
                        return(
                            <li key={item.제품코드}>
                                <a href="!#"  onClick={(e)=>onClickProductList(e, item)}>
                                    <div className="img-box">
                                        <img src={`./images/sub1/${item.이미지}`} alt="" />
                                        <span>
                                            <img src="./images/sub1/icon_cart.svg" alt="" />
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
                        }
                    })
                    
                    
                }
               
            
            </ul>   
            <div className="page-button-box">

                        {cnt > 1 && <a href="!#" className="prev-btn" onClick={onClickPrevGroup}>&lt;</a> }
                        {
                            (()=>{
                                let arr = []; // 페이지 번호와 a 태그 모두 저장된 배열변수
                                for(let i=startNum; i<endNum; i++){
                                    if(i<Math.ceil(신상품.length/list)){
                                    arr =   [...arr,  <a className={pageNumber === (i+1)?'on':''} href="!#"  onClick={(e)=>onClickPageNum(e, (i+1))}>{i+1}</a>]
                                    }
                                }
                                return arr
                            })()
                            
                        }
                         {cnt < Math.ceil(신상품.length/list/groupPage) && <a href="!#" className="next-btn" onClick={onClickNextGroup}>&gt;</a>}
                    </div>   
        </>

    );
};