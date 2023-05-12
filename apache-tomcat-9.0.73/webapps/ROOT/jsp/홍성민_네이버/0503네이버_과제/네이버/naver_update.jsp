<%@ 
    page 
    language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
%>

<%@ page import="naver.NaverDTO" %>
<%@ page import="naver.NaverDAO" %>
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
            if(session.getAttribute("id") != null){
                loginId = (String) session.getAttribute("id");
            }
            NaverDAO naverDAO = new NaverDAO();
            NaverDTO naverDTO = naverDAO.getJoin(loginId);
        %>
        <div class="title">
            <h1>회원정보수정</h1>
        </div>
        <a href="./naver_delete.jsp">회원삭제</a>
        <form name="signup" id="signup" method="post" action="naver_update_action.jsp">
            
            <label for="id" class="hide">
                아이디<br><input maxlength="16" autofocus required type="text" name="id" id="userId" placeholder="아이디를 입력 하세요" required autofocus>
            </label>
            <label for="pw">
                비밀번호<br><input maxlength="30" autofocus required type="text" name="pw" id="userPw" placeholder="비밀번호를 입력 하세요" required autofocus>
            </label>
            <label for="name">
                이름<br><input maxlength="30" autofocus required type="text" name="name" id="userName" placeholder="이름을 입력 하세요" required autofocus>
            </label>
            <label for="birth">
                생일<br><input  maxlength="9" autofocus required type="text" name="birth" id="userBirth" placeholder="생일을 입력 하세요" required autofocus>
            </label>
            <label for="gender">
                성별<br>
                <select autofocus required name="gender" id="gender" required autofocus>
                    <option value="" selected="성별">성별</option>
                    <option value="남자">남자</option>
                    <option value="여자">여자</option>
                    <option value="선택안함">선택안함</option>
                </select>
            </label>
            <label for="email">
                이메일<br><input type="text" name="email" id="userEmail" placeholder="이메일을 입력하세요"required autofocus> 
            </label>
            <label for="hp">
                휴대폰<br><input type="text" name="hp" id="userHp" placeholder="휴대폰번호를 입력하세요" required autofocus>
            </label>
            <button type="submit">수정하기</button>
        </form>
    </div>

    
</body>
</html>