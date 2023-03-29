import React from 'react';

function Section01Component () {
    return (
        <section id="section1">
            <div className="container">
                <div className="slide-container">
                    <div className="slide-view">
                        <ul className="slide-wrap">
                            <li className="slide slide3">
                                <div className="title">
                                    <div className="gap">
                                        <div className="content">
                                            <img src="./img/tattoo-img-7.png" alt="" className="img1" />
                                            <h3>The most talented artists create<br />the highest quality art.</h3>
                                            <img src="./img/tattoo-img-2.png" alt="" className="img2" />
                                        </div>
                                    </div>
                                </div>
                            </li>
                            <li className="slide slide1">
                                <div className="title">
                                    <div className="gap">
                                        <div className="content">
                                            <img src="./img/tattoo-img-1.png" alt="" className="img1" />
                                            <h3>The most talented artists create<br />the highest quality art.</h3>
                                            <img src="./img/tattoo-img-2.png" alt="" className="img2" />
                                        </div>
                                    </div>
                                </div>
                            </li>
                            <li className="slide slide2">
                                <div className="title">
                                    <div className="gap">
                                        <div className="content">
                                            <img src="./img/tattoo-img-6.png" alt="" className="img1" />
                                            <h3>The most talented artists create<br />the highest quality art.</h3>
                                            <img src="./img/tattoo-img-2.png" alt="" className="img2" />
                                        </div>
                                    </div>
                                </div>
                            </li>
                            <li className="slide slide3">
                                <div className="title">
                                    <div className="gap">
                                        <div className="content">
                                            <img src="./img/tattoo-img-7.png" alt="" className="img1" />
                                            <h3>The most talented artists create<br />the highest quality art.</h3>
                                            <img src="./img/tattoo-img-2.png" alt="" className="img2" />
                                        </div>
                                    </div>
                                </div>
                            </li>
                            <li className="slide slide1">
                                <div className="title">
                                    <div className="gap">
                                        <div className="content">
                                            <img src="./img/tattoo-img-1.png" alt="" className="img1" />
                                            <h3>The most talented artists create<br />the highest quality art.</h3>
                                            <img src="./img/tattoo-img-2.png" alt="" className="img2" />
                                        </div>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>


                {/* { <!-- 인디게이트 버튼 || 페이지네이션 버튼 --> } */}
                <div className="page-btn-box">
                    <span><a href="!#" className="page-btn blind on">페이지1</a></span>
                    <span><a href="!#" className="page-btn blind">페이지2</a></span>
                    <span><a href="!#" className="page-btn blind">페이지3</a></span>
                </div>
            </div>
        </section>
    );
};

export default Section01Component;