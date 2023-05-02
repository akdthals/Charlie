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
  <title>쿠키설정</title>
  <style>
    body{
      text-align: center;
    }
  </style>
</head>
<body>
  <h1>쿠키 설정 하기(setCookie)</h1>
  <%
      // 1. 쿠키 설정(생성)하기
      // Cookie newCookie = new Cookie("키(key)", "값(value)");
      Cookie newCookie = new Cookie("sungmin_cookie1", "첫번째쿠키값입니다");
      response.addCookie(newCookie);  // 쿠키 추가

      Cookie newCookie2 = new Cookie("sungmin_cookie2", "두번째쿠키값입니다");
      newCookie2.setPath("/");  //path=/
      response.addCookie(newCookie2); // 쿠키 추가

      Cookie newCookie3 = new Cookie("sungmin_cookie3", "세번째쿠키값입니다");
      newCookie3.setPath("/");
      response.addCookie(newCookie3);

      Cookie newCookie4 = new Cookie("sungmin_cookie4", "네번째쿠키값입니다");
      newCookie4.setPath("/");
      //newCookie4.setMaxAge()     // 만료일(Expires MaxAge) 60초 * 60분 * 24시간
      // newCookie4.setMaxAge()     // 만료일(Expires MaxAge) 60초 * 60분 * 24시간 
      // newCookie4.setMaxAge()     // 만료일(Expires MaxAge) 60초 * 60분 * 1시간
      // newCookie4.setMaxAge()     // 만료일(Expires MaxAge) 60초 * 60분 * 2시간
      // newCookie4.setMaxAge()     // 만료일(Expires MaxAge) 60초 * 60분 * 3시간
      // newCookie4.setMaxAge()     // 만료일(Expires MaxAge) 60초 * 60분 * 10시간
      // newCookie4.setMaxAge()     // 만료일(Expires MaxAge) 60초 * 60분 * 24시간 * 2
      // newCookie4.setMaxAge()     // 만료일(Expires MaxAge) 60초 * 60분 * 24시간 * 3
      // newCookie4.setMaxAge()     // 만료일(Expires MaxAge) 60초 * 60분 * 24시간 * 7
      // newCookie4.setMaxAge()     // 만료일(Expires MaxAge) 60초 * 60분 * 24시간 * 10
      // newCookie4.setMaxAge()     // 만료일(Expires MaxAge) 60초 * 60분 * 24시간 * 30
      // newCookie4.setMaxAge(60*60*24);
      newCookie4.setMaxAge(60*60*1);
      response.addCookie(newCookie4);

      Cookie newCookie5 = new Cookie("sungmin_cookie5", "다섯번째쿠키값입니다");
      newCookie5.setPath("/");
      response.addCookie(newCookie5);

      Cookie newCookie6 = new Cookie("sungmin_cookie6", "여섯번째쿠키값입니다");
      newCookie6.setPath("/");
      response.addCookie(newCookie6);

      Cookie newCookie7 = new Cookie("sungmin_cookie7", "일곱번째쿠키입니다");
      newCookie7.setPath("/");
      response.addCookie(newCookie7);

      Cookie newCookie8 = new Cookie("sungmin_cookie8", "여덟번째쿠키입니다");
      newCookie8.setPath("/");
      response.addCookie(newCookie8);

      Cookie newCookie9 = new Cookie("sugmin_cookie9", "아홉번째쿠키입니다");
      newCookie9.setPath("/");
      response.addCookie(newCookie9);

      Cookie newCookie10 = new Cookie("sungmin_cookie", "열번째쿠키입니다");
      newCookie9.setPath("/");
      response.addCookie(newCookie10);


  %>
  
</body>
</html>