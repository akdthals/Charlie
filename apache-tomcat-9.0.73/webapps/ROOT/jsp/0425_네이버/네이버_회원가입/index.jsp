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
        <div class="title">
            <h1>NAVER</h1>
        </div>
        <form name="signup" id="signup" method="post" action="naver_view.jsp">
            <label for="Id">
                아이디<br><input type="text" name="id" id="userId" placeholder="아이디를 입력 하세요" required autofocus>
            </label>
            <label for="Pw">
                비밀번호<br><input type="text" name="pw" id="userPw" placeholder="비밀번호를 입력 하세요" required autofocus>
            </label>
            <label for="Name">
                이름<br><input type="text" name="name" id="userName" placeholder="이름을 입력 하세요" required autofocus>
            </label>
            <label for="Birth">
                생일<br><input type="text" name="birth" id="userBirth" placeholder="생일을 입력 하세요" required autofocus>
            </label>
            <label for="gender">
                성별<br>
                <select name="gender" id="gender" required autofocus>
                    <option value="" selected="성별">성별</option>
                    <option value="남자">남자</option>
                    <option value="여자">여자</option>
                    <option value="선택안함">선택안함</option>
                </select>
            </label>
            <label for="email">
                이메일<br><input type="text" name="user_email" id="userEmail" placeholder="이메일을 입력하세요"required autofocus> 
            </label>
            <label for="hp">
                휴대폰<br><input type="text" name="user_hp" id="userHp" placeholder="휴대폰번호를 입력하세요" required autofocus>
            </label>
            <button type="submit">가입하기</button>
        </form>
    </div>

    
</body>
</html>