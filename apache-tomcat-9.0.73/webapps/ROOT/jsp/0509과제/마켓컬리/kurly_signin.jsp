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
                        <h2>로그인</h2>

                        <p><span><i>*</i>필수입력사항</span></p>
                    </div>
                    <div className="content">
                        <form  name="signup_form" id="signUpForm" method="post" action="./kurly_signin_action.jsp">
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
                                    <button type="submit">로그인</button>
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