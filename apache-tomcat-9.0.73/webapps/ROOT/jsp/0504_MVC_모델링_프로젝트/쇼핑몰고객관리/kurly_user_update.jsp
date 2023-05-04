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
    <title>회원정보수정</title>
    <link rel="stylesheet" href="./public/css/style.css">
</head>
<body>
<div id="wrap">
    <section id="signup">
        <div class="container">
            <div class="title">
                <h2>UPDATE</h2>
            </div>
            <div class="content">
                <a href="./kurly_user_signin.jsp">회원가입</a>
                <a href="./kurly_user_signup.jsp">로그인</a>
                <a href="./kurly_user_delete.jsp">삭제</a>
                <form name="update" autocomplete="off" id="update" method="post" action="./kurly_user_update_action.jsp">
                    <ul>
                        <li><input maxlength="16" autofocus required type="text" name="user_id" id="userId" placeholder="아이디를 입력하세요"></li>
                        <li><input maxlength="16" autofocus required type="password" name="user_pw" id="userPw" placeholder="수정 비밀번호를 입력하세요"></li>
                        <li><input maxlength="30" autofocus required type="text" name="user_name" id="userName" placeholder="수정 이름을 입력하세요"></li>
                        <li><input maxlength="250" autofocus required type="email" name="user_email" id="userEmail" placeholder="수정 이메일을 입력하세요"></li>
                        <li><input maxlength="13" autofocus required type="text" name="user_hp" id="userHp" placeholder="수정 휴대폰을 입력하세요"></li>
                        <li><input maxlength="250" autofocus required type="text" name="user_addr" id="userAddr" placeholder="수정 주소를 입력하세요"></li>
                        <li>
                            <input type="radio" name="user_gender" id="userMale"  value="남성">
                            <label for="userMale">남성</label>
                            <input type="radio" name="user_gender" id="userSheMale"  value="여성">
                            <label for="userSheMale">여성</label>
                            <input type="radio" name="user_gender" id="userNone"  value="선택안함">
                            <label for="userNone">선택안함</label>
                        </li>
                        <li><input maxlength="10" type="text" name="user_birth" id="userBirth" placeholder="수정 생년월일을 입력하세요"></li>
                    </ul>
                    <div class="submit">
                        <button type="submit">수정완료</button>
                    </div>
                </form>
            </div>
        </div>
    </section>
</div>

    
</body>
</html>