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
    <title>TODO</title>
    <link rel="stylesheet" href="./css/style.css">


</head>
<body>
    <div id="wrap">
        <div class="top">
            <a href="">List</a>
        </div>
        <form autocomplete="off" name="todo" id="todo" method="post" action="todo_write.jsp">
            <table>
                <tr><th>TODO</th></tr>
                <tr><td><input type="text" name="name" id="name" placeholder="Write name"></td></tr>
                <tr><td><input type="text" name="hp" id="hp" placeholder="Write PhonNumber"></td></tr>
                <tr><td><input type="text" name="addr" id="addr" placeholder="Write address"></td></tr>
            </table>
            <button type="submit">저장</button>
        </form>
    </div>
    
</body>
</html>