<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>Request 내장객체 예제</title>
</head>
<body>
  <h2>학번, 이름, 학년, 선택과목을 등록하는 폼</h2>
  
    <form name="college_enrol" id="collegeEnrol" method="post" action="./J03_02_대학교_과목_등록_JSP_응답.jsp">
         <label>학번 : <input type="text" name="num"  placeholder="학변" required autofocus></label><br>
         <label>이름 : <input type="text" name="name" placeholder="이름" required autofocus></label><br>
         <br>
         학년 :
         <label><input type="radio" name="grade" value="1학년" checked  required autofocus>1학년&nbsp;</label>
         <label><input type="radio" name="grade" value="2학년">2학년&nbsp;</label>
         <label><input type="radio" name="grade" value="3학년">3학년&nbsp;</label>
         <label><input type="radio" name="grade" value="4학년">4학년</label><br>
         <br>
          
         <label>선택과목 :            
            <select name="subject"  required autofocus>
                <option value="JAVA">JAVA</option>
                <option value="JSP">JSP</option>
                <option value="PHP">PHP</option>
                <option value="AJAX">AJAX</option>
                <option value="NODE.JS">NODE.JS</option>
                <option value="REACT.JS">REACT.JS</option>
                <option value="VUE.JS">VUE.JS</option>
                <option value="SASS">SASS</option>
            </select>
         </label>
         <br><br><br>
         <input type="submit" value="입력완료">
    </form>
</body>
</html>