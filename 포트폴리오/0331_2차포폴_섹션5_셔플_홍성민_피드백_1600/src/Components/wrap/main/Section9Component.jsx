import React from 'react';

export default function Section9Component (){
    return (
        <div id='section9' >
            <div className="container">
                <div className="gap">
                    <div className="title">
                        <h1>LATEST BLOG</h1>
                        <h2>THANKS YOU TRIPS! THIS IS AMAZING TRAVEL!</h2>
                    </div>
                    <div className="content">
                        <ul>
                            <li>
                                <div>
                                    <img src="./img/homepage-travel-blog01.jpg" alt="" />
                                    <h4><a href="">Standard post with picture</a></h4>
                                    <h5>POSTED BY <a href="">ADMIN</a>  | 20 OCTOBER 2015</h5>
                                    <p>Lorem Ipsum is simply dummy text of the printing and<br/> typesetting industry. Lorem Ipsum has been the<br/> industry's standard dummy text Lorem Ipsum is simply...</p>
                                </div>
                            </li>
                            <li>
                                <div>
                                    <img src="./img/homepage-travel-blog02.jpg" alt="" />
                                    <h4><a href="">POST WITH FEATURED PICTURE</a></h4>
                                    <h5>POSTED BY <a href="">ADMIN</a>  | 20 OCTOBER 2015</h5>
                                    <p>Lorem Ipsum is simply dummy text of the printing and<br/> typesetting industry. Lorem Ipsum has been the<br/> industry's standard dummy text Lorem Ipsum is simply...</p>
                                </div>
                            </li>
                            <li>
                                <div>
                                    <img src="./img/homepage-travel-blog03.jpg" alt="" />
                                    <h4><a href="">STANDARD POST WITH SLIDER</a></h4>
                                    <h5>POSTED BY <a href="">ADMIN</a>  | 20 OCTOBER 2015</h5>
                                    <p>Lorem Ipsum is simply dummy text of the printing and<br/> typesetting industry. Lorem Ipsum has been the<br/> industry's standard dummy text Lorem Ipsum is simply...</p>
                                </div>
                            </li>
                        </ul>
                    </div>
                    <div className="button">
                        <button>VIEW All BLOG</button>
                    </div>
                </div>
            </div>
        </div>
    );
};

