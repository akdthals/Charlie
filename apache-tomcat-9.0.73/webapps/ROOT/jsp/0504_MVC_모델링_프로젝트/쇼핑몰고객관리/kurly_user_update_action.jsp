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
<jsp:setProperty name="userDTO" property="user_name" />
<jsp:setProperty name="userDTO" property="user_email" />
<jsp:setProperty name="userDTO" property="user_hp" />
<jsp:setProperty name="userDTO" property="user_addr" />
<jsp:setProperty name="userDTO" property="user_gender" />
<jsp:setProperty name="userDTO" property="user_birth" />

<%
    if(
        userDTO.getUser_id()==null
        || userDTO.getUser_pw()==null
        || userDTO.getUser_name()==null
        || userDTO.getUser_email()==null
        || userDTO.getUser_hp()==null
        || userDTO.getUser_addr()==null
        || userDTO.getUser_gender()==null
        || userDTO.getUser_birth()==null
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
        int result = userDAO.update(userDTO);
%>
        <% if(result==1){  %>
        <script>
            alert("회원정보 수정 되었습니다.");
            history.go(-1);
        </script>
        <% }
        
    else{
    %>
        <script>
            alert("회원정보 수정 실패");
            history.go(-1);
        </script>


        <%
        }
        %>
<%
    }

%>