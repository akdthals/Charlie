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
    <link rel="stylesheet" href="./css/style.css">
</head>
<body>

    <div id="wrap">
        <%
            String loginId = null;
            if(session.getAttribute("user_id") != null){
                loginId = (String) session.getAttribute("user_id");
            }
        %>


        <div class="title">
            <h1>NAVER</h1>
        </div>
        <a href="./naver_insert.jsp">회원가입</a>
        <a href="./naver_update.jsp">회원수정</a>
        <a href="./naver_signin.jsp">로그인</a>
        <form name="signup" id="signup" method="post" action="naver_delete_action.jsp">
            <label for="Id">
                아이디<br><input type="text" name="id" id="userId" placeholder="아이디를 입력 하세요" required autofocus>
            </label>
            <button type="submit">삭제하기</button>
        </form>
    </div>

    
</body>
</html>