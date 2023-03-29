import React from 'react';

function Section07Component () {
    return (
        <section id="section7">
            <div className="container">
                <div className="gap">
                    <div className="title">
                        <div className="content">
                            <ul>
                                <li>
                                    <div className="col-gap">
                                        <div className="content-box left">
                                            <h2>DON’T MISS THE LAST SEATS HERE</h2>
                                            <h3>GREAT SPEAKERS WITH GREAT TOPICS</h3>
                                            <i></i>
                                        </div>
                                    </div>
                                </li>
                                <li>
                                    <div className="col-gap">
                                        <div className="content-box right">
                                            <div className="content-wrap">
                                                <h2 className="content-head">BOOK NOW</h2>
                                                <form name="message_form" id="messageForm" method="post" action="./message.php">
                                                    <ul>
                                                        <li><input type="text" name="irum" id="irum" placeholder="YURE NAME" /></li>
                                                        <li><input type="email" name="email" id="email" placeholder="YURE EMAIL" /></li>
                                                        <li>
                                                            <textarea name="message" id="message" placeholder="YURE MESSAGE"></textarea>
                                                        </li>
                                                        <li>
                                                            <button type="submit" className="submit-btn">SUBMIT</button>
                                                        </li>
                                                    </ul>
                                                </form>
                                                <div className="content-foot foot1">Your message was sent successfully. Thanks.</div>
                                                <div className="content-foot foot2">Validation errors occurred. Please confirm the fields and submit it again.</div>
                                            </div>
                                        </div>
                                    </div>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    );
};

export default Section07Component;