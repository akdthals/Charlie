import React from 'react';

export default function FooterComponent () {
    return (
        <footer id='footer'>
            <div className="container">
                <div className="content">
                    <div className="top">
                        <ul>
                            <li>
                                <i className='icon-phone medium-icon'></i>
                                <h3>123-456-7890</h3>
                            </li>
                            <li>
                                <i className='icon-map-pin medium-icon'></i>
                                <h3>Victoria, United States</h3>
                            </li>
                            <li>
                                <i className='icon-envelope medium-icon'></i>
                                <h3>no-reply@domain.com</h3>
                            </li>
                        </ul>
                    </div>
                    <div className="middle">
                        <div className="col-gap">
                            <ul>
                                <li>
                                    <div>
                                        <i className='fa fa-facebook'></i>
                                    </div>
                                </li>
                                <li>
                                    <div>
                                        <i className='fa fa-twitter'></i>
                                    </div>
                                </li>
                                <li>
                                    <div>
                                        <i className='fa fa-dribbble'></i>
                                    </div>
                                </li>
                                <li>
                                    <div>
                                        <i className='fa fa-youtube-play'></i>
                                    </div>
                                </li>
                                <li>
                                    <div>
                                        <i className='	fa fa-linkedin'></i>
                                    </div>
                                </li>
                            </ul>
                        </div>
                    </div>
                    <div className="bottom">
                        <ul>
                            <li>
                                <div>
                                    <p>© 2023 H-Code is proudly powered by <a href="">ThemeZaa.</a> </p>
                                </div>
                            </li>
                            <li>
                                <div>
                                    <img src="./img/logo-light-gray.png" alt="" />
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </footer>
    );
};

