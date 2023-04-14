<%@ 
    page 
    language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
%>

<% request.setCharacterEncoding("utf-8");%>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        table{
            width: 1000px; 
            margin: 0 auto;
            border-collapse: collapse;
        }
        table th,td{
            border: 1px solid #ccc;
            text-align: center;
        }
    </style>


</head>
<body>
    <% 
    

    String user_id = request.getParameter("user_id");                 // 1개 값만 받는다
    String user_pw = request.getParameter("user_pw");                 // 1개 값만 받는다
    String user_pw_ok = request.getParameter("user_pw_ok");                 // 1개 값만 받는다
    String user_name = request.getParameter("user_name");                 // 1개 값만 받는다
    String user_email = request.getParameter("user_email");                 // 1개 값만 받는다
    String user_hp = request.getParameter("user_hp");                 // 1개 값만 받는다
    String user_addr = request.getParameter("user_addr");                 // 1개 값만 받는다
    String men = request.getParameter("men");                 // 1개 값만 받는다
    String user_birth = request.getParameter("user_birth");                 // 1개 값만 받는다
    String add_more = request.getParameter("add_more");                 // 1개 값만 받는다
    String[] user_agree = request.getParameterValues("user_agree");                 // 1개 값만 받는다
    

%>
<%
    String result ="";
    result += "<p>아이디: " + user_id + "</p>";
    result += "<p>비번: " + user_pw + "</p>";
    result += "<p>비밀번호확인: " + user_pw_ok + "</p>";
    result += "<p>이름: " + user_name + "</p>";
    result += "<p>이메일: " + user_email + "</p>";
    result += "<p>휴대폰: " + user_hp + "</p>";
    result += "<p>주소: " + user_addr + "</p>";
    result += "<p>성별: " + men + "</p>";
    result += "<p>생년월일: " + user_birth + "</p>";
    result += "<p>추가입력사항: " + add_more + "</p>";
    result += "<p>약관동의: " + user_agree + "</p>";


    out.println(result);

%>
<table>
    <thead>
        <tr>
            <td>아이디</td>
            <td>비밀번호</td>
            <td>비밀번호확인</td>
            <td>이름</td>
            <td>이메일</td>
            <td>휴대폰</td>
            <td>주소</td>
            <td>성별</td>
            <td>생년월일</td>
            <td>추가입력사항</td>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td><%= user_id %></td>
            <td><%= user_pw %></td>
            <td><%= user_pw_ok %></td>
            <td><%= user_name %></td>
            <td><%= user_email %></td>
            <td><%= user_hp %></td>
            <td><%= user_addr %></td>
            <td><%= men %></td>
            <td><%= user_birth %></td>
            <td><%= add_more %></td>
        </tr>
        <tr>
            <th>이용약관동의</th>
        </tr>
        <tr>
            <%
                for(int i=0; i<user_agree.length; i++){
                    out.print("<td>" + user_agree[i] + "</td>" );
                }
            %>
        </tr>
    </tbody>
</table>
    
</body>
</html>