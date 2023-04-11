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
    <title>마켓컬리</title>

    <style>
        * {margin:0;padding:0;vertical-align: middle;box-sizing: border-box;}
        ul {list-style: none;}

        #wrap {width:100%;}
        #wrap #header {
            width:100%;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100px;
            background: #333;
        }
        #wrap #header a {
            margin:0 10px;
            color:#fff;
            font-size: 16px;
            text-decoration: none;   
            font-weight: 500;         
        }
        #wrap #header a:hover {
            text-decoration: underline;
        }
        #wrap #main {width:100%;}
        #wrap #main #section1 {width:100%;height: 100vh;background: #cc9;display: flex;align-items: center;justify-content: center;color:#fff;font-size: 100px;text-transform: uppercase;}
        #wrap #main #section2 {width:100%;height: 100vh;background: #c9c;display: flex;align-items: center;justify-content: center;color:#fff;font-size: 100px;text-transform: uppercase;}
        #wrap #main #section3 {width:100%;height: 100vh;background: #9c9;display: flex;align-items: center;justify-content: center;color:#fff;font-size: 100px;text-transform: uppercase;}
        #wrap #main #section4 {width:100%;height: 100vh;background: #99c;display: flex;align-items: center;justify-content: center;color:#fff;font-size: 100px;text-transform: uppercase;}
        #wrap #main #section5 {width:100%;height: 100vh;background: #c9c;display: flex;align-items: center;justify-content: center;color:#fff;font-size: 100px;text-transform: uppercase;}

        #wrap #footer {width:100%;height: 300px;background: #444;}


    </style>


</head>
<body>
<div id="wrap">
    
  

    <%
        String  selectPage = request.getParameter("pageChange"); 

        // selectPage 값이 빈값이면  null 이면
        if(selectPage==null){
            selectPage = "./main_page.jsp";
        }
    %>

<jsp:include page="./header.jsp" flush="false"/>
<jsp:include page="<%= selectPage %>" flush="false"/>
<jsp:include page="./footer.jsp" flush="false"/>





  
</div>  



<script>
    ((parameter)=>{
 
        let result = parameter.currentEntry.url.toString().split("=");
        let result2 = parameter.currentEntry.url.toString().indexOf("=");
        let result3 = parameter.currentEntry.url.toString().substr(parameter.toString().indexOf("=")+1);

        
        console.log( parameter );
        console.log( parameter.currentEntry.url );
        console.log( result[0] );
        console.log( result[1] ); // 값
        console.log( result3 );

})(window.navigation);


</script>
</body>
</html>