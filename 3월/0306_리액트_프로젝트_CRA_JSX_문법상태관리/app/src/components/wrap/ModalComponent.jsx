import React from 'react';
import imgSrc from '../../images/photography-img18.jpg';
import '../../scss/style_modal.scss';

export default function ModalComponent ({modalCloseFn}){
    const onClickModalClose=(e)=>{
        e.preventDefault();
        modalCloseFn();
    }

    return (
        <div id='modal'>
            <div className="wrap">
                <div className="container">
                    <div className="img-box">
                        <img src={imgSrc} alt="" />
                    </div>
                    <button onClick={onClickModalClose}>닫기</button>
                </div>
            </div>
        </div>
    );
};
