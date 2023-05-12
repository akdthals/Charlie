<%@
    page
    language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
%>

<%@ page import="naver.NaverDAO" %>

<% request.setCharacterEncoding("UTF-8"); %>

<jsp:useBean id="naverDTO" class="naver.NaverDTO" />
<jsp:setProperty name="naverDTO" property="id"/>
<jsp:setProperty name="naverDTO" property="pw"/>

<%
    if(
            naverDTO.getId()==null
        ||  naverDTO.getPw()==null
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
        int result = naverDAO.insert(naverDTO);
        if(result == -1){
            session.setAttribute("id", naverDTO.getId() );
%>
<script>
    alert("로그인 되었습니다");
    location.href="./naver_main.jsp";
</script>
<%
        }
        else if(result==0){
%>
<script>
    alert("로그인 실패 했습니다. 비밀번호 다시 확인 바랍니다");
    history.back();
</script>
<%
        }
    else if(result==-1){
        %>
        <script>
            alert(<%= result %>)
            alert("로그인 실패 되었습니다. 아이디를 다시 확인");
            window.location.href="naver_signin.jsp";
        </script>
        <%
    }
    else if(result==-2){ %>
        <script>
            alert(<%=  result %>)
            alert("로그인 실패 되었습니다. 다시확인");
            history.go(-1);
        </script>
        <%
    }    
}   
        %>
    
