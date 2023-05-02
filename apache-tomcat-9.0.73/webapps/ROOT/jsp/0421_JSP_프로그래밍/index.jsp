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
    <title>회원가입 폼</title>
    <link rel="stylesheet" href="./css/style.css">

</head>
<body>

    <div id="wrap">
        <div class="top">
            <a href="">List</a>
        </div>
        <form autocomplete="off" name="signup" id="signup" method="post" action="signup_write.jsp">
            <table>
                <tr><td>아이디<input type="text" name="id" id="id" placeholder="아이디 입력" ></td></tr>
                <tr><td>비밀번호<input type="text" name="pw" id="pw" placeholder="비밀번호 입력" required autofocus></td></tr>
                <tr><td>
                    성별
                    <input class="ng" type="radio" name="gender" id="남자" required autofocus value="남자">남자
                    <input class="ng" type="radio" name="gender" id="여자" required autofocus value="여자">여자
                </td></tr>
            </table>
            <label for="userSearch">가입경로
                <select name="user_search" id="way">
                <option value="" selected>웹검색</option>
                <option value="웹검색">웹검색</option>
                <option value="지인">지인</option>
                <option value="소문">소문</option>
                <option value="전단지">전단지</option>
                </select>
            </label>
                <br>
            <label for="userArea">주소지
                <select name="user_area" id="addr" required autofocus>
                <option value="" selected>지역</option>
                <option value="서울">서울</option>
                <option value="경기">경기</option>
                <option value="인천">인천</option>
                <option value="기타">기타</option>
                </select>
            </label>
            <br>
            <label for="">메모<input type="text" name="userMemo" id="user_memo" placeholder="메모장">
            </label>
            <br>
            <button type="submit">가입</button>
        </form>
    </div>
    
</body>
</html>