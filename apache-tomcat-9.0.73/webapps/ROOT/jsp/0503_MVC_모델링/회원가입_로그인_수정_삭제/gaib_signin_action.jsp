
<%@ 
    page 
    language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
%>

<%@ page import = "gaib.GaibDAO" %>
<%@ page import = "java.io.PrintWriter" %>

<% 
    request.setCharacterEncoding("UTF-8"); 
%>    

<jsp:useBean id="gaibDTO"  class="gaib.GaibDTO" />
<jsp:setProperty name="gaibDTO"  property="user_id" />
<jsp:setProperty name="gaibDTO"  property="user_pw" />


<%
    if( 
           gaibDTO.getUser_id()==null
        || gaibDTO.getUser_pw()==null
    ){
%>
    <script>
        alert("빈값이 있는 항목이 \n확인하고 다시 시도해주세요");
        history.go(-1);
    </script>
<%
    }
    else{     

        GaibDAO  gaibDAO = new GaibDAO();
        int result = gaibDAO.signin( gaibDTO.getUser_id(),  gaibDTO.getUser_pw() );

        if(result == 1){
            // 로그인 성공입니다.
            PrintWriter script = response.getWriter();
            script.println("<script>alert('로그인 성공입니다.')</script>");
        }
        else if(result == 0){
            // 비밀번호 불일치합니다.
            PrintWriter script = response.getWriter();
            script.println("<script>alert('비밀번호 불일치합니다. 다시 입력하고 시도하세요'); </script>");            
        }
        else if(result == -1){
            // 검색 아이디가 없습니다.
            PrintWriter script = response.getWriter();
            script.println("<script>alert('검색 아이디가 없습니다. 회원가입후 다시 시도하세요.'); </script>");
        }        
        else if(result == -2){
            // 데이터베이이스의 알수 없는 오류 
            PrintWriter script = response.getWriter();
            script.println("<script>alert('데이터베이이스의 알수 없는 오류 확인후 다시 시도하세요 '); </script>");
        }

           
%>
 
     <script>
        alert("현재 리턴 값 상태 : "  + <%= result %> );        
     </script>  

<%
    }
%>

