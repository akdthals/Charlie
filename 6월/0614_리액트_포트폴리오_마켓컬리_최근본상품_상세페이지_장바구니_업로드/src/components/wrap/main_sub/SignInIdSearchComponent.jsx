import React from 'react';
import '../scss/signin_id_search.scss'

export default function SignInIdSearchComponent () {

    const [isTab, setIstab] = React.useState(false)
    const [isBtn, setIsBtn] = React.useState(false)
    const [userName, setUserName] = React.useState(false)
    const [userHp, setUserHp] = React.useState(false)

    const onChangeName=(e)=>{
        setUserName(e.target.value)
    }
    const onChangeHp=(e)=>{
        setUserHp(e.target.value)
    }
    



    return (
        <main id='signInIdSearch'>
            <section id="section1">
                <div className="container">
                    <div className="title">
                        <h2>아이디 찾기</h2>
                    </div>
                    <div className="content">
                        <form >
                            <ul>
                                <li>
                                    <button className={!isTab? 'on' : ''}>휴대폰 인증</button>
                                    <button className={isTab? 'on' : ''}>이메일 인증</button>
                                </li>
                                <li><label htmlFor="userName">이름</label></li>
                                <li><input 
                                 onChange={onChangeName}
                                type="text" 
                                name='user_name' 
                                id='userName' 
                                value={userName}
                                 placeholder='이름을 입력해 주세요' />
                                 </li>
                                <li><label htmlFor="userHp">휴대폰번호</label></li>
                                <li><input 
                                onChange={onChangeHp}
                                type="text" 
                                name='user_hp' 
                                id='userHp' 
                                value={userHp}  
                                placeholder='휴대폰 번호를 입력해 주세요'
                                /></li>
                                <li></li>
                                <li><button className={isBtn? 'on' : ''}>인증번호 받기</button></li>
                            </ul>
                        </form>
                    </div>
                </div>
            </section>
        </main>
    );
};

