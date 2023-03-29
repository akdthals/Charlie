import React from 'react';
import HeaderComponent from './wrap/HeaderComponent';
import SignComponent from './wrap/SignComponent';


export default function WrapComponent () {
    return (
        <div id='wrap'>
            <HeaderComponent/>
            <SignComponent/>
        </div>
    );
};

