import React from 'react';
import $ from 'jquery'

export default function Section7Component() {

    React.useEffect(()=>{

    const sec7Top = $('#section7').offset().top;
    let issection7=false;

    $(window).scroll(function(){
        if( $(window).scrollTop() >= sec7Top && issection7===false ){
            let countNum = [312, 980, 810, 600];           
            let countSum = [0, 0, 0, 0];           
            let setId = 0    
         
            function countFn(){
                for(let i=0; i<countNum.length; i++){
                    countSum[i] += (countNum[i]/1000);
                }
                // console.log( countSum ); 

                if(countSum[0]>countNum[0]){
                    clearInterval(setId);
                }

                for(let i=0; i<countNum.length; i++){
                   
                    num.eq(i).html( (Math.round(countSum[i])) ); 
                    
                }
            }

           setId = setInterval(countFn, 3);
           issection7=true;
        }            
    }); 
        const num = $('#section7 .num');       
    })
    return (
        <div id='section7'>
            <div className="container">
                <div className="content">
                    <ul>
                        <li>
                            <i className='icon-hotairballoon medium-icon'></i>
                            <p><span className='num'>312</span></p>
                            <h4>TOURS</h4>
                        </li>
                        <li>
                            <i className='icon-happy medium-icon'></i>
                            <p><span className='num'>980</span></p>
                            <h4>TOURISTS</h4>
                        </li>
                        <li>
                            <i className='icon-map medium-icon'></i>
                            <p><span className='num'>810</span></p>
                            <h4>DESTINATIONS</h4>
                        </li>
                        <li>
                            <i className='icon-ribbon medium-icon'></i>
                            <p><span className='num'>600</span></p>
                            <h4>HOTELS</h4>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    );
};

