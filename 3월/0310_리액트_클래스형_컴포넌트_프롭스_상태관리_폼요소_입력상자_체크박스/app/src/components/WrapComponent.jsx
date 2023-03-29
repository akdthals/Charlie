import React, { Component } from 'react';
import '../scss/style.scss';

class WrapComponent extends Component {

  constructor(props){
    super(props);
    this.state = {
      userId : '',
      userPw : '',
      userPwOk : '',
      userName : '',
      userEmail : '',
      userHp : '',
      회원가입정보 : [],
      checked1 : false,
      checked2 : false,
      checked3 : false,
      checked4 : false,
      checked5 : false,
      좋아하는과일 : [], //체크된 과일 저장하는 배열
      blue1: false,
      blue2: false,
      blue3: false,
      blue4: false,
      blue5: false,
      취미 :[]



    }
  }

  onChangeUserId = (e) => {
    this.setState({
      userId : e.target.value
    })
  }

  onChangeUserPw = (e) => {
    this.setState({
      userPw : e.target.value
    })
  }

  onChangeUserPwOk = (e) => {
    this.setState({
      userPwOk : e.target.value
    })
  }

  onChangeUserName = (e) => {
    this.setState({
      userName : e.target.value
    })
  }

  onChangeUserEmail = (e) => {
    this.setState({
      userEmail : e.target.value
    })
  }

  onChangeUserHp = (e) => {
    this.setState({
      userHp : e.target.value
    })
  }

  //CHECKBOX EVENT/////////////////////////////////////////////////////////////
  //1. 체크박스 온체인지 이벤트
  //2. 상태관리 변수(속성) checked1 => VALUE 저장 TRUE OR FALSE
  //3. 조건문
  //4. 5개의 과일중 체크된 항목들 저장할 배열 선언 사용
  onChangeCheckEvent1 = (e) => {
    if(e.target.checked === true){
      this.setState({
        checked1 : true,
        좋아하는과일 : [
          ...this.state.좋아하는과일,
          e.target.value
        ]
      })
    }
    else{
      this.setState({
        checked1 : false,
        좋아하는과일 : this.state.좋아하는과일.filter((item) => item!==e.target.value)
      })
    }
  }

  onChangeCheckEvent2 = (e) => {
    if(e.target.checked === true){
      this.setState({
        checked2 : true,
        좋아하는과일 : [
          ...this.state.좋아하는과일,
          e.target.value
        ]
      })
    }
    else{
      this.setState({
        checked2 : false,
        좋아하는과일 : this.state.좋아하는과일.filter((item) => item!==e.target.value)
      })
    }
  }

  onChangeCheckEvent3 = (e) => {
    if(e.target.checked === true){
      this.setState({
        checked3 : true,
        좋아하는과일 : [
          ...this.state.좋아하는과일,
          e.target.value
        ]
      })
    }
    else{
      this.setState({
        checked3 : false,
        좋아하는과일 : this.state.좋아하는과일.filter((item) => item!==e.target.value)
      })
    }
  }

  onChangeCheckEvent4 = (e) => {
    if(e.target.checked === true){
      this.setState({
        checked4 : true,
        좋아하는과일 : [
          ...this.state.좋아하는과일,
          e.target.value
        ]
      })
    }
    else{
      this.setState({
        checked4 : false,
        좋아하는과일 : this.state.좋아하는과일.filter((item) => item!==e.target.value)
      })
    }
  }

  onChangeCheckEvent5 = (e) => {
    if(e.target.checked === true){
      this.setState({
        checked5 : true,
        좋아하는과일 : [
          ...this.state.좋아하는과일,
          e.target.value
        ]
      })
    }
    else{
      this.setState({
        checked5 : false,
        좋아하는과일 : this.state.좋아하는과일.filter((item) => item!==e.target.value)
      })
    }
  }

  onChangeBlue1 = (e)=>{
    if(e.target.checked === true){
        this.setState({
            blue1 : true,
            취미:[
                ...this.state.취미,
                e.target.value
            ]
        })
    }
    else{
        this.setState({
            blue1 : false,
            취미: this.state.취미.filter((item)=> item!==e.target.value)
        })
    }
  }
  
  onChangeBlue2 = (e)=>{
    if(e.target.checked === true){
        this.setState({
            blue2 : true,
            취미:[
                ...this.state.취미,
                e.target.value
            ]
        })
    }
    else{
        this.setState({
            blue2 : false,
            취미: this.state.취미.filter((item)=> item!==e.target.value)
        })
    }
  }
  onChangeBlue3 = (e)=>{
    if(e.target.checked === true){
        this.setState({
            blue3 : true,
            취미:[
                ...this.state.취미,
                e.target.value
            ]
        })
    }
    else{
        this.setState({
            blue3 : false,
            취미: this.state.취미.filter((item)=> item!==e.target.value)
        })
    }
  }
  onChangeBlue4 = (e)=>{
    if(e.target.checked === true){
        this.setState({
            blue4 : true,
            취미:[
                ...this.state.취미,
                e.target.value
            ]
        })
    }
    else{
        this.setState({
            blue4 : false,
            취미: this.state.취미.filter((item)=> item!==e.target.value)
        })
    }
  }
  onChangeBlue5 = (e)=>{
    if(e.target.checked === true){
        this.setState({
            blue5 : true,
            취미:[
                ...this.state.취미,
                e.target.value
            ]
        })
    }
    else{
        this.setState({
            blue5 : false,
            취미: this.state.취미.filter((item)=> item!==e.target.value)
        })
    }
  }
  
  
  //저장하기 클릭 이벤트
  onClickSave = (e) => {
    e.preventDefault();
    this.setState({
      회원가입정보 : [
        ...this.state.회원가입정보,
        {
          userId : this.state.userId,
          userPw : this.state.userPw,
          userPwOk : this.state.userPwOk,
          userName : this.state.userName,
          userEmail : this.state.userEmail,
          userHp : this.state.userHp,
          좋아하는과일 : this.state.좋아하는과일,
          취미:this.state.취미,
          가입일자 : `${new Date().getFullYear()}-${new Date().getMonth()+1}-${new Date().getDate()}`
        }
      ],
      userId : '',
      userPw : '',
      userPwOk : '',
      userName : '',
      userEmail : '',
      userHp : ''
    })
  }

  render() {
    return (
      <div id='wrap'>
        <div className="container">
          <div className="title">
            <h1>회원가입</h1>
            <h3><i>*</i>필수입력사항</h3>
          </div>
          <div className="content">
            <form name='member_form' id='memberForm' method='post' action="./member_form.php">
              <ul>
                <li>
                  <div>
                    <label htmlFor="userId">아이디<i>*</i></label>
                    <input onChange={this.onChangeUserId} type="text" name='user_id' id='userId' placeholder='아이디를 입력해주세요' value={this.state.userId}/>
                    <button>중복확인</button>
                  </div>
                </li>
                <li>
                  <div>
                    <label htmlFor="userPw">비밀번호<i>*</i></label>
                    <input onChange={this.onChangeUserPw} type="text" name='user_pw' id='userPw' placeholder='비밀번호를 입력해주세요' value={this.state.userPw} />
                  </div>
                </li>
                <li>
                  <div>
                    <label htmlFor="userPwOk">비밀번호확인<i>*</i></label>
                    <input onChange={this.onChangeUserPwOk} type="text" name='user_pw_ok' id='userPwOk' placeholder='비밀번호를 한번 더 입력해주세요' value={this.state.userPwOk}/>
                  </div>
                </li>
                <li>
                  <div>
                    <label htmlFor="userName">이름<i>*</i></label>
                    <input onChange={this.onChangeUserName} type="text" name='user_name' id='userName' placeholder='이름을 입력해주세요' value={this.state.userName}/>
                  </div>
                </li>
                <li>
                  <div>
                    <label htmlFor="userEmail">이메일<i>*</i></label>
                    <input onChange={this.onChangeUserEmail} type="text" name='user_email' id='userEmail' placeholder='예: marketkurly@kurly.com' value={this.state.userEmail}/>
                    <button>중복확인</button>
                  </div>
                </li>
                <li>
                  <div>
                    <label htmlFor="userHp">휴대폰<i>*</i></label>
                    <input onChange={this.onChangeUserHp} type="text" name='user_hp' id='userHp' placeholder='숫자만 입력해주세요' value={this.state.userHp}/>
                    <button >인증번호 받기</button>
                  </div>
                </li>
                <li className='fruit'>
                  <label htmlFor="chk1"><input onChange={this.onChangeCheckEvent1} type="checkbox" name='chk1' id='chk1' value='딸기' checked={this.state.checked1}/>딸기</label>
                  <label htmlFor="chk2"><input onChange={this.onChangeCheckEvent2} type="checkbox" name='chk2' id='chk2' value='사과' checked={this.state.checked2}/>사과 </label>
                  <label htmlFor="chk3"><input onChange={this.onChangeCheckEvent3} type="checkbox" name='chk3' id='chk3' value='포도' checked={this.state.checked3}/>포도</label>
                  <label htmlFor="chk4"><input onChange={this.onChangeCheckEvent4} type="checkbox" name='chk4' id='chk4' value='수박' checked={this.state.checked4}/>수박</label>
                  <label htmlFor="chk5"><input onChange={this.onChangeCheckEvent5} type="checkbox" name='chk5' id='chk5' value='자몽' checked={this.state.checked5}/>자몽</label>
                </li>
                <li className='hobbies'>
                    <label htmlFor="blue1"><input onChange={this.onChangeBlue1} type="checkbox" name='blue1' id='blue1' value='드라이브' checked={this.state.blue1} />드라이브</label>
                    <label htmlFor="blue2"><input onChange={this.onChangeBlue2} type="checkbox" name='blue2' id='blue2' value='축구' checked={this.state.blue2} />축구</label>
                    <label htmlFor="blue3"><input onChange={this.onChangeBlue3} type="checkbox" name='blue3' id='blue3' value='영화보기' checked={this.state.blue3} />영화보기</label>
                    <label htmlFor="blue4"><input onChange={this.onChangeBlue4} type="checkbox" name='blue4' id='blue4' value='노래듣기' checked={this.state.blue4} />노래듣기</label>
                    <label htmlFor="blue5"><input onChange={this.onChangeBlue5} type="checkbox" name='blue5' id='blue5' value='잠자기' checked={this.state.blue5} />잠자기</label>
                </li>
                {/* <li className='hobby'>

                </li> */}
              </ul>
              <div className="btn-box">
                <button onClick={this.onClickSave}>저장</button>
              </div>
            </form>
          </div>
        </div>
      </div>
    );
  }
}

export default WrapComponent;