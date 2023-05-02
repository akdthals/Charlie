<%@ 
  page 
  language="java" 
  contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"
%>

<%  request.setCharacterEncoding("UTF-8"); %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>구구단 응답폼</title>
</head>
<body>
<div id="wrap">
    <%
        int sDan = Integer.parseInt(request.getParameter("user_sDan"));
        int eDan = Integer.parseInt(request.getParameter("user_eDan"));
        int arr[][] = new int[9][eDan-sDan+1];
        int col=-1;

       
    %>
    <table>
        <thead>
            <tr>
                <%
                    for(int i=sDan; i<=eDan; i++){
                        out.println("<th>" + i + "</th>");
                    }
                %>
            </tr>
        </thead>
        <tbody>
            <tr>
                <%
                    for(int i = 0; i < 9; i++){
                        col = -1;
                        for(int j = sdan; j <= edan; j++){
                        col++;
                        gugudan[i][col] = j * (i+1);
                        out.println("<td>" + j + " × " + (i+1) + " = " + gugudan[i][col] + "</td>");
                        }
                        out.println("</tr>");
                    }
                %>
            </tr>
        </tbody>
    </table>
</div>
    

    
</body>
</html>