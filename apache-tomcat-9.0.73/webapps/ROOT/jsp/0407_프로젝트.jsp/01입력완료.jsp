<%@
  page
  language="java"
  contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"
%>
<% request.setCharacterEncoding("UTF-8"); %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>학번 이름 학년 과목 받는다</title>
  <style>
    table {width: 50%; margin: 0 auto; border-collapse: collapse;}
        th,td{border: 1px solid #ccc; height: 50px;}
        td { text-align: center;}
        thead tr th {color: aquamarine; background: #000;}
        
        
  </style>

</head>
<body>
    <div id="wrap">
        <%
            String student_number = request.getParameter("student_number");
            String student_name = request.getParameter("student_name");
            String student_grade = request.getParameter("student_grade");
            String student_subject = request.getParameter("student_subject");
        %>
    </div>
  
  <table>
    <thead>
        <tr>
            <th>학번</th>
            <th>이름</th>
            <th>학년</th>
            <th>과목</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td><%= student_number %></td>
            <td><%= student_name %></td>
            <td><%= student_grade %></td>
            <td><%= student_subject %></td>
        </tr>
    </tbody>
  </table>

</body>
</html>