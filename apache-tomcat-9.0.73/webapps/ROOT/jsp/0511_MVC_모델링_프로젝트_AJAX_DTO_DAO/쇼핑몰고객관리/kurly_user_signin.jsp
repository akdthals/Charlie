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
    <title>Document</title>
    <link rel="stylesheet" href="./public/css/style.css">
</head>
<body>
<div id="wrap">
    <section id="signup" class="signin">
        <div class="container">
            <div class="title">
                <h2>SIGNIN</h2>
            </div>
            <div class="content">
                <a href="./kurly_user_signup.jsp">회원가입</a>
                <a href="./kurly_user_update.jsp">회원수정</a>
                <a href="./kurly_user_delete.jsp">회원삭제</a>
                <form name="signin" autocomplete="off" id="signin" method="post" action="./kurly_user_signin_action.jsp">
                    <ul>
                        <li><input maxlength="16" autofocus required type="text" name="user_id" id="userId" placeholder="아이디를 입력하세요"></li>
                        <li><input maxlength="16" autofocus required type="password" name="user_pw" id="userPw" placeholder="비밀번호를 입력하세요"></li>
                    </ul>
                    <div class="submit">
                        <button type="submit">로그인하기</button>
                    </div>
                </form>
            </div>
        </div>
    </section>
</div>

    
</body>
</html>