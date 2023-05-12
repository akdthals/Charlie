<%@
    page
    language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
%>

<%@ page import="naver.NaverDAO" %>

<% request.setCharacterEncoding("UTF-8"); %>

<jsp:useBean id="naverDTO" class="naver.NaverDTO" scope="page"/>
<jsp:setProperty name="naverDTO" property="id"/>
<jsp:setProperty name="naverDTO" property="pw"/>
<jsp:setProperty name="naverDTO" property="name"/>
<jsp:setProperty name="naverDTO" property="birth"/>
<jsp:setProperty name="naverDTO" property="gender"/>
<jsp:setProperty name="naverDTO" property="email"/>
<jsp:setProperty name="naverDTO" property="hp"/>

<%
    if(
            naverDTO.getId()==null
        ||  naverDTO.getPw()==null
        ||  naverDTO.getName()==null
        ||  naverDTO.getBirth()==null
        ||  naverDTO.getGender()==null
        ||  naverDTO.getEmail()==null
        ||  naverDTO.getHp()==null
    ){
%>
<script>
    alert("모든 항목을 입력하세요!");
    history.back();
</script>
<%
    }
    else{
        NaverDAO naverDAO = new NaverDAO();
        int result = naverDAO.update(naverDTO);
       
%>
<% if(result == -1){ %>
<script>
    alert("회원정보 수정 실패");
    history.go(-1);
</script>
<%
        }
        else{
%>
<script>
    alert("회원정보 수정 완료"); 
    location.href="./naver_main.jsp";
</script>
<%
        }
    }
%>
