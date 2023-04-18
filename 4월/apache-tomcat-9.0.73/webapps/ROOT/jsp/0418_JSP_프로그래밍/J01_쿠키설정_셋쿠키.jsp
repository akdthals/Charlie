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
  <h1>쿠키 설정과 쿠키 삭제 하기(setCookie)</h1>
  <%
      // 1. 쿠키 설정(생성)하기 : 3개
      // Cookie newCookie = new Cookie("키(key)", "값(value)");

      // 첫번째쿠키
      Cookie newCookie1 = new Cookie("sungmin_cookie1", "첫번째쿠키값입니다");
      newCookie1.setPath("/");            // Path=/ 패스설정
      newCookie1.setMaxAge(60*60*24*1); // 1일 쿠키 설정
      response.addCookie(newCookie1);  // 쿠키 추가

      // 두번째쿠키
      Cookie newCookie2 = new Cookie("sungmin_cookie2", "두번째쿠키값입니다");
      newCookie2.setPath("/");  //path=/
      newCookie2.setMaxAge(60*60*24*3); // 3일
      response.addCookie(newCookie2); // 쿠키 추가

      // 세번째쿠키
      Cookie newCookie3 = new Cookie("sungmin_cookie3", "세번째쿠키값입니다");
      newCookie3.setPath("/");
      newCookie3.setMaxAge(60*60*24*7); // 일주일
      response.addCookie(newCookie3);


      ///////////////////////////////////////////////////////////////////////////
      // 쿠키 newCookie3 삭제하기
      // 만료일을 0으로 설정 하면 삭제가 된다.
      // 삭제가 된다.
      // 쿠키3 추가 되면 날짜 설정이(setMaxAge(0)) 0으므로 삭제 된다.

     // newCookie3.setMaxAge(0); 
      //response.addCookie(newCookie3); 

      //newCookie2.setMaxAge(0); 
      //response.addCookie(newCookie2); 

      //newCookie1.setMaxAge(0); 
      //response.addCookie(newCookie1); 
      

  %>
  
</body>
</html>