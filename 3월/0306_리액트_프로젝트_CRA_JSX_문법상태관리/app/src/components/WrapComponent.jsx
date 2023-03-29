import React from 'react';
import HeaderComponent from './wrap/HeaderComponent.jsx';
import ModalComponent from './wrap/ModalComponent.jsx';
import '../css/style_wrap.css'; //SRC 내에 CSS 스타일 가져오기
import '../scss/style.scss';


export default function WrapComponent (props) {

    // 상태관리 변수 대명사: 스테이트 state
    // 상태관리 변수 수정(설정 세터 setter): 셋스테이트 setState
    // 리액트에서 모든 프롭스(변수)를 상태관리에게 넘겨준다.
    const [state, setState] = React.useState(props); // 리액트 상태관리 훅


    // h1 클릭 이벤트 => 타이틀 수정
    // 1. JSX 태그요소에서 onClick={실행할 이벤트 함수 생성} 
    // 2. 함수 등록하기 화살표 함수 식으로 등록한다.
    // 3. 클릭 이벤트 새로고침방샐 제거 
    // 4. 타이틀 수정 세터 => 타이틀
    const onClicktitleUpdate=(e)=>{
        e.preventDefault();
        setState({
            ...state,
            타이틀: '상태관리 타이틀 변수(속성 프로퍼티) 내용 setState() 함수를 이용 변경 했습니다.'
        });
    }

    // h2 클릭 이벤트 = > 이름 변경
    const onClickNameUpdate=(e)=>{
        e.preventDefault();
        setState({
            ...state,
            이름:'김유신'
        })
    }



    // 카운트 클릭 이벤트 : 부모(상위) 컴포넌트의 함수를 자식이 호출하여 실행하면 다양한 응용
    const onClickCount=()=>{
        setState({
            ...state,
            cnt:state.cnt+1
        })
    }

    // 카운트 함수
    // 타이머 제작
    const countDown=()=>{
        let cnt =59;
        let setId = 0;
        setId = setInterval(function(){
            cnt--;
            if(cnt<=0){
                clearInterval(setId);
            }
            setState({
                ...state,
                cnt: cnt, 
                setId: setId
        })
        }, 200);
    }

    React.useEffect(()=>{

       countDown();


        // setState({
        //     ...state, // 전개연산자
        //     타이틀: '상태관리 타이틀 수정 내용',
        //     이름: '김유신'
        // });

        // console.log( state.이름 );
        // console.log( state.아이디 );
        // console.log( state.타이틀 );
        // console.log( state.비밀번호 );


    },[]);  // 빈배열 로딩시 1회실행 끝

    // 모달 닫기 함수 => 자식 컴포넌트 모달창으로 프롭스로 내려보낸다.
    const modalCloseFn=()=>{
        setState({
            ...state,
            isModal:false
        })
    }

    // 모달 열기 함수 => 자식 컴포넌트 헤더컴포넌트에게 프롭스로 내려보낸다.
    const modalOpenFn=()=>{
        setState({
            ...state,
            isModal:true
        })
    }




    return (
        <div id="wrap">
            <h1 style={style.h1} onClick={onClicktitleUpdate}>{state.타이틀}</h1>
            <h2 style={style.h2}onClick={onClickNameUpdate}>{state.이름}</h2>

            <HeaderComponent modalOpenFn={modalOpenFn} 이름={state.이름} cnt={state.cnt} onClick={onClickCount}/* 함수이름만 *//>

            {/* 모달창 ModalComponent */}
            {
                state.isModal && <ModalComponent modalCloseFn={modalCloseFn}/>
            }


        </div>
    )
}

WrapComponent.defaultProps = {
    타이틀: '래퍼컴포넌트입니다.',
    이름: '이순신',
    아이디:'leesunshin',
    비밀번호:'leesunshin123',
    cnt:0,
    isModal: false, // 모달창 초기값 false 이면 숨기기 / true 이면 모달창 보이기
    setId: 0
}

// 랩퍼 컴포넌트 속성 스타일 
const style ={
    h1:{
        lineHight:'300%',
        padding: '20px',
        fontSize: '50px',
        color: '#29c'
    },
    h2:{
        lineHight:'200%',
        padding: '10px',
        fontSize: '50px',
        color: '#c29'
    }
   
}

