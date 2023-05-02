

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
    <title>스타벅스 공지사항</title>

    <style>
        #main{ width: 100%;}
        #main .container{ width: 1100px; height: 100%; margin: 0 auto;}
        #main .container .gap{}
        #main .container .gap .title{ width: 100%; padding: 0 0 100px 0;  text-align: center;}
        #main .container .gap .title h2{ font-size: 36px;     font-weight: 700;   color: #000;}

        #main .container .gap .content{ justify-content: center;
                    align-items: center;}
        #main .container .gap .content table{ width: 100%;
                        border-collapse: collapse;
                        text-align: center; }
        #main .container .gap .content table thead{
            padding: 10px 0 0 0;
            border-top: 1px solid #000;
            border-bottom: 1px solid #000;
            padding: 17px 0;
            font-size: 15px;
            color: #222;
        }
        #main .container .gap .content table thead tr{
            padding: 10px 0 0 0;
            border-top: 1px solid #000;
            border-bottom: 1px solid #000;
            padding: 17px 0;
            font-size: 15px;
            color: #222;
        }
        #main .container .gap .content table thead tr th{
            padding: 10px 0 0 0;
            border-top: 1px solid #000;
            border-bottom: 1px solid #000;
            padding: 17px 0;
            font-size: 15px;
            color: #222;                    
        }
        #main .container .gap .content table tbody{

        }
        #main .container .gap .content table tbody tr{
            
        }
        #main .container .gap .content table tbody tr td{
            padding: 17px 0 17px 20px;
            border-top: 1px solid #f7f7f7;
            border-bottom: 1px solid #999;
            text-align: left;
            font-size: 15px;
            color: #666;   
        }



    </style>
</head>
<body>
    <h1>스타벅스 공지사항</h1>

    <div id='main'>
        <div class="container">
            <div class="gap">
                <div class="title">
                    <h2>공지사항</h2>
                </div>
                <div class="content">
                    <table>
                        <thead>
                            <tr>
                                <th>No</th>
                                <th>제목</th>
                                <th>날짜</th>
                                <th>조회수</th>
                            </tr>
    

                        </thead>
                        <tbody>

                                <%
                                    
                                    int[] num1 = {425, 424, 423, 422, 421, 420, 419, 418, 417, 416};
                                    String[] str = {"시스템 개선 및 서비스 점검 안내", "시스템 개선 및 서비스 점검 안내", "탄소중립포인트 인센티브 지급 기준 안내", "스타벅스 코리아 사칭 홈페이지 및 이메일 주의 안내", "Summer 시즌 사이렌 오더 음료 기본 설정 변경 안내", "시스템 개선 및 서비스 점검 안내", "탄소중립실천포인트제 도입 안내", "	영상정보처리기기 운영방침 / 위치정보 이용약관 / 개인정보처리방침 이용약관 개정 안내", "시스템 개선 및 서비스 점검 안내", "	설 연휴 스타벅스 딜리버스 운영 안내"};
                                    String[] str2 = { "	2023-04-04	", "2023-03-27	", "2023-03-23	", "2023-03-20	", "	2023-03-17", "	2023-02-17", "2023-02-02	", "	2023-02-02", "	2023-01-27	", "	2023-01-20	"};
                                    int[] num2 = { 1479, 1720, 25999,3705, 21037, 3377, 20653, 2135,1879, 9036};
                                    for(int i=0; i<num1.length; i++){
                                        out.println("<tr>" );
                                        out.println("<td>" + num1[i] + "</td>");
                                        out.println("<td>" + str[i] + "</td>");
                                        out.println("<td>" + str2[i] + "</td>");
                                        out.println("<td>" + num2[i] + "</td>");
                                        out.println("</tr>" );
                                    }
                            
                                 %>

                                
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>

<!--     
    


    <%
    for(int i=0; i<str.length; i++){
        out.println(str[i] + "<td>");
    }
    %>

    <%
        


    %>
    <%
    for(int i=0; i<str2.length; i++){
        out.println(str2[i] + "<td>");
    }
    %>

    <%
        


    %>

    <%
    for(int i=0; i<num2.length; i++){
        out.println(num2[i] +  "<th>" +"<td>");
    }
    %> -->


</body>
</html>