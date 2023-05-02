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
  <h1>쿠키 가져오기(getCookie)</h1>
  <%
     // 쿠키 배열 처리
     // Cookie[] 쿠키 = 요청.겟쿠키스();
     Cookie[] cookies = request.getCookies(); // 여러개의 쿠키 가져오기

     // 만약 쿠키가 한개도 없다면(빈 값 null) 수행 안한다.
     // 쿠키가 1개라도 있다면 수행한다. (쿠키값이 널이 아니면)
     // Cookie newCookie = new Cookie("키(key)", "값(value)");
     // Cookie newCookie = new Cookie("sungmin_cookie1", "첫번째쿠키값입니다");
     // getName()=> 키 "키(key)" => "sungmin_cookie1"
     // getValue()=> 값 "값(value)" => "첫번째쿠키값입니다"
     if(cookies != null ){
        for(Cookie item : cookies){
            String cookieName = item.getName();  // 쿠키 키(KEY)이름 => 쿠키이름
            // 쿠키 이름(키 KEY) 검색 : "sungmin_cookie7"
            if( cookieName.equals("sungmin_cookie7") ){
                out.println("찾았다: " + "sungmin_cookie7 ==" + cookieName);
                out.println("쿠키 값 => " + "cookieValue");
            }
        }
     }
  %>
  

  
</body>
</html>