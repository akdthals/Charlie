<%@
    page
    language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
%>

<%@ page import = "kurly.UserDAO" %>

<%  request.setCharacterEncoding("UTF-8");  %>

<jsp:useBean id="userDTO" class="kurly.UserDTO" />
<jsp:setProperty name="userDTO" property="user_id" />
<jsp:setProperty name="userDTO" property="user_pw" />

<%
    if(
           userDTO.getUser_id()==null
        || userDTO.getUser_pw()==null
    ){
%>
        <script>
            alert("빈값은 허용하지 않습니다. 확인하고 다시 시도해주세요");
            history.go(-1);
        </script>


<%   
    }
    else{
        UserDAO userDAO = new UserDAO();   
        int result = userDAO.delete(userDTO.getUser_id(), userDTO.getUser_pw());

         if(result>=1) {  
            %>
        <script>
            alert( "회원 탈퇴 되었습니다");
            window.location.href = "kurly_user_signup.jsp"
        </script>
        <% 
    }     
}
        %>
        
        
        
