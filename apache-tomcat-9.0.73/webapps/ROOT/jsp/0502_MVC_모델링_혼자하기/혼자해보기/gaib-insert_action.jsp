<%@
  page
  language="java"
  contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"
%>

<%@ page import="gaib.GaibDAO" %>
<%@ page import="java.io.PrintWriter" %>

<% request.setCharacterEncoding("UTF-8"); %>

<jsp:useBean id="gaibDTO" class="gaib.GaibDTO" scope="page" />
<jsp:setProperty name="gaibDTO" property="user_id" />
<jsp:setProperty name="gaibDTO" property="user_pw" />
<jsp:setProperty name="gaibDTO" property="user_name" />
<jsp:setProperty name="gaibDTO" property="user_hp" />
<jsp:setProperty name="gaibDTO" property="user_email" />


  <%
    if( gaibDTO.getUser_id()==null     
        ||  gaibDTO.getUser_pw()==null     
        ||  gaibDTO.getUser_name()==null   
        ||  gaibDTO.getUser_hp()==null     
        ||  gaibDTO.getUser_email()==null 
    ){
        PrintWriter script = response.getWriter();
        script.println("<script>");
        script.println("alert('빈값이 있는 항목이 있습니다!\\n 확인하고 다시 시도해 주세요');");
        script.println("history.go(-1);");
        script.println("</script>");
    }
    else{
            GaibDAO gaibDAO = new GaibDAO();
            int result = gaibDAO.insert(gaibDTO);

            if(result==-1){
 %>
            <script>
                alert('잘못된 아이디 또는 중복된 아이디 입니다. \n 확인하고 다시 시도해 주세요');
                history.go(-1);
            </script>

 <%               
            }
            else{
%>
            <script>
                alert('회원가입 가입을 감사합니다.');
                window.location.href='./index.jsp';
            </script>

<%
            }
    }
    
  %>
  
</body>
</html>