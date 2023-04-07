<%@
    page
    language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
%>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>학번 이름 학년 과목</title>
    <style>
        #wrap{width: 100%;}
        #wrap form {width: 100%; }
        #wrap form label { display: flex; justify-content: center; padding: 10px 0;}
        #wrap form input { display: block; }
        #wrap form input[type=radio] {display: flex;}
    </style>

</head>
<body>
    <div id="wrap">
        <form name="student" id="done" method="post" action="./01입력완료.jsp" >
            <label for="studentNumber"><input type="text" name="student_number" id="studentNumber" placeholder="학번을 입력하세요" required autofocus></label>
            <label for="studentName"><input type="text" name="student_name" id="studentName" placeholder="이름을 입력하세요" required autofocus></label>
            <label><input type="radio" name="student_grade" id="stdentGrade" value="1학년">1학년</label>
            <label><input type="radio" name="student_grade" id="stdentGrade" value="2학년">2학년</label>
            <label><input type="radio" name="student_grade" id="stdentGrade" value="3학년">3학년</label>
            <label><input type="radio" name="student_grade" id="stdentGrade" value="4학년">4학년</label>
            <label for="studentSubject">
                <select name="student_subject" id="studentSubject" required autofocus>
                    <option value="" selected>과목을 선택하세요</option>
                    <option value="국어">국어</option>
                    <option value="영어">영어</option>
                    <option value="수학">수학</option>
                    <option value="미술">미술</option>
                    <option value="체육">체육</option>
                </select>
            </label>
            <label for=""><input type="submit" value="입력완료"></label>
        </form>
    </div>
    


    
</body>
</html>