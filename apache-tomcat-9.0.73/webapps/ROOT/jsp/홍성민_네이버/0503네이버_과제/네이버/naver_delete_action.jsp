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

<%
    if(
            naverDTO.getId()==null
        ||  naverDTO.getPw()==null

    ){
%>
<script>
    alert("빈값 허용하지 않습니다 확인해 주세요");
    history.go(-1);
</script>
<%
    }
    else{
        NaverDAO naverDAO = new NaverDAO();
        int result = naverDAO.delete(naverDTO);
        if(result == -1){
%>
<%
        }
        else{
%>
<script>
    alert("회원탈퇴가 완료되었습니다");
    location.href="./naver_logout.jsp";
</script>
<%
    }
%>
