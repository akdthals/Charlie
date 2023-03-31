import React from 'react';
import $ from 'jquery'

export default function Section2Component () {
    
    // React.useEffect(()=>{
    //    const sec2top = $('#section2').offset().top;
    // //    console.log(`sec2Top ${sec2Top}`);

    //    $(window).scroll(function(){
    //     if( $(window).scrollTop() >= sec2top){
    //         $('section2').addClass('on');
    //     }
    //     if( $(window).scrollTop() === 0 ){
    //                $('#section2').removeClass('on');
    //             }    
    //    })
    // })

    return (
        <div id='section2'>
            <div className="container">
                <div className="gap">
                    <div className="title">
                        <h1>Tailor Made Packages</h1>
                        <h2>What are you in the Mood for?</h2>
                    </div>
                    <div className="content">
                        <ul>
                            <li>
                                <div className="row1">
                                    <ul>
                                        <li>
                                        <figure>
                                            <img src="./img/travel-agency-destinations01.jpg" alt="" />
                                        </figure>
                                        </li>
                                        <li>
                                            <h2>Romantic Getaways</h2>
                                        </li>
                                        <li>
                                            <h3>990 Places</h3>
                                        </li>
                                        <li>
                                            <h4>VIEW DETAILS</h4>
                                        </li>
                                    </ul>
                                </div>
                                <div className="row2">
                                    <ul>
                                        <li>
                                            <i className='icon-map-pin medium-icon'></i>
                                            <h3>MORE THEN +990</h3>
                                            <h4>DESTINATIONS</h4>
                                        </li>
                                        <li>
                                            <i className='icon-wine medium-icon'></i>
                                            <h3>MORE THEN +650</h3>
                                            <h4>HOTELS / RESORTS</h4>
                                        </li>
                                        <li>
                                            <p>Lorem Ipsum is simply<br/> dummy text of the printing<br/> and typesetting industry.</p>
                                        </li>
                                        <li>
                                            <button>EXPLORE NOW</button>
                                        </li>
                                    </ul>
                                </div>
                            </li>
                            <li>
                                <div className="row1">
                                    <ul>
                                        <li>
                                        <figure>
                                            <img src="./img/travel-agency-destinations03.jpg" alt="" />
                                        </figure>
                                        </li>
                                        <li>
                                            <h2>MOUNTAIN MADNESS</h2>
                                        </li>
                                        <li>
                                            <h3>870 Places</h3>
                                        </li>
                                        <li>
                                            <h4>VIEW DETAILS</h4>
                                        </li>
                                    </ul>
                                </div>
                                <div className="row2">
                                    <ul>
                                        <li>
                                            <i className='icon-map-pin medium-icon'></i>
                                            <h3>More then +780</h3>
                                            <h4>Destinations</h4>
                                        </li>
                                        <li>
                                            <i className='icon-wine medium-icon'></i>
                                            <h3>More then +450</h3>
                                            <h4>Hotels / Resorts</h4>
                                        </li>
                                        <li>
                                            <p>Lorem Ipsum is simply<br/> dummy text of the printing<br/> and typesetting industry.</p>
                                        </li>
                                        <li>
                                            <button>EXPLORE NOW</button>
                                        </li>
                                    </ul>
                                </div>
                            </li>
                            <li>
                                <div className="row1">
                                    <ul>
                                        <li>
                                        <figure>
                                            <img src="./img/travel-agency-destinations02.jpg" alt="" />
                                        </figure>
                                        </li>
                                        <li>
                                            <h2>Beach Activities</h2>
                                        </li>
                                        <li>
                                            <h3>950 Places</h3>
                                        </li>
                                        <li>
                                            <h4>VIEW DETAILS</h4>
                                        </li>
                                    </ul>
                                </div>
                                <div className="row2">
                                    <ul>
                                        <li>
                                            <i className='icon-map-pin medium-icon'></i>
                                            <h3>More then +980</h3>
                                            <h4>Destinations</h4>
                                        </li>
                                        <li>
                                            <i className='icon-wine medium-icon'></i>
                                            <h3>More then +740</h3>
                                            <h4>Hotels / Resorts</h4>
                                        </li>
                                        <li>
                                            <p>Lorem Ipsum is simply<br/> dummy text of the printing<br/> and typesetting industry.</p>
                                        </li>
                                        <li>
                                            <button>EXPLORE NOW</button>
                                        </li>
                                    </ul>
                                </div>
                            </li>
                            <li>
                                <div className="row1">
                                    <ul>
                                        <li>
                                        <figure>
                                            <img src="./img/travel-agency-destinations04.jpg" alt="" />
                                        </figure>
                                        </li>
                                        <li>
                                            <h2>Forest Camping</h2>
                                        </li>
                                        <li>
                                            <h3>890 Places</h3>
                                        </li>
                                        <li>
                                            <h4>VIEW DETAILS</h4>
                                        </li>
                                    </ul>
                                </div>
                                <div className="row2">
                                    <ul>
                                        <li>
                                            <i className='icon-map-pin medium-icon'></i>
                                            <h3>More then +870</h3>
                                            <h4>Destinations</h4>
                                        </li>
                                        <li>
                                            <i className='icon-wine medium-icon'></i>
                                            <h3>More then +980</h3>
                                            <h4>Hotels / Resorts</h4>
                                        </li>
                                        <li>
                                            <p>Lorem Ipsum is simply<br/> dummy text of the printing<br/> and typesetting industry.</p>
                                        </li>
                                        <li>
                                            <button>EXPLORE NOW</button>
                                        </li>
                                    </ul>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    );
};

