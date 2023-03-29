import React from 'react';
import HeaderComponent from './wrap/HeaderComponent';
import SignComponent from './wrap/SignComponent';
import FooterComponents from './wrap/FooterComponents';


export default function WrapComponent () {
    return (
        <div id='wrap'>
            <HeaderComponent/>
            <SignComponent/>
            <FooterComponents/>
        </div>
    );
};

