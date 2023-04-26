<%@
  page
  language="java"
  contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"
%>

<jsp:useBean id="newBeans" class="use_bean.Beans" scope="page"/>

<%
    newBeans.setUserId("cshong123");
    newBeans.setUserPw("cshong123");
    newBeans.setUserName("홍성민");
    newBeans.setUserHp("010-2764-6281");
    newBeans.setUserAddr("망원동");
%>






<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        body{
            text-align: center;
        }
    </style>
</head>
<body>

    <h1>자바(Java) 빈즈(Beans) UseBean DTO</h1>

    <hr>

    <h2><%=  newBeans.getUserId() %></h2>
    <h2><%=  newBeans.getUserPw() %></h2>
    <h2><%=  newBeans.getUserName() %></h2>
    <h2><%=  newBeans.getUserHp() %></h2>
    <h2><%=  newBeans.getUserAddr() %></h2>

</body>
</html>