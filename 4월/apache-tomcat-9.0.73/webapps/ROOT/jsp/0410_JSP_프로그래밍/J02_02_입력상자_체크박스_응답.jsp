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
    <title>관심있는 언어 과목 체크박스 응답페이지</title>


</head>
<body>
    
   <% 
        // 배열로 요청 받기
        // 이유는 체크박스는 여러개(다중) 선택하므로 배열에 저장한다.

        String name = request.getParameter("name");                 // 1개 값만 받는다
        String[] language = request.getParameterValues("language"); // 여러개 값받는다.
   
   %>


    <%
        out.println("<table>");

        out.println("<tr>");
            out.println("<th>" + name + "</th>");
        out.println("</tr>");

        out.println("<tr>");

        for(int i = 0; i < language.length; i++){    
            out.println("<td>" + language[i] + "</td>");
        }

        out.println("</tr>");            
        out.println("</table>");    
    %>



    <style>

        * {margin:0;padding:0;vertical-align: middle;box-sizing: border-box;}
        table {border-collapse: collapse;width:1000px;margin: 100px auto;}
        table th,td{border:1px solid #ddd;height: 50px;padding: 0 10px;}
        table th {background: #f0f0f0;}
        table td {text-align: center;}

    </style>



</body>
</html>