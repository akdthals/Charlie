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
    <title>Document</title>
</head>
<body>


    <%!
        static String g (String str){
            return str;
        }


        static String ha(int[][] arr){
            String txt = "";
            int hap =0;
            txt += "<table>";
            for(int i=0; i<arr.length; i++){
                hap=0;
                for(int j=0; j<arr[i].length;j++){
                    hap+=arr[i][j];
                    txt +="<td>" + arr[i][j] + "</td>";
                }
                txt +="<tr><td>"  + " " + hap+ "</td></tr>";
            }
            txt += "</table>";

            return txt;
        }
    %>

    <%
    out.println("<h1>" + g("합")+ "</h1>");
    %>

    <%
       
            int[][] arr={
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
            };
            String txt= ha(arr);
            out.println(txt);
    %>
    
    <style>
        body{text-align: center;}
        table{width: auto ; margin: 0 auto; }
        table td{width: 10%; height: 40px ; text-align: center; border: 1px solid #ccc; font-size: 15px; color: #c33;}
    </style>


    
</body>
</html>