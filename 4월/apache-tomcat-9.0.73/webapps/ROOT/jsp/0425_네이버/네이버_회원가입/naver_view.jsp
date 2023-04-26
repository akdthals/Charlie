<%@
    page
    language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
%>

<% 
    request.setCharacterEncoding("UTF-8");
%>

<jsp:useBean id="newNaver" class="Naver.Naver_signup" scope="page"/>
<jsp:setProperty property="id" name="newNaver"/>
<jsp:setProperty property="pw" name="newNaver"/>
<jsp:setProperty property="name" name="newNaver"/>
<jsp:setProperty property="birth" name="newNaver"/>
<jsp:setProperty property="gender" name="newNaver"/>
<jsp:setProperty property="email" name="newNaver"/>
<jsp:setProperty property="hp" name="newNaver"/>

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
        <table>
            <thead>
                <tr>
                    <th>NO</th>
                    <th>Id</th>
                    <th>Pw</th>
                    <th>Name</th>
                    <th>Birth</th>
                    <th>Gender</th>
                    <th>Email</th>
                    <th>Hh</th>
                    <th>Create_date</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>
                        <%= newNaver.getId() %>
                    </td>
                    <td>
                        <%= newNaver.getPw() %>
                    </td>
                    <td>
                        <%= newNaver.getName() %>
                    </td>
                    <td>
                        <%= newNaver.getBirth() %>
                    </td>
                    <td>
                        <%= newNaver.getGender() %>
                    </td>
                    <td>
                        <%= newNaver.getEmail() %>
                    </td>
                    <td>
                        <%= newNaver.getHp() %>
                    </td>
                </tr>

            </tbody>
        </table>
    </div>
    
</body>
</html>
