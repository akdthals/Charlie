import React from 'react';
import TopModalComponent from './wrap/TopModalComponent'
import HeaderComponent from './wrap/HeaderComponent'
import SignUpComponent from './wrap/SignUpComponent';
import FooterComponent from './wrap/FooterComponent';
import Sub1pageComponent from './wrap/Sub1pageComponent';
import Sub2pageComponent from './wrap/Sub2pageComponent';
import IntroMainComponent from './wrap/IntroMainComponent.jsx';
import {BrowserRouter, Routes, Route} from 'react-router-dom'

export default function WrapComponent () {
  return (
    <div id='wrap'>
      <BrowserRouter>
          <TopModalComponent />   {/* 고정페이지 */}

              <Routes>
                  <Route path='/' element={<HeaderComponent />}>    {/* 네비게이션 항상 고정되는 페이지 메인버튼 클릭 페이지 이동 */}
                      <Route index element={<SignUpComponent />}/> {/* 페이지들(컴포넌트들) */}
                      <Route path='/회원가입' element={<SignUpComponent />}/> {/* 페이지들(컴포넌트들) */}
                      <Route path='/로그인' element={<Sub1pageComponent />}/> {/* 페이지들(컴포넌트들) */}
                      <Route path='/고객센터' element={<Sub2pageComponent />}/> {/* 페이지들(컴포넌트들) */}
                  </Route>
              </Routes>

          <FooterComponent />   {/* 고정페이지 */}
      </BrowserRouter>
    </div>
  );
};

