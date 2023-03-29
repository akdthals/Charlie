import React from 'react';

function Section03Component () {
    return (
        <section id="section3">
            <div className="container">
                <div className="gap">
                    <div className="content">
                        <div className="left">
                            <div className="col-gap">
                                <img src="./img/tattoo-img-10.jpg" alt="" />
                            </div>
                        </div>
                        <div className="center">
                            <div className="col-gap2">
                                <div className="top-box">
                                    <h4>A CURATED GALLERY OF</h4>
                                    <h1>TATTOO ART</h1>
                                </div>
                                <div className="bottom-box">
                                    <h3>IN THIS br/ANDO, WE HAVE INVITED<br /> ARTISTS TO REVEAL THEIR TALENT, FOR<br /> AN ODE
                                        TO CREATIVITY.</h3>
                                    <h5>Lorem Ipsum is simply dummy text of the<br /> printing and typesetting industry. Lorem<br />
                                        Ipsum has been the industry’s standard<br /> dummy text ever since the 1500s.
                                        Lorem <br />Ipsum is simply dummy text of the printing<br /> and typesetting industry.</h5>
                                    <button type="submit" className="submit-btn">Enter The Gallary</button>
                                </div>
                            </div>
                        </div>
                        <div className="right">
                            <img src="./img/tattoo-img-11.jpg" alt="" />
                        </div>
                    </div>

                </div>


            </div>
        </section>
    );
};

export default Section03Component;