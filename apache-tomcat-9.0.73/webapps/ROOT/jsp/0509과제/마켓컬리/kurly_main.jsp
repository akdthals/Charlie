
<%@ 
page 
language="java" 
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"
%>

<%@ page import="java.util.*" %>
<%@ page import="kurly.*" %>


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
KurlyDAO kurlyDAO = new KurlyDAO();
List<KurlyDTO> list = kurlyDAO.getJoinList();
%>
<section id="signup" class="main">
    <div class="container">
        <div class="title">
            <h2>메인 페이지</h2>
        </div>
        <%
            String loginId = null;
            if(session.getAttribute("user_id") != null){
                loginId = (String)session.getAttribute("user_id");
            }
            if(loginId == null){
        %>
        <div class="content">
            <ul>
                <li><a href="./kurly_signin.jsp">로그인</a></li>
                <li><a href="./kurly_signup.jsp">회원가입</a></li>
            </ul>
        </div>
        <%
            }
            else{
        %>
        <div class="content">
            <ul>
                <h2><%=loginId%>님 안녕하세요</h2>
                <li><a href="./logout.jsp">로그아웃</a></li>
                <li><a href="./update.jsp">개인정보수정</a></li>
                <li><a href="./delete.jsp">회원탈퇴</a></li>
            </ul>
        </div>

    </div>
    <div class="get-join-list">
        <table>
            <tr>
                <th>아이디</th>
                <th>비밀번호</th>
                <th>이름</th>
                <th>이메일</th>
                <th>전화번호</th>
                <th>주소</th>
                <th>성별</th>
                <th>생년월일</th>
                <th>추가사항</th>
                <th>전체 동의</th>
            </tr>
            <tr>
<%
for(KurlyDTO item : list){
%>
                <td><%= item.getUser_id() %></td>
                <td><%= item.getUser_pw() %></td>
                <td><%= item.getUser_name() %></td>
                <td><%= item.getUser_email() %></td>
                <td><%= item.getUser_hp() %></td>
                <td><%= item.getUser_address() %></td>
                <td><%= item.getUser_gender() %></td>
                <td><%= item.getUser_birth() %></td>
                <td><%= item.getUser_add() %></td>
                <td><%= item.getUser_chk() %></td>
<%
}
%>
            </tr>
        </table>
    </div>
<%
}
%>
</section>
</div>
</body>
</html>