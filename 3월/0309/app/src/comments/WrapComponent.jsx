import React, { Component } from 'react';
import '../scss/wrap.scss'


class WrapComponent extends Component {
    constructor(props){
        super(props);
        this.state={
            할일 :'',
            아이디:'',
            비밀번호:'',
            이름:'',
            이메일:'',
            휴대폰번호:'',
            인증번호:'',

            todoList: []
        }
    } 




    onChangeInput=(e)=>{
        console.log();
        this.setState({
            할일: e.target.value
        })
        
    }

    onChnageId=(e)=>{
        console.log();
        this.setState({
            아이디:e.target.value
        })
    }

    onChangePW=(e)=>{
        console.log();
        this.setState({
            비밀번호: e.target.value
        })
    }

    onChangeName=(e)=>{
        console.log();
        this.setState({
            이름: e.target.value
        })
    }
    onChangeEmal=(e)=>{
        console.log();
        this.setState({
            이메일: e.target.value
        })
    }

    onChangeHp=(e)=>{
        console.log();
        this.setState({
            휴대폰번호: e.target.value
        })
    }

    onChangeHpOk=(e)=>{
        console.log();
        this.setState({
            인증번호확인: e.target.value

            
        })
    }

    onChangeTodoWrite=(e)=>{
        e.preventDefault();
        alert();
        this.setState({
            todoList:[
                ...this.state.todoList,
              {
                할일:this.state.할일
              }
            ],

        })
    }
        
    render() {
        return (
            <div id="wrap">
                <div id='todo'>
                <div className="container">
                    <div className="title">
                        <h1>회원가입</h1>
                       
                    </div>
                    <form name='todo' id='todo2' method='post' action="./todo.php">
                    <ul className="input-box">
                        <li>
                            <input onChange={this.onChangeInput} type="text" name='todo_w' id='todoW' placeholder='할일을 입력하세요' onChange={this.onChangeTodoWrite} value={this.setState.할일}/>
                        </li>
                        <li>
                            <input onChnage={this.onChnageId} type="text" name='user_id' id='userId' placeholder='아이디를 입력하세요' value={this.state.아이디} />
                        </li>
                        <li>
                            <input onChange={this.onChangePW} type="PW" name='user_pw' id='userPw' placeholder='비밀번호를 입력하세요' value={this.state.비밀번호}/>
                        </li>
                        <li>
                            <input onChange={this.onChangeName} type="text" name='user_name' id='userName' placeholder='이름을 입력하세요' value={this.state.이름}/>
                        </li>
                        <li>
                            <input onChange={this.onChangeEmal} type="email" name='user_email' id='userEmail' placeholder='이메일을 입력하세요'value={this.state.이메일}/>
                        </li>
                        <li>
                            <input onChange={this.onChangeHp} type="Number" name='user_hp' id='userHp' placeholder='휴대폰번호를 입력하세요'value={this.state.휴대폰번호}/>
                        </li>
                        <li>
                            <input onChange={this.onChangeHpOk} type="Number" name='user_hpOk' id='userHpOk' placeholder='인증번호 확인'value={this.state.인증번호}/>
                        </li>
                    </ul>
                    <div className="btn-box">
                        <button>배열 저장</button>
                    </div>
                    </form>
                </div>
            </div>

            </div>
            

            
        );
        
    }
}

export default WrapComponent;