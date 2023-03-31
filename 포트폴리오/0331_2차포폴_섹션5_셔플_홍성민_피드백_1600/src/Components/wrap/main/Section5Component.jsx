import React from 'react';
import $ from 'jquery'

export default function Section5Component() {
    
    
    React.useEffect(()=>{  /* 페럴럭스 기능 */

    // const sec5Top = $('#section2').offset().top;

    // console.log(`sec5Top ${sec5Top}`);

    // $(window).scroll(function(){
    //     if( $(window).scrollTop() >= sec5Top ){
    //         $('#section2').addClass('on');
    //     }            
        
    //     if( $(window).scrollTop() === 0 ){
    //         $('#section2').removeClass('on');
    //     }            
        
    // });
    




        const travelBtn = $('#section5 .travel-btn');    
        const imgBox = $('#section5 .img-box');   

        const travelBoxUl = $('#travel-box  ul');     
        const travelBoxUlLi = $('#travel-box ul li'); 

        let n = travelBoxUlLi.length;  
        let cols = 4;  
        let rows = Math.ceil(n/cols);  
        let winW = $(window).innerWidth();
        let imgW = winW/cols   
        let imgH = imgW*0.75   
        let travelBoxH = imgH*rows  
        let btnNumber = 0; 
        let a = [];


        travelFn();
        travelBtn.removeClass('on');
        travelBtn.eq(btnNumber).addClass('on');

        $(window).resize(function(){
            travelFn();
        }) 

        function travelFn(){

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
                case 5:
                    n=5;
                    break;
                default:
            }

            if( $(window).innerWidth() >= 1200 ){
                cols = 4;
            }                     
            else if( $(window).innerWidth() >= 991 ){
                cols = 3;
            }                     
            else if( $(window).innerWidth() >= 768 ){
                cols = 2;
            }
            else {
                cols = 1;
            }

            rows = Math.ceil(n/cols);  
            winW = $(window).innerWidth();
            imgW = winW/cols   
            imgH = imgW*0.75   
            travelBoxH = imgH*rows  

            travelBoxUl.css({height: travelBoxH + (120 * rows)});
            travelBoxUlLi.css({width:imgW, height:imgH+120}); 
            
            // 버튼 번호에 따른 배열 값을 정리하고 반복처리
            switch(btnNumber){
                case 0:
                    a=[0,1,2,3,4,5,6,7];
                    break;
                case 1:
                    a=[2,3,5,6,7];
                    break;
                case 2:
                    a=[0,1,3,4,6,7];
                    break;
                case 3:
                    a=[0,2,4,6];
                    break;
                case 4:
                    a=[0,1,3,4,5,6,7];
                    break;
                case 5:
                    a=[0,1,3,6,7];
                    break;
            }

            imgBox.removeClass('addZoom');

            let k=-1;
            for(let i=0; i<rows; i++){ 
                for(let j=0; j<cols; j++){
                    k++;  // 0 1 2 3 4 5 6 7
                    travelBoxUlLi.eq( a[k] ).stop().animate({top: (imgH+120) * i, left: imgW * j}, 300); 
                }
            }

            for(let i=0; i<a.length; i++){
                imgBox.eq(a[i]).addClass('addZoom');
            }

        }  


        travelBtn.each(function(idx){
            $(this).on({
                click(e){
                    e.preventDefault();
                    travelBtn.removeClass('on'); 
                    $(this).addClass('on'); 
                    btnNumber = idx;                        
                    travelFn();
                }
            });
        });

    },[])

    
    return (
        <div id='section5'> 
            <div className="container">
                <div className="gap">
                    <div className="title">
                        <h1>TOUR PACKAGES</h1>
                        <h2>THANKS YOU TRIPS! THIS IS AMAZING TRAVEL!</h2>
                    </div>
                    <div className="content">
                        <nav id="travel-nav">
                            <ul>
                                <li><a href="!#" className='travel-btn on'>ALL</a></li>
                                <li><a href="!#" className='travel-btn'>HOLIDAYS</a></li>
                                <li><a href="!#" className='travel-btn'>FAMILY</a></li>
                                <li><a href="!#" className='travel-btn'>HONEYMOON</a></li>
                                <li><a href="!#" className='travel-btn'>SAFARI</a></li>
                                <li><a href="!#" className='travel-btn'>LUXURY</a></li>
                            </ul>
                        </nav>
                        <div id="travel-box">
                            <ul>
                                <li>
                                    <div className="col-gap">
                                        <figure className='img-box'>
                                            <img src="./img/travel-agency-packages08.jpg" alt="" />
                                        </figure>
                                        <figcaption>
                                            <h3>Best Of Paris</h3>
                                            <h4>8 Days / 7 Nights - $2500</h4>
                                            <button>Explore Now</button>
                                        </figcaption>
                                        
                                    </div>
                                </li>
                                <li>
                                    <div className="col-gap">
                                        <figure className='img-box'>
                                            <img src="./img/travel-agency-packages01.jpg" alt="" />
                                        </figure>
                                        <figcaption>
                                            <h3>Bangkok Pattaya</h3>
                                            <h4>2 Days / 3 Nights - $580</h4>
                                            <button>Explore Now</button>
                                        </figcaption>
                                       
                                    </div>
                                </li>
                                <li>
                                    <div className="col-gap">
                                        <figure className='img-box'>
                                            <img src="./img/travel-agency-packages05.jpg" alt="" />
                                        </figure>
                                        <figcaption>
                                            <h3>Australian Getaway</h3>
                                            <h4>2 Days / 3 Nights - $1500</h4>
                                            <button>Explore Now</button>
                                        </figcaption>
                                        
                                    </div>
                                </li>
                                <li>
                                    <div className="col-gap">
                                        <figure className='img-box'>
                                            <img src="./img/travel-agency-packages09.jpg" alt="" />
                                        </figure>
                                        <figcaption>
                                            <h3>Singapore City</h3>
                                            <h4>2 Days / 3 Nights - $950</h4>
                                            <button>Explore Now</button>
                                        </figcaption>
                                        
                                    </div>
                                </li>
                                <li>
                                    <div className="col-gap">
                                        <figure className='img-box'>
                                            <img src="./img/travel-agency-packages04.jpg" alt="" />
                                        </figure>
                                        <figcaption>
                                            <h3>Thailand Special</h3>
                                            <h4>4 Days / 5 Nights - $1500 (22% Off)</h4>
                                            <button>Explore Now</button>
                                        </figcaption>
                                        
                                    </div>
                                </li>
                                <li>
                                    <div className="col-gap">
                                        <figure className='img-box'>
                                            <img src="./img/travel-agency-packages07.jpg" alt="" />
                                        </figure>
                                        <figcaption>
                                            <h3>Switzerland Winter</h3>
                                            <h4>5 Days / 6 Nights - $1350 (50% Off)</h4>
                                            <button>Explore Now</button>
                                        </figcaption>
                                        
                                    </div>
                                </li>
                                <li>
                                    <div className="col-gap">
                                        <figure className='img-box'>
                                            <img src="./img/travel-agency-packages06.jpg" alt="" />
                                        </figure>
                                        <figcaption>
                                            <h3>Principe Forte Dei Marmi</h3>
                                            <h4>5 Days / 6 Nights - $1350 (50% Off)</h4>
                                            <button>Explore Now</button>
                                        </figcaption>
                                        
                                    </div>
                                </li>
                                <li>
                                    <div className="col-gap">
                                        <figure className='img-box'>
                                            <img src="./img/travel-agency-packages10.jpg" alt="" />
                                        </figure>
                                        <figcaption>
                                            <h3>South Africa Adventures</h3>
                                            <h4>5 Days / 6 Nights - $1350 (50% Off)</h4>
                                            <button>Explore Now</button>
                                        </figcaption>
                                        
                                    </div>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    );
};

