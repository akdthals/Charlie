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
  <title>쿠키설정과 삭제</title>
  <style>
    body{
      text-align: center;
    }
  </style>
</head>
<body>
  <h1>쿠키 가져오기</h1>
  <%
      // 1. 쿠키(요청) 가져오기(getCookies) 생성자 생성
      Cookie[] item = request.getCookies();

      for(int i=0; i < item.length; i++){
        // 조건문 sungmin_cookie3 검색
        if(item[i].getName().equals("sungmin_cookie3")){ // 검색 조건 "sungmin_cookie3"
            out.println("<h1 style='color:#39c;'>"+ item[i].getName() + " " + item[i].getValue() + "</h1>" );
        }
      }
      

  %>
  
</body>
</html>