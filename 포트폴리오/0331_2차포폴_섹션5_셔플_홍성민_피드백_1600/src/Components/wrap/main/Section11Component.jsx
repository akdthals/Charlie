import React from 'react';

export default function Section11Component (){
    return (
        <div id='section11'>
            <div className="container">
                <div className="gap">
                    <div className="title">
                        <h1>CONTACT US</h1>
                    </div>
                    <div className="content">
                        <div className="top-box">
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
                        <hr/>
                        <div className="bottom-box">
                            <div className="left-side">
                                <ul>
                                    <li>
                                        <input type="text" name='user_name' id='userName' placeholder='YOUR NAME' />
                                    </li>
                                    <li>
                                        <input type="text" name='user_email' id='userEmail' placeholder='YOUR EMAIL' />
                                    </li>
                                    <li>
                                        <h5>*PLEASE COMPLETE ALL FIELDS CORRECTLY</h5>
                                    </li>
                                </ul>
                            </div>
                            <div className="right-side">
                                <ul>
                                    <li>
                                        {/* <input type="text" name='message' id='message' placeholder='YOUR MESSAGE' /> */}
                                        <textarea name="message" id="message" placeholder='YOUR MESSAGE'></textarea>
                                    </li>
                                    <li>
                                        <button>SEND MESSAGE</button>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    );
};

