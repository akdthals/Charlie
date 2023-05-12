<%@
  page
  language="java"
  contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>회원가입</title>
    <link rel="stylesheet" href="./css/style.css">

</head>
<body>

    <div id="wrap">



        <section id="section1">
            <div className="container">
                <div className="gap">
                    <div className="title">
                        <h2>회원가입</h2>

                        <p><span><i>*</i>필수입력사항</span></p>
                    </div>
                    <div className="content">
                        <form  name="signup_form" id="signUpForm" method="post" action="./update_action.jsp">
                            <ul>
                                <li>
                                    <div>
                                        <label htmlFor="userId">아이디<i>*</i></label>
                                        <div className="center-box">
                                            <input 
                                                type="text" 
                                                maxLength={16} 
                                                name="user_id" 
                                                id="userId" 
                                                placeholder="아이디를 입력해주세요" 
                            
                                            />
                                        </div>
                                    </div>
                                    
                                    
                                </li>
                                <li>
                                    <div>
                                        <label htmlFor="userPw1">비밀번호<i>*</i></label>
                                        <div className="center-box">
                                            <input 
                                                type="password"  
                                                maxLength={16} 
                                                name="user_pw" 
                                                id="userPw1" 
                                                placeholder="비밀번호를 입력해주세요" 
                                            />
                                        </div>
                                    </div>
                                </li>
                                <li>
                                    <div>
                                        <label htmlFor="userPw2">비밀번호확인<i>*</i></label>
                                        <div className="center-box">
                                            <input 
                                                type="password"  
                                                maxLength={16} 
                                                name="user_pw" 
                                                id="userPw2" 
                                                placeholder="비밀번호를 한번 더 입력해주세요" 
                                            />
                                        </div>
                                    </div>
                                </li>
                                <li>
                                    <div>
                                        <label htmlFor="userName">이름<i>*</i></label>
                                        <div className="center-box">
                                            <input 
                                                type="text" 
                                                name="user_name" 
                                                id="userName" 
                                                placeholder="이름을 입력해주세요" 
                                            />
                                        </div>
                                    </div>
                                </li>
                                <li>
                                    <div>
                                        <label htmlFor="userEmail">이메일<i>*</i></label>
                                        <div className="center-box">
                                            <input 
                                                type="email" 
                                                name="user_email" 
                                                id="userEmail" 
                                                placeholder="이메일을 입력해주세요" 
                                            />
                                        </div>
                                        <button  
                                            type="button"
                                        >중복확인</button>
                                    </div>
                                </li>
                                <li>
                                    <div>
                                        <label htmlFor="userHp">휴대폰<i>*</i></label>
                                        <div className="center-box">
                                            <input 
                                                type="text"  
                                                maxLength={11} 
                                                name="user_hp" 
                                                id="userHp" 
                                                placeholder="숫자만 입력해주세요" 
                                            />
                                        </div>
                                        <button  type="button">인증번호 받기</button>
                                        <button type="button">번호 인증</button>
                                    </div>
                                </li>

                                <li>
                                    <div>
                                        <label htmlFor="userAddress1">주소<i>*</i></label>
                                        <div className="center-box"> 
                                            <input 
                                                type="text" 
                                                name="user_address" 
                                                id="userAddress1" 
                                                placeholder="주소 입력" 
                                            <h5>샛별배송</h5>
                                            <h6>배송지에 따라 상품 정보가 달라질 수 있습니다.</h6>
                                            />
                                        </div>
                                    
                                        <button 
                                            type="button"
                                        >재검색</button>
                                    </div>
                                </li>                                 
                                <li>
                                    <div>
                                        <label>성별</label>
                                        <div className="center-box gender">
                                            <label><input type="radio" name="user_gender" id="userMale" value="남자" />남자</label>
                                            <label><input type="radio" name="user_gender" id="userFemale" value="여자"  />여자</label>
                                            <label><input type="radio" name="user_gender" id="userNone" value="선택안함" />선택안함</label>
                                        </div>                                            
                                    </div>
                                </li>

                                <li>
                                <div>
                                        <label>생년월일</label>
                                        <div className="center-box birth">
                                            <div className="birth-box">
                                                <ul>
                                                    <li>
                                                        <input 
                                                            type="text" 
                                                            maxLength={4} 
                                                            name="user_birth" 
                                                            id="userBirth" 
                                                            placeholder="YYYY"
                                                        /></li>
                                                    <li><i>/</i></li>
                                                    <li>
                                                        <input 
                                                            type="text" 
                                                            maxLength={2} 
                                                            name="user_birth" 
                                                            id="userBirth>" 
                                                            placeholder="MM" 
                                                            onChange={onChangeMonth}
                                                            value={state.생월}
                                                        /></li>
                                                    <li><i>/</i></li>
                                                    <li>
                                                        <input 
                                                            type="text" 
                                                            maxLength={2} 
                                                            name="user_birth" 
                                                            id="userBirth" 
                                                            placeholder="DD" 
                                                        /></li>
                                                </ul>
                                            </div>
                                        </div>                                      
                                    </div>
                                </li>    

                                <li>
                                        <label>추가입력사항<i>*</i>
                                            <input type="radio" name="user_add" id="userAdd" value="친구초대 추천인 아이디">친구초대 추천인 아이디
                                            <input type="radio" name="user_add" id="userAdd" value="참여 이벤트명">참여 이벤트명
                                            <h6>가입 후 7일 내 첫 주문 배송완료 시, 친구초대 이벤트 적립금이 지급됩니다.</h6>
                                            <h6>
                                                추천인 아이디와 참여 이벤트명 중 하나만 선택 가능합니다.<br/>
                                                가입 이후는 수정이 불가능 합니다.<br/>
                                                대소문자 및 띄어쓰기에 유의해주세요.
                                            </h6>
                                        </label>
                                </li>
                                <li>
                                    <label>이용약관동의<i>*</i>
                                        <input type="checkbox" name="user_chk" id="chk1" value="전체 동의합니다.">전체 동의합니다.                                            
                                        <h5>선택항목에 동의하지 않은 경우도 회원가입 및 일반적인 서비스를 이용할 수 있습니다.</h5>
                                        <input type="checkbox" name="user_chk" id="chk2" value="이용약관 동의.">이용약관 동의  
                                        <input type="checkbox" name="user_chk" id="chk3" value="개인정보 수집∙이용 동의.">개인정보 수집∙이용 동의 
                                        <input type="checkbox" name="user_chk" id="chk4" value="무료배송, 할인쿠폰 등 혜택/정보 수신 동의">무료배송, 할인쿠폰 등 혜택/정보 수신 동의
                                        <h6>동의 시 한 달간 [5%적립] + [2만원 이상 무료배송] 첫 주문 후 안내</h6>
                                        <input type="checkbox" name="user_chk" id="chk5" value="본인은 만 14세 이상입니다.(필수)">본인은 만 14세 이상입니다.(필수)
                                    </label>
                                <li>
                                    <button type="submit">수정완료</button>
                                </li>
                            </ul>
                        </form>
                    </div>
                </div>
            </div>
        </section>
    </div>
    
</body>
</html>