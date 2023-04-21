<%@ 
    page 
    language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
%>

<%@    
    page
    import="java.sql.*"
%>

<%
    // 한글 인코딩
    request.setCharacterEncoding("UTF-8");  
%>
<%
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sm", "root", "1234");

    Statement st = conn.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM sm");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="./css/view.css">
</head>
<body>
    

    <div id="wrap">
        <div class="top">
            <a href="index.jsp">Write</a>
        </div>
        <table>
            <caption>회원가입 기록</caption>
            <thead>
                <tr>
                    <th>NO</th>
                    <th>Id</th>
                    <th>Pw</th>
                    <th>Gender</th>
                    <th>Way</th>
                    <th>Addr</th>
                    <th>Create_date</th>
                </tr>
            </thead>
            <tbody>
                <%
                    while(rs.next()){
                %>

                    <tr>
                        <td><%= rs.getString("idx") %></td>
                        <td><%= rs.getString("id") %></td>
                        <td><%= rs.getString("pw") %></td>
                        <td><%= rs.getString("gender") %></td>
                        <td><%= rs.getString("way") %></td>
                        <td><%= rs.getString("addr") %></td>
                        <td><%= rs.getDate("create_date") %></td>
                    </tr>

                <%
                    }
                %>
            </tbody>
        </table>
    </div>
</body>
</html>