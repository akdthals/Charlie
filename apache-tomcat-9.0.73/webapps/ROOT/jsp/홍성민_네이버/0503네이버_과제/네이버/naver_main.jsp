
<%@ 
page 
language="java" 
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"
%>

<%@ page import="naver.NaverDAO" %>
<%@ page import="naver.NaverDTO" %>
<%@ page import="java.util.*" %>

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
<section id="signup" class="main">
    <div class="container">
        <div class="title">
            <h2>메인 페이지</h2>
        </div>
        <%
            String loginId = null;
            if(session.getAttribute("id") != null){
                loginId = (String)session.getAttribute("id");
            }
            if(loginId == null){
        %>
        <div class="content">
            <ul>
                <li><a href="./naver_signin.jsp">로그인</a></li>
                <li><a href="./naver_insert.jsp">회원가입</a></li>
            </ul>
        </div>
        <%
            }
            else{
        %>
        <div class="content">
            <ul>
                <h2><%=loginId%>님 안녕하세요</h2>
                <li><a href="./naver_logout.jsp">로그아웃</a></a></li>
                <li><a href="./naver_update.jsp">개인정보수정</a></li>
                <li><a href="./naver_delete.jsp">회원탈퇴</a></li>
            </ul>
        </div>
        <%
            }
        %>
    </div>
    <div class="get-join-list">
        <table>
            <caption>회원 LIST 목록</caption>
            <tr>
                <th>아이디</th>
                <th>비밀번호</th>
                <th>이름</th>
                <th>생년월일</th>
                <th>성별</th>
                <th>이메일</th>
                <th>휴대폰번호</th>
            </tr>
<%
    NaverDAO naverDAO = new NaverDAO();
    List<NaverDTO> list = naverDAO.getJoinList();
    if(list.size() == 0){
        out.println("<script>alert('조회내역이 없습니다!')</script>");
    }
    for(NaverDTO dto : list){
%>
            <tr>
                <td><%=dto.getId() %></td>
                <td><%=dto.getPw() %></td>
                <td><%=dto.getName() %></td>
                <td><%=dto.getBirth() %></td>
                <td><%=dto.getGender() %></td>
                <td><%=dto.getEmail() %></td>
                <td><%=dto.getHp() %></td>
            </tr>
<%
    }
%>
        </table>
    </div>
</section>
</div>
</body>
</html>