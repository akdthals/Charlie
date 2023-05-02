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
    <title>Response Page</title>


</head>
<body>
    
    <%

    String name = request.getParameter("name");
    int kor     = Integer.parseInt( request.getParameter("kor") );
    int eng     = Integer.parseInt( request.getParameter("eng") );
    int mat     = Integer.parseInt( request.getParameter("mat") );
    int sum     = kor + eng + mat;
    double avg  = sum / 3.0;

    %>

    <%
        out.println("<table>");
        out.println("<tr>");
        out.println("<td>" +  String.format("국어 %3d", kor) + "</td>");
        out.println("<td>" +  String.format("영어 %3d", eng) + "</td>");
        out.println("<td>" +  String.format("수학 %3d", mat) + "</td>");
        out.println("<td>" +  String.format("총점 %3d", sum) + "</td>");
        out.println("<td>" +  String.format("평균 %3.2f", avg) + "</td>");
        out.println("</tr>");            
        out.println("</table>");    
    %>



    <style>

        * {margin:0;padding:0;vertical-align: middle;box-sizing: border-box;}
        table {border-collapse: collapse;width:600px;margin: 100px auto;}
        table th,td{border:1px solid #ddd;height: 50px;}
        table th {background: #f0f0f0;}
        table td {text-align: center;}

    </style>

</body>
</html>